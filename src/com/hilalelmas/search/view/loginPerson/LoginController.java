package com.hilalelmas.search.view.loginPerson;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    public TextField tfUserName;
    public TextField tfPassword;
    public Label lblerror;

    public void login(ActionEvent actionEvent) throws IOException {

        if (tfUserName.getText().equals("admin") && tfPassword.getText().equals("1234")) {
            Parent root = FXMLLoader.load(getClass().getResource("../resources/resource.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Resources");
            stage.setScene(new Scene(root));
            stage.show();
        } else
            lblerror.setText("Username or password is false !!");
    }
}
