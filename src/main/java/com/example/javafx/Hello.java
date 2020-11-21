package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Hello extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("hello.fxml"));
        try {
            Parent content = loader.load();
            Scene scene = new Scene(content, 1280, 720);
            primaryStage.setScene(scene);
        } catch(IOException exception){
            throw new RuntimeException(exception);
        }

        primaryStage.setTitle("Sample App");
        primaryStage.show();
    }
}