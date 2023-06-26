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
 * FXML Controller class
 *
 * @author williamhernandezleon
 */
public class Escena07Controller {
    public Escena05aController mision1 = new Escena05aController();
    public Mision1 mision11 = new Mision1();
    public Escena02Controller escena02 = new Escena02Controller();
    public Label nickname7, puntajeAnt7, puntajeMision7, puntajeFinal7;

    @FXML
    protected void initialize() {
        nickname7.setText(escena02.jugAct.getNickname().toString()+":");
        if (mision11.getMisionId()==1){
            puntajeAnt7.setText(mision1.mision.getPuntAnterior().toString());
            puntajeMision7.setText(mision1.mision.getPuntMision().toString());
            puntajeFinal7.setText(mision1.mision.getPuntFinal().toString());
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
