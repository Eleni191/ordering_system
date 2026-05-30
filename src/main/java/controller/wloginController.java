package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import database.DBconnection;
import javafx.stage.Stage;


import javax.swing.*;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class wloginController {

    @FXML
    private TextField user1;

    @FXML
    private PasswordField pass1;

    @FXML
    private Label messageLabel;
@FXML
private void handlesign(){
        JOptionPane.showMessageDialog(null, "Login successfully");
}
    @FXML
    private void openSignup(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/signup.fxml"));

        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));

        stage.show();
    }
    @FXML
    private void handlewLogin() {
        System.out.println("button clicked");
        String username = user1.getText();
        String password = pass1.getText();

        try {
            Connection conn = DBconnection.getConnection();

            String sql = "SELECT * FROM waiter  WHERE username=? AND password=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login successfully");
            } else {
                messageLabel.setText("Invalid login");
            }

        } catch (Exception e) {
            e.printStackTrace();
            messageLabel.setText("DB Error");
        }
    }
}