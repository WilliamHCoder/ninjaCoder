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
 * Escena02 - Escoger caracteristicas del personaje
 *
 * @author williamhernandezleon
 * | Controlador para la escena02 en donde se escogen las características del personaje y nickname.
 */

public class Escena02Controller{

     //Variables de los elementos de la interfaz
    public TextField nickname2;    
    public String nombreLabel;
    public Button piel1, piel2, piel3, ojos1, ojos2, ojos3;
    public static Jugador jugAct = new Jugador("", 0, 0, 0);

    //Seleccion de tonos de piel
    @FXML
    void selColorPiel1(ActionEvent event) {
        selColorGen(piel1, piel2, piel3);
        jugAct.setTonoPiel(1); 
    }

    @FXML
    void selColorPiel2(ActionEvent event) {
        selColorGen(piel2, piel1, piel3);
        jugAct.setTonoPiel(2); 
    }
    
    @FXML
    void selColorPiel3(ActionEvent event) {
        selColorGen(piel3, piel1, piel2);
        jugAct.setTonoPiel(3); 
    }
    
    //Seleccion de tonos de ojos
    @FXML
    void selColorOjos1(ActionEvent event) {
        selColorGen(ojos1, ojos2, ojos3);
        jugAct.setColorOjos(1); 
    }

    @FXML
    void selColorOjos2(ActionEvent event) {
        selColorGen(ojos2, ojos1, ojos3);
        jugAct.setColorOjos(2); 
    }
    
    @FXML
    void selColorOjos3(ActionEvent event) {
        selColorGen(ojos3, ojos1, ojos2);
        jugAct.setColorOjos(3); 
    }
    
    /**Método para modificar opacidad de los botones no seleccionados**/
    public void selColorGen(Button btnPrinc, Button btnSec, Button btnTerc){
        btnPrinc.setOpacity(1);
        btnSec.setOpacity(0.3);
        btnTerc.setOpacity(0.3);
    }
    
    /**Método para cargar el personaje en las siguientes escenas**/
    public void cargarImgPersonaje(int piel, int ojos, ImageView imagen1, ImageView imagen2, ImageView imagen3, ImageView imagen4, ImageView imagen5, ImageView imagen6, ImageView imagen7, ImageView imagen8, ImageView imagen9 ){
        if (piel==1 && ojos==1){
            imagen1.setVisible(true);
        } else if (piel==1 && ojos==2) {
            imagen2.setVisible(true);
        } else if (piel==1 && ojos==3) {
            imagen3.setVisible(true);
        } else if (piel==2 && ojos==1) {
            imagen4.setVisible(true);
        } else if (piel==2 && ojos==2) {
            imagen5.setVisible(true);
        } else if (piel==2 && ojos==3) {
            imagen6.setVisible(true);
        } else if (piel==3 && ojos==1) {
            imagen7.setVisible(true);
        } else if (piel==3 && ojos==2) {
            imagen8.setVisible(true);
        } else if (piel==3 && ojos==3) {
            imagen9.setVisible(true);
        }
    }
    
    @FXML
    private void switchToEscena1() throws IOException {
        App.setRoot("escena01");
    }
    
    /**Carga la siguiente escena y guardar el nickname ingresado**/    
    @FXML
    private void switchToEscena3() throws IOException {
        String nombre = nickname2.getText();
        jugAct.setNickname(nombre);
        App.setRoot("escena03");
        if (jugAct.getNickname()==nombre && jugAct.getNickname()!=""){
            App.setRoot("escena03");
        } else {
            App.setRoot("escena02");
        }
    }
    
}
