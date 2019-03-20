package Abdullahs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class Main extends Application {

    Stage window;
    Scene home, venue

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        primaryStage.setScene(new Scene(root, 1000, 700));
        primaryStage.setTitle("Hello World");
        primaryStage.show();

        public void newsceneButton = 0 (ActionEvent Object event ) throw IOException{
            Parent newRoot = FXMLLoader.load(getClass().getResource("scene1Controller.fxml"));
            window homewindow =newsceneButton.getScene().getwindow();
            homewindow.getScene.setRoot(newRoot);
        }


    }


    public static void main(String[] args) {
        launch(args);
    }
}
