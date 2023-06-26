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
import javafx.scene.image.ImageView;
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
    private Label tiempo5a, puntaje5a;
    public TextField linea1CincoA, linea2CincoA, linea3CincoA, linea4CincoA, linea5CincoA, linea6CincoA;
    public Button btnIniciar5a;
    public String linea1Jugador, linea2Jugador, linea3Jugador, linea4Jugador, linea5Jugador, linea6Jugador;
    public ImageView ok1, noOk1, ok2, noOk2, ok3, noOk3, ok4, noOk4, ok5, noOk5, ok6, noOk6;
    public Integer minusc=0, mayusc=0, numeros=0, espacios=0, otros=0;
    public static Integer puntajeMision1 = 0;
    public Integer minuscCond=4, mayuscCond=4, numerosCond=5, espaciosCond=0, otrosCond=7;
    public Boolean juegoTerminado = false;
    public ImageView pers5a_1_1, pers5a_1_2, pers5a_1_3, pers5a_2_1, pers5a_2_2, pers5a_2_3, pers5a_3_1, pers5a_3_2, pers5a_3_3;
    public Escena02Controller escena02 = new Escena02Controller();    
    public Mision mision = new Mision(15); ////// OJO CAMBIAR A 60 OJOJOJOJOJOJOJOJOJOJOJOJOJOJ
    public Mision1 coding = new Mision1();
    
    @FXML
    protected void initialize() {
        //Carga el los colores de piel y ojos seleccionados y actualiza la imagen de acuerdo a ellos
        escena02.cargarImgPersonaje(escena02.jugAct.getTonoPiel(), escena02.jugAct.getColorOjos(), pers5a_1_1, pers5a_1_2, pers5a_1_3, pers5a_2_1, pers5a_2_2, pers5a_2_3, pers5a_3_1, pers5a_3_2, pers5a_3_3);
    }    
    
    //Inicializa la misión, incluyendo el temporizador
    @FXML
    void iniciarJuego(ActionEvent event) {
        btnIniciar5a.setVisible(false);
        mision.setJuegoActivo(true);
        mision.setPuntAnterior(escena02.jugAct.getPuntuacion());
        puntajeMision1 = 0;
        mision.setPuntMision(0);
        mision.setPuntFinal(0);
        coding.setMisionId(1);
        mision.temporizadorMision1(tiempo5a, linea1CincoA, linea2CincoA, linea3CincoA, linea4CincoA, linea5CincoA, linea6CincoA, escena02, mision);
        coding.habilitarInput(linea1CincoA, true);
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
//        boolean activo = mision.getJuegoActivo();
        lineaAct.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.ENTER) { 
            mision.addTextLimit(lineaSig, 20); 
            //Validamos la linea y el dato a guardar
            if (lineaSave == linea1Jugador){        
                linea1Jugador = lineaAct.getText();
                validarLinea(linea1Jugador, linea1CincoA,ok1, noOk1);
            } else if (lineaSave == linea2Jugador){
                linea2Jugador = lineaAct.getText();
                validarLinea(linea2Jugador, linea2CincoA, ok2, noOk2);
            } else if (lineaSave == linea3Jugador){
                linea3Jugador = lineaAct.getText();
                validarLinea(linea3Jugador, linea3CincoA, ok3, noOk3);
            } else if (lineaSave == linea4Jugador){
                linea4Jugador = lineaAct.getText();
                validarLinea(linea4Jugador, linea4CincoA, ok4, noOk4);
            } else if (lineaSave == linea5Jugador){
                linea5Jugador = lineaAct.getText();
                validarLinea(linea5Jugador, linea5CincoA, ok5, noOk5);
            } else if (lineaSave == linea6Jugador){
                linea6Jugador = lineaAct.getText();
                validarLinea(linea6Jugador, linea6CincoA, ok6, noOk6);
                mision.setJuegoActivo(false);
            }
            coding.habilitarInput(lineaAct, true);
            if (lineaAct == lineaSig){
                coding.habilitarInput(lineaSig, false);
            } else {
                coding.habilitarInput(lineaSig, true);
            }
        }
        });
    }
    
    void validarLinea(String lineaValidar, TextField lineaAct, ImageView ok, ImageView noOk) {
        lineaAct.setText(lineaValidar);
        lineaAct.setEditable(false);
        char linea[] = lineaValidar.toCharArray();
        for (int i=0;i<lineaValidar.length();i++){
            if (Character.isUpperCase(linea[i])){
                mayusc++;
            } else if (Character.isLowerCase(linea[i])){
                minusc++;
            } else if ((Character.isDigit(linea[i]))){
                numeros++;
            } else if ((Character.isSpaceChar(linea[i]))){
                espacios++;
            } else {
                otros++;
            }
        }
        if (mayusc==mayuscCond && minusc==minuscCond && numeros==numerosCond && espacios==espaciosCond && otros==otrosCond){
            ok.setVisible(true);
            puntajeMision1 += 20;
            mision.setPuntMision(puntajeMision1);
            puntaje5a.setText("• "+puntajeMision1.toString());
        } else {
            noOk.setVisible(true);
        }
        mayusc=0; minusc=0; numeros=0; espacios=0; otros=0;
    }
        
    //Métodos para los botones     
        @FXML
    private void switchToEscena4() throws IOException {
        App.setRoot("escena04");
    }
    
}   
