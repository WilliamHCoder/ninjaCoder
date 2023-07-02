/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import java.io.IOException;
import javafx.fxml.FXML;

import com.ninjacoders.ninjacoder.App;
import static com.ninjacoders.ninjacoder.Escena05aController.puntajeMision1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * Escena05b - Mision 2
 *
 * @author juanestebanvelazquezmorera
 * | Controlador para la mision 2.
 */
public class Escena05bController extends Mision{

    @FXML
    public Label tiempo5b, Cadena1;
    public Button jhgfdsdfgh;
    public TextField textCadena;
    public Button btnGanaTemp5b;
    public Button btnPierdeTemp5b;
    public Button btnIniciar5b;
    public ImageView pers5b_1_1, pers5b_1_2, pers5b_1_3, pers5b_2_1, pers5b_2_2, pers5b_2_3, pers5b_3_1, pers5b_3_2, pers5b_3_3;
    public ImageView ok5b,noOk5b;
    public ImageView noOk11;
    public static Integer puntajeMision2 = 0;
    public String ListAleatoria, PalabraJugador;
    private Button btnAtrasE05b;
    public Escena02Controller escena02 = new Escena02Controller();  
    public Mision2 coding2 = new Mision2();
    public Mision mision = new Mision();
    
    /** se pasan caracteristicas elegidas por el jugador **/
    @FXML
    protected void initialize(){
        escena02.cargarImgPersonaje(escena02.jugAct.getTonoPiel(), escena02.jugAct.getColorOjos(), pers5b_1_1, pers5b_1_2, pers5b_1_3, pers5b_2_1,  pers5b_2_2, pers5b_2_3, pers5b_3_1, pers5b_3_2, pers5b_3_3);
    }
    
    /**se inicia el juego el temporizador**/
    @FXML
    void iniciarJuego(ActionEvent event) {
        btnIniciar5b.setVisible(false);
        boolean activo = mision.getJuegoActivo();
        mision.setPuntAnterior(escena02.jugAct.getPuntuacion());
        puntajeMision2 = 0; 
        mision.setPuntMision(0);
        mision.setPuntFinal(0);
        mision.setMisionId(2);
        //se crea  la lista y se brinda la palabra aleatoria a memorizar    
        mision.temporizador(tiempo5b, Cadena1, textCadena);
        List<String> listAleatoria = new ArrayList<String> ();
        listAleatoria.add("System.out.println();");
        listAleatoria.add("public class Escena05bController extends Mision");
        listAleatoria.add("import java.util.ArrayList;");
        listAleatoria.add("import java.util.Scanner;");
        listAleatoria.add("String variable = ;");
        Collections.shuffle(listAleatoria);
        String textoAct = listAleatoria.get(0).toString();
        Cadena1.setText(textoAct);
        guardarLinea2(textCadena,textoAct);
        }
    
    /**guarda el texto ingresado por el jugador**/
    public void guardarLinea2 (TextField lineaAct, String pal){
        lineaAct.setOnKeyPressed(new EventHandler<KeyEvent>() {
            //usamos el keyEvent para guardar la palagra ingreada por el usuario 
            @Override
            public void handle(KeyEvent event) {
                if(event.getCode()==KeyCode.ENTER){
                    PalabraJugador = lineaAct.getText().toString();
                    coding2.habilitarInput(textCadena, false);
                    verificar(pal,PalabraJugador); 
                    mision.setJuegoActivo(false);
                }
            }
        });
    }
    
    /**realizamos la comparacion de las palabras**/
    public void verificar(String palAct, String palIngr){
        if(palAct.equals(palIngr)){
            ok5b.setVisible(true);
            puntajeMision2 += 100;
            mision.setPuntMision(puntajeMision2);
        }else{
            noOk5b.setVisible(true);
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

}
