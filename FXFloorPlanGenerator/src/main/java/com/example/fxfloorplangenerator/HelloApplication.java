package com.example.fxfloorplangenerator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FXForBSPLayout.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 800 , 600);
        } catch (IOException e) {
            System.out.println("Not loading");
        }
        stage.setTitle("Title");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}