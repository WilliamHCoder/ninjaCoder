/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import com.ninjacoders.ninjacoder.App;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
/**
 * FXML Controller class
 *
 * @author williamhernandezleon
 */
public class Escena05aController {

    /**
     * Initializes the controller class.
     */
    
    //Variables de los elementos de la interfaz
    @FXML
    private Label tiempo5a;
    public TextField linea1CincoA;
    public TextField linea2CincoA;
    public TextField linea3CincoA;
    public TextField linea4CincoA;
    public TextField linea5CincoA;
    public TextField linea6CincoA;     
    public Button btnIniciar5a;
    public String linea1Jugador;
    public String linea2Jugador;
    public String linea3Jugador;
    public String linea4Jugador;
    public String linea5Jugador;
    public String linea6Jugador;

    //Inicializa la misión, incluyendo el temporizador
    @FXML
    void iniciarJuego(ActionEvent event) {
        btnIniciar5a.setVisible(false);
        Mision mision = new Mision(60);
        mision.temporizador(tiempo5a);
        Mision1 coding = new Mision1(1,linea1CincoA,0,0, mision.getJuegoActivo());
        coding.habilitarInput(linea1CincoA, true, true);
        mision.addTextLimit(linea1CincoA, 20); 
        guardarLinea(linea1Jugador, linea1CincoA, linea2CincoA);
        guardarLinea(linea2Jugador, linea2CincoA, linea3CincoA);
        guardarLinea(linea3Jugador, linea3CincoA, linea4CincoA);
        guardarLinea(linea4Jugador, linea4CincoA, linea5CincoA);
        guardarLinea(linea5Jugador, linea5CincoA, linea6CincoA);
        guardarLinea(linea6Jugador, linea6CincoA, linea6CincoA);
    } 
    
    //Aplica los diferentes algoritmos al texto ingresado por el jugador
    @FXML
    void guardarLinea( String lineaSave, TextField lineaAct, TextField lineaSig){
        Mision mision = new Mision(60);
        Mision1 coding = new Mision1(1,lineaAct,0,0, true);
        lineaAct.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.ENTER) { 
            //Validamos la linea y el dato a guardar
            if (lineaSave == linea1Jugador){
                linea1Jugador = lineaAct.getText();
                linea1CincoA.setText(linea1Jugador);
                linea1CincoA.setEditable(false);
            } else if (lineaSave == linea2Jugador){
                linea2Jugador = lineaAct.getText();
                linea2CincoA.setText(linea2Jugador);
                linea2CincoA.setEditable(false);
            } else if (lineaSave == linea3Jugador){
                linea3Jugador = lineaAct.getText();
                linea3CincoA.setText(linea3Jugador);
                linea3CincoA.setEditable(false);
            } else if (lineaSave == linea4Jugador){
                linea4Jugador = lineaAct.getText();
                linea4CincoA.setText(linea4Jugador);
                linea4CincoA.setEditable(false);
            } else if (lineaSave == linea5Jugador){
                linea5Jugador = lineaAct.getText();
                linea5CincoA.setText(linea5Jugador);
                linea5CincoA.setEditable(false);
            } else if (lineaSave == linea6Jugador){
                linea6Jugador = lineaAct.getText();
                linea6CincoA.setText(linea6Jugador);
                linea6CincoA.setEditable(false);
            }
            coding.habilitarInput(lineaAct, true, true);
            if (lineaAct == lineaSig){
                coding.habilitarInput(lineaSig, false, false);
            } else {
                coding.habilitarInput(lineaSig, true, true);
            }
        }
        });
    }
    
    //Métodos para los botones 
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
    
}   
