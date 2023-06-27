/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

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
    public ImageView personaje_1_1, personaje_1_2, personaje_1_3, personaje_2_1, personaje_2_2, personaje_2_3, personaje_3_1, personaje_3_2, personaje_3_3;
    public Escena02Controller escena02 = new Escena02Controller();
    @FXML
    protected void initialize() {        
        nickname3.setText(escena02.jugAct.getNickname()+"!"); //Carga el nombre ingresado y lo muestra
        //Carga el los colores de piel y ojos seleccionados y actualiza la imagen de acuerdo a ellos
        escena02.cargarImgPersonaje(escena02.jugAct.getTonoPiel(), escena02.jugAct.getColorOjos(), personaje_1_1, personaje_1_2, personaje_1_3, personaje_2_1, personaje_2_2, personaje_2_3, personaje_3_1, personaje_3_2, personaje_3_3);
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
