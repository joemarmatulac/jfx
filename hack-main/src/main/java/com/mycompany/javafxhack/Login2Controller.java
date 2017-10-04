package com.mycompany.javafxhack;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * @author Ma <joemar.matulac@safesat.com.ph>
 * @version 0.1
 * @Since 04/10/2017.
 */
public class Login2Controller{

    @FXML private Label close;


    public void handleOnclose(){
        System.exit(0);
    }
}
