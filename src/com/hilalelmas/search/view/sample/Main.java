package com.hilalelmas.search.view.sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Image image = new Image(new FileInputStream(
                "D:\\project\\apps\\javafx\\search\\src\\com\\hilalelmas\\search\\view\\sample\\image.png"));
        ImageView iv = new ImageView(image);
        iv.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                // iv.setImage(null);
                try {
                    primaryStage.close();
                    newStage();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
        Scene scene = new Scene(new Group(iv));
        iv.fitHeightProperty().bind(scene.heightProperty());
        iv.fitWidthProperty().bind(scene.widthProperty());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Cultural resources");
        primaryStage.show();

    }

    public void newStage() throws IOException {
        Stage primaryStage=new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

