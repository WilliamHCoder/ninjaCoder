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
 * @author williamhernandezleon|juanestebanvelazquezmorera|piteralexanderbenavides
 * | Controlador que muestra si el jugador cumplio el puntaje minimo y la mision fue exitosa.
 */
public class Escena06Controller {
    public Mision mision = new Mision();
    public Escena02Controller escena02 = new Escena02Controller();
    public Label nickname6, puntajeAnt6, puntajeMision6, puntajeFinal6;

    /**Método que carga los datos de puntaje de la mision**/
    @FXML
    protected void initialize() {
        nickname6.setText(escena02.jugAct.getNickname().toString()+":");
        puntajeAnt6.setText(mision.getPuntAnterior().toString());
        puntajeMision6.setText(mision.getPuntMision().toString());
        puntajeFinal6.setText(mision.getPuntFinal().toString());
    }
    
    @FXML
    private void switchToEscena() throws IOException {
        if (null!=mision.getMisionId())switch (mision.getMisionId()) {
            case 1:
                App.setRoot("escena05a");
                break;
            case 2:
                App.setRoot("escena05b");
                break;
            case 3:
                App.setRoot("escena05c");
                break;
            default:
                break;
        }
    }
    
    @FXML
    private void switchToEscena4() throws IOException {
        App.setRoot("escena04");
    }
        
    
}   
