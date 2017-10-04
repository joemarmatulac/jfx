package com.mycompany.javafxhack;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Application extends javafx.application.Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/img/jaricn/appicn24.ico")));
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/img/jaricn/appicn32.ico")));
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/img/jaricn/appicn64.ico")));
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/img/jaricn/appicn128.ico")));
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/img/jaricn/appicn256.ico")));
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/img/jaricn/appicn512.ico")));
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/img/jaricn/appicn16.ico")));

        FXMLLoader root = new FXMLLoader();
        AnchorPane pane = root.load(getClass().getResource("/fxml/login2.fxml"));
        Scene scene = new Scene(pane);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

//    private Stage stage;
//    private Stage loginStage;
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        this.stage = primaryStage;
//        mainWindow();
//    }
//
//    private void mainWindow() {
//        try {
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/splash.fxml"));
//            AnchorPane pane = loader.load();
//            SplashScreenController controller = loader.getController();
//            controller.main(stage, this);
//            Scene scene = new Scene(pane);
//            scene.getStylesheets().add("/styles/splash.css");
//            stage.initStyle(StageStyle.UNDECORATED);
//            stage.setScene(scene);
//            stage.show();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public void closeStage() {
//        stage.close();
//        try {
//            login();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void login() throws java.io.IOException {
//        this.loginStage = new Stage();
//        FXMLLoader root = new FXMLLoader(getClass().getResource("/fxml/login.fxml"));
//        AnchorPane pane = root.load();
//        Scene scene = new Scene(pane);
//        scene.getStylesheets().add("/styles/login.css");
//        loginStage.setTitle("JavaFX and Maven");
//        loginStage.setScene(scene);
//        loginStage.show();
//    }
}
