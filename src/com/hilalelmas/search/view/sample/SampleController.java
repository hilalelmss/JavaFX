package com.hilalelmas.search.view.sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SampleController {


    public Button btnLogin;
    public Button btnSignup;

    public void login(ActionEvent actionEvent) throws IOException {
        System.out.println("but");
        Parent root = null;
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Stage stage = new Stage();
        //stage.setTitle("Login");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void signUp(ActionEvent actionEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(getClass().getResource("person.fxml"));
        Stage stage = new Stage();
        //  stage.setTitle("Resources");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
