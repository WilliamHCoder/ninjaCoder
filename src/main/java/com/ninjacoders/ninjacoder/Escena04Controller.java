/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 * FXML Controller class
 *
 * @author williamhernandezleon
 */
public class Escena04Controller {

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
