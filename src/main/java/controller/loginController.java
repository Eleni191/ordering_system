package controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import database.DBconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class loginController {

    @FXML
    private TextField user;

    @FXML
    private PasswordField pass;

    @FXML
    private Label messageLabel;

    @FXML
    private void handleLogin() {

        String username = user.getText();
        String password = pass.getText();

        try {
            Connection conn = DBconnection.getConnection();

            String sql = "SELECT * FROM manager WHERE username=? AND password=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                messageLabel.setText("Login Success (Manager)");
            } else {
                messageLabel.setText("Invalid login");
            }

        } catch (Exception e) {
            e.printStackTrace();
            messageLabel.setText("DB Error");
        }
    }
}