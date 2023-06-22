/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author williamhernandezleon
 */
public class Escena03Controller {
    
    /**
     * Initializes the controller class.
     */
    
    public Label nickname3;

    @FXML
    protected void initialize() {
//        Jugador jugador = new Jugador(nickname, );
//        nickname3.setText(jugador.getNickname());  
        System.out.println("");
    }
    
    @FXML
    private void switchToEscena2() throws IOException {
        App.setRoot("escena02");
    }
    
    @FXML
    private void switchToEscena4() throws IOException {
        App.setRoot("escena04");
    }
    
}
