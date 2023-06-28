/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import java.io.IOException;
import javafx.fxml.FXML;

import com.ninjacoders.ninjacoder.App;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author williamhernandezleon
 */
public class Escena05bController {

    /**
     * Initializes the controller class.
     */
    @FXML
    public Label tiempo5b;
    public Button jhgfdsdfgh;
    public TextField textCadena, textCadena1;
    public Button btnGanaTemp5b;
    public Button btnPierdeTemp5b;
    public Button btnIniciar5b;
    public ImageView pers5b_1_1, pers5b_1_2, pers5b_1_3, pers5b_2_1, pers5b_2_2, pers5b_2_3, pers5b_3_1, pers5b_3_2, pers5b_3_3;
    public ImageView ok1;
    public ImageView noOk1;
    public ImageView ok11;
    public ImageView noOk11;
    private Button btnAtrasE05b;
    public Escena02Controller escena02 = new Escena02Controller();  
    

    // se pasan caracterizticas elegidas por el jugador 
    @FXML
    protected void initialize(){
        
        escena02.cargarImgPersonaje(escena02.jugAct.getColorOjos(), escena02.jugAct.getTonoPiel(), pers5b_1_1, pers5b_1_2, pers5b_1_3, pers5b_2_1,
                pers5b_2_2, pers5b_2_3, pers5b_3_1, pers5b_3_2, pers5b_3_3);
        
    }
  //se inicia el juego el temporizador 
       
    @FXML
    void iniciarJuego(ActionEvent event) {
        btnIniciar5b.setVisible(false);
        Mision mision = new Mision(15);
        boolean activo = mision.getJuegoActivo();
    //se crea  la lista y se brinda la palabra aleatoria a memorizar    
        mision.temporizador(tiempo5b, textCadena1);
         List<String> listAleatoria = new ArrayList<String> ();
        
        listAleatoria.add("jose");
        listAleatoria.add("pedro");
        listAleatoria.add("mariana");
        listAleatoria.add("juan");
        
        int aleatoria = (int) (Math.random() * 4);
        
        
        textCadena1.setText(listAleatoria.get(aleatoria));
        
        String cadena = textCadena.getText();
        
        
        
     // se crea la condicion de comparacion       
        
        for(int i=0;   i<listAleatoria.size(); i++);
        
        if (listAleatoria.get(aleatoria).equals(cadena)){
            textCadena1.setText("vas bien");
            textCadena1.setVisible(true);
            return;
             }else{
      
        
        }
    
        }
    
    @FXML
    private void switchToEscena06() throws IOException {
        App.setRoot("escena06");
    }
    
    @FXML
    private void switchToEscena07() throws IOException {
        App.setRoot("escena07");
    }
        
    @FXML
    private void switchToEscena4() throws IOException {
        App.setRoot("escena04");
    }

     // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

}
