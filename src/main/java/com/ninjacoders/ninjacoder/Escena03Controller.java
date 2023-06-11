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
public class Escena03Controller {

    /**
     * Initializes the controller class.
     */
    @FXML
    private void switchToEscena2() throws IOException {
        App.setRoot("escena02");
    }
    
    @FXML
    private void switchToEscena4() throws IOException {
        App.setRoot("escena01");
    }
    
}
