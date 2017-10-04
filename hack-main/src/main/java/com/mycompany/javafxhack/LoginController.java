package com.mycompany.javafxhack;

import com.jfoenix.controls.JFXProgressBar;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.util.Duration;

public class LoginController {
    @FXML private JFXTextField jtxt;
    @FXML private JFXProgressBar progressBar;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws InterruptedException {
        System.out.println("You clicked me!");
        jtxt.setText("You got me lover.");
        showProgressBar();
    }

    public void showProgressBar(){
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(progressBar.progressProperty(), 0), new KeyValue(progressBar.progressProperty(), 0)),
                new KeyFrame(Duration.seconds(2), new KeyValue(progressBar.progressProperty(), 1), new KeyValue(progressBar.progressProperty(), 1)));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}
