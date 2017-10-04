package com.mycompany.javafxhack;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Application extends javafx.application.Application{

    private Stage stage;
    private Stage loginStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        mainWindow();
    }

    private void mainWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/splash.fxml"));
            AnchorPane pane = loader.load();
            SplashScreenController controller = loader.getController();
            controller.main(stage, this);
            Scene scene = new Scene(pane);
            scene.getStylesheets().add("/styles/splash.css");
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void closeStage() {
        stage.close();
        try {
            login();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void login() throws java.io.IOException {
        this.loginStage = new Stage();
        FXMLLoader root = new FXMLLoader(getClass().getResource("/fxml/login.fxml"));
        AnchorPane pane = root.load();
        Scene scene = new Scene(pane);
        scene.getStylesheets().add("/styles/login.css");
        loginStage.setTitle("JavaFX and Maven");
        loginStage.setScene(scene);
        loginStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
