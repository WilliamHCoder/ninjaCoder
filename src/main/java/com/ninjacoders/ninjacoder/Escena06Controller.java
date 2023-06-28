/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import com.ninjacoders.ninjacoder.App;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Escena06 - ¡Mision exitosa!
 *
 * @author williamhernandezleon
 * | Controlador que muestra si el jugador cumplio el puntaje minimo y la mision fue exitosa.
 */
public class Escena06Controller {
    public Escena05aController mision1 = new Escena05aController();
    public Mision1 mision11 = new Mision1();
    public Escena02Controller escena02 = new Escena02Controller();
    public Label nickname6, puntajeAnt6, puntajeMision6, puntajeFinal6;

    /**Método que carga los datos de puntaje de la mision**/
    @FXML
    protected void initialize() {
        nickname6.setText(escena02.jugAct.getNickname().toString()+":");
        if (mision11.getMisionId()==1){
            puntajeAnt6.setText(mision1.mision.getPuntAnterior().toString());
            puntajeMision6.setText(mision1.mision.getPuntMision().toString());
            puntajeFinal6.setText(mision1.mision.getPuntFinal().toString());
        }
    }
    
    @FXML
    private void switchToEscena() throws IOException {
        if (mision11.getMisionId()==1){
            App.setRoot("escena05a");
        } else {
            App.setRoot("escena04");
        }
    }
    
    @FXML
    private void switchToEscena4() throws IOException {
        App.setRoot("escena04");
    }
        
    
}   
