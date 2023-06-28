/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 * Escena01 - Escena inicial
 *
 * @author williamhernandezleon
 * | Controlador de la escena01 en donde se presenta logo y se inicia el juego.
 */
public class Escena01Controller {

    /**
     * Initializes the controller class.
     */
    @FXML
    private void switchToEscena2() throws IOException {
        App.setRoot("escena02");
    }
    
  
    
}
