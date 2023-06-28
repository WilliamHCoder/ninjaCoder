/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author williamhernandezleon
 */
public class Escena04Controller {

    @FXML
    private Button btnAtrasE04;
    @FXML
    private Button btnMision1;
    @FXML
    private Button btnMision2;
    @FXML
    private Button btnMision3;

    /**
     * Initializes the controller class.
     */
    @FXML
    private void switchToEscena3() throws IOException {
        App.setRoot("escena03");
    }
    
    @FXML
    private void switchToEscena5a() throws IOException {
        App.setRoot("escena05a");
    }
    
    @FXML
    private void switchToEscena5b() throws IOException {
        App.setRoot("escena05b");
    }
    
    @FXML
    private void switchToEscena5c() throws IOException {
        App.setRoot("escena05c");
    }
    
}
