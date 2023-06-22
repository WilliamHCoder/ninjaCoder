/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author williamhernandezleon
 */
public class Escena02Controller {

    /**
     * Initializes the controller class.
     */
     //Variables de los elementos de la interfaz
    public TextField nickname2;    
    public String nombreLabel;
    
    void crearJugador(String nombre, Jugador jugador){
        jugador.setNickname(nombre);
        jugador.setColorOjos(0);
        jugador.setTonoPiel(0);
    }
    
    @FXML
    private void switchToEscena1() throws IOException {
        App.setRoot("escena01");
    }
    
    @FXML
    private void switchToEscena3() throws IOException {
        String nombre = nickname2.getText();
        Jugador jugador = new Jugador(nombre,0,0);
        crearJugador(nombre, jugador);
        if (jugador.getNickname()==nombre && jugador.getNickname()!=""){
            App.setRoot("escena03");
        } else {
            App.setRoot("escena02");
        }
    }
    
}
