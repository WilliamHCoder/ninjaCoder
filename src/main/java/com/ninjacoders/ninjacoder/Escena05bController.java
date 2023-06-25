/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import java.io.IOException;
import javafx.fxml.FXML;

import com.ninjacoders.ninjacoder.App;
import java.io.IOException;
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
    ;
   
    @FXML
    public Button btnGanaTemp5b;
    @FXML
    public Button btnPierdeTemp5b;
    @FXML
    public Button btnIniciar5b;
    @FXML
    public ImageView pers5b_1_1, pers5b_1_2, pers5b_1_3, pers5b_2_1, pers5b_2_2, pers5b_2_3, pers5b_3_1, pers5b_3_3;

    @FXML
    public ImageView ok1;
    @FXML
    public ImageView noOk1;
    @FXML
    public ImageView ok11;
    @FXML
    public ImageView noOk11;
    @FXML
    private Button btnAtrasE05b;

    @FXML
    private ImageView pers5b_3_2;
    
    
    /*
    se inicializa el juego  con el temporizador 
    
    
    */

    @FXML
    void iniciarJuego(ActionEvent event) {
        btnIniciar5b.setVisible(false);
        Mision mision = new Mision(5);
        boolean activo = mision.getJuegoActivo();
       
        mision.temporizador(tiempo5b, textCadena1, textCadena1, textCadena1, textCadena1, textCadena1, textCadena1);
        
        
 
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
