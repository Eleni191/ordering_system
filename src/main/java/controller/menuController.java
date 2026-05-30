package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import database.DBconnection;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


import javax.swing.*;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class menuController {
    @FXML
    private FlowPane content;

    @FXML
    private void openBurger() throws IOException {

        Parent root = FXMLLoader.load(
                getClass().getResource("/fxml/burger.fxml")
        );

        content.getChildren().setAll(root);
    }
    @FXML
    private void opendrink() throws IOException {

        Parent root = FXMLLoader.load(
                getClass().getResource("/fxml/drinks.fxml")
        );

        content.getChildren().setAll(root);
    }
    @FXML
    private void opendessert() throws IOException {

        Parent root = FXMLLoader.load(
                getClass().getResource("/fxml/dessert.fxml")
        );

        content.getChildren().setAll(root);
    }
    @FXML
    private void openWaiterLogin(ActionEvent event)
            throws IOException {

        Parent root = FXMLLoader.load(
                getClass().getResource("/fxml/wlogin.fxml")
        );

        Stage stage = (Stage)((Node)event.getSource())
                .getScene()
                .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
}