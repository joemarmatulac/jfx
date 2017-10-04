package com.mycompany.javafxhack;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class SplashScreenController implements Initializable  {
    @FXML private Label logoLabel;
    @FXML private Pane spinnerPane;
    @FXML private AnchorPane rootPane;
    @FXML private Label helloLabel;
    @FXML private Label nameLabel;
    private Application application;
    private Stage stage;

    public void main(Stage stage,Application application){
        this.application = application;
        this.stage=stage;
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TranslateTransition logoTranslate = new TranslateTransition(Duration.seconds(0.5), logoLabel);
        logoTranslate.setByY(700);
        logoTranslate.play();

        TranslateTransition nameTranslate = new TranslateTransition(Duration.seconds(0.5), nameLabel);
        nameTranslate.setByY(700);
        nameTranslate.play();

        TranslateTransition helloTranslate = new TranslateTransition(Duration.seconds(0.5), helloLabel);
        helloTranslate.setByY(700);
        helloTranslate.play();

        logoOnFinished(logoTranslate);
    }

    private void logoOnFinished(TranslateTransition logoTranslate) {
        logoTranslate.setOnFinished(event -> {
            TranslateTransition playLogo = new TranslateTransition(Duration.seconds(1), logoLabel);
            playLogo.setByY(-700);
            playLogo.play();
            playLogo.setOnFinished(logoEvent -> {
                playLogoOnfinishedEvent();
            });
        });
    }

    private void playLogoOnfinishedEvent() {
        nameLabel.setVisible(true);
        TranslateTransition playName = new TranslateTransition(Duration.seconds(1), nameLabel);
        playName.setByY(-700);
        playName.play();
        playName.setOnFinished(nameEvent -> {
            helloLabel.setVisible(true);
            TranslateTransition playHello = new TranslateTransition(Duration.seconds(1), helloLabel);
            playHello.setByY(-700);
            playHello.play();
            playHello.setOnFinished(helloEvent -> {
                playHelloOnFinishedEvent();

            });
        });
    }

    private void playHelloOnFinishedEvent() {
        spinnerPane.setVisible(true);
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), spinnerPane);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);
        fadeTransition.play();
        fadeTransition.setOnFinished(fadeEvent -> {
                    FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(4), rootPane);
                    fadeTransition1.setFromValue(1);
                    fadeTransition1.setToValue(0.1);
                    fadeTransition1.play();
                    fadeTransition1.setOnFinished(event5 -> {
                        application.closeStage();
                    });
                }
        );
    }
}
