/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

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
    public Button piel1;
    public ImageView piel2, piel3, ojos1, ojos2, ojos3;
    
    void crearJugador(String nombre, Jugador jugador){
        jugador.setNickname(nombre);
        jugador.setColorOjos(0);
        jugador.setTonoPiel(0);
    }
    
    //Seleccion de tonos de piel
    @FXML
    void selColorPiel(ActionEvent event) {
        System.out.println("Piel 1 seleccionada");
        piel1.setOpacity(1);
        piel2.setOpacity(0.5);
        piel3.setOpacity(0.5);
//        Jugador.setTonoPiel(1);
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
