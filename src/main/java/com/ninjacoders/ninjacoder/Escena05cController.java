/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import static com.ninjacoders.ninjacoder.Escena05aController.puntajeMision1;
import static com.ninjacoders.ninjacoder.Escena05bController.puntajeMision2;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;

/**
 * Escena05c - Mision 3
 *
 * @author piteralexanderbenavides
 * | Controlador para la mision 3.
 */
public class Escena05cController {

    @FXML
    private Label tiempo5c;
    public TextField palabraTextField3;
    private List<Palabra> palabras;
    public static Integer puntajeMision3 = 0;
    public Mision mision = new Mision(30);
    public Mision3 coding3 = new Mision3();
    public String palJugador;
    public String palActual;
    public Button btnIniciar5c;
    public Label palabraMostrar5c;
    public ImageView ok5c, noOk5c;
    public ImageView pers5c_1_1, pers5c_1_2, pers5c_1_3, pers5c_2_1, pers5c_2_2, pers5c_2_3, pers5c_3_1, pers5c_3_2, pers5c_3_3;
    public Escena02Controller escena02 = new Escena02Controller();    
    
    /**Método que carga la imagen del jugador de acuerdo a seleccion**/
    @FXML    
    protected void initialize() {
        //Carga el los colores de piel y ojos seleccionados y actualiza la imagen de acuerdo a ellos
        escena02.cargarImgPersonaje(escena02.jugAct.getTonoPiel(), escena02.jugAct.getColorOjos(), pers5c_1_1, pers5c_1_2, pers5c_1_3, pers5c_2_1, pers5c_2_2, pers5c_2_3, pers5c_3_1, pers5c_3_2, pers5c_3_3);
    }   
    
    /**inicializa la mision 3**/    
    @FXML
    public void iniciarJuego(ActionEvent event) {
        palabraTextField3.setVisible(true);
        palabraTextField3.setEditable(true);
        btnIniciar5c.setVisible(false);
        mision.setJuegoActivo(true);
        mision.setPuntAnterior(escena02.jugAct.getPuntuacion());
        puntajeMision3 = 0;
        mision.setPuntMision(0);
        mision.setPuntFinal(0);
        mision.setMisionId(3);
        mision.temporizadorMision3(tiempo5c);
        
        palabras = new ArrayList<>();
        palabras.add(new Palabra("programacion", "noicgramarop"));
        palabras.add(new Palabra("paradigmas", "igdrpaaasm"));
        palabras.add(new Palabra("metodo", "ooetmd"));
        palabras.add(new Palabra("package", "egpaack"));
        palabras.add(new Palabra("variables", "ablseiavr"));
        palabras.add(new Palabra("publicvoid", "diovilupb"));

        /**Desordenar las palabras**/
        Collections.shuffle(palabras);
        Palabra palabraActual = palabras.get(0);
        palActual = palabraActual.getOrdenada().toString();
        palabraMostrar5c.setText(palabraActual.getDesordenada());
        guardarLinea3(palabraTextField3, palActual);
    }
    
    /**Metodo que aplica los diferentes algoritmos al texto ingresado por el jugador y limita a 20 el numero de caracteres**/
    public void guardarLinea3(TextField palJug, String palAct){
        palJug.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) { 
                mision.addTextLimit(palabraTextField3, 20); 
                //Guardamos el texto
                palJugador = palJug.getText().toString();
                coding3.habilitarInput(palJug, false);
                verificarPalabra(palAct, palJugador);
                mision.setJuegoActivo(false);
            }
        });
    }
    
    /**valida la palabra ingresada con la palabra ordenada guardada**/
    public void verificarPalabra(String palAct, String palIngr){
        if (palAct.equals(palIngr)){
            ok5c.setVisible(true);
            puntajeMision3 += 100;
            mision.setPuntMision(puntajeMision3);
        } else {
            noOk5c.setVisible(true);
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

    /**metodo que llama la palabra ordenada o desordenada**/    
    private class Palabra {
        private String ordenada;
        private String desordenada;

        public Palabra(String ordenada, String desordenada) {
            this.ordenada = ordenada;
            this.desordenada = desordenada;
        }

        public String getOrdenada() {
            return ordenada;
        }

        public String getDesordenada() {
            return desordenada;
        }
    }
}
