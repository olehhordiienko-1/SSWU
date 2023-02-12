package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage myStage) {
        myStage.setTitle("Hello world!");
        FlowPane rootNode = new FlowPane();

        Scene scene = new Scene(rootNode, 300, 200);
        myStage.setScene(scene);

        Label myLabel = new Label("This is a Java FX label.");
        rootNode.getChildren().add(myLabel);
        myStage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}