/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Escena04 - Escoger la misión que se quiere jugar
 *
 * @author williamhernandezleon
 * | Controlador para la escena04 - Seleccion de mision.
 */
public class Escena04Controller {

    @FXML
    private Button btnAtrasE04;
    private Button btnMision1;
    private Button btnMision2;
    private Button btnMision3;

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
