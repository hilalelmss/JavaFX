package com.hilalelmas.search.view.sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class SampleController {


    public Label lblsample;
    public Button btnLogin;
    public  Button btnSignup;

    public void login(ActionEvent actionEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(getClass().getResource("../loginPerson/Login.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Login");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void signUp(ActionEvent actionEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(getClass().getResource("../addPerson/person.fxml"));
        Stage stage = new Stage();
         stage.setTitle("Person");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
