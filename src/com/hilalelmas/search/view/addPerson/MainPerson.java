package com.hilalelmas.search.view.addPerson;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.LocalDate;

public class MainPerson extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("person.fxml"));
        primaryStage.setTitle("Add Person");
        primaryStage.setScene(new Scene(root));

        DatePicker datePicker = new DatePicker();
        datePicker.setValue(LocalDate.now());
        VBox vbox = new VBox(20);
        vbox.getChildren().add(datePicker);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
