package dao.daoimp;

import dao.orderdao;
import database.DBconnection;
import model.order;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class orderImp  implements orderdao {
    public boolean addOrder(order o){
        String sql="INSERT INTO orders(type,total,date) VALUES(?,?,?)";

        try(Connection con= DBconnection.getConnection();
            PreparedStatement ps =con.prepareStatement(sql)){
            ps.setString(1, o.getType());
            ps.setDouble(2, o.getTotal());
            ps.setString(3, o.getDate());
            int rows=ps.executeUpdate();
            return rows> 0;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public order searchorderbyID(int id) {

        String sql ="SELECT * FROM orders WHERE id=?";


        try(Connection con= DBconnection.getConnection();
            PreparedStatement ps =con.prepareStatement(sql)){

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                order o= new order();
                o.setOid(rs.getInt("order_id"));
                o.setCid(rs.getInt("CID"));
                o.setWid(rs.getInt("wid"));
                o.setType(rs.getString("type"));
                o.settotal(rs.getDouble("total_amount"));
              o.setDate(rs.getString("order_date"));

                return o;
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
