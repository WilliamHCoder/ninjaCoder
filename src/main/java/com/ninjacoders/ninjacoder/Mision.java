/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import java.util.Timer; 
import java.util.TimerTask;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import com.ninjacoders.ninjacoder.App;
import java.io.IOException;

/**
 * Clase Mision - Clase general para las 3 misiones
 *
 * @author williamhernandezleon|juanestebanvelazquezmorera|piteralexanderbenavides
 * | Clase mision - parametros y metodos comunes.
 */
public class Mision {
    // atributos generales de la misión
    public static Integer puntAnterior;
    public static Integer puntMision;
    public static Integer puntFinal;
    public Integer tiempoInicial;
    public Integer tiempoActivo;
    public static Boolean juegoActivo = false;
    private static Integer misionId = 0;
    
    //constructor para el temporizador
    public Mision(Integer tiempoInicial) {
        this.tiempoInicial = tiempoInicial;
    }
    
    public Mision(Integer puntAnterior, Integer puntMision, Integer puntFinal, Boolean juegoActivo) {
        this.puntAnterior = puntAnterior;
        this.puntMision = puntMision;
        this.puntFinal = puntFinal;
        this.juegoActivo = juegoActivo;
    }

    //Constructor vacio para condiciones
    public Mision() {
    }
    
    // métodos getter y setter
    public Integer getPuntAnterior() {
        return puntAnterior;
    }
    public void setPuntAnterior(Integer puntAnterior) {
        this.puntAnterior = puntAnterior;
    } 
    public Integer getPuntMision() {
        return puntMision;
    }
    public void setPuntMision(Integer puntMision) {
        this.puntMision = puntMision;
    }    
    public Integer getPuntFinal() {
        return puntFinal;
    }
    public void setPuntFinal(Integer puntFinal) {
        this.puntFinal = puntFinal;
    }
    public Integer getTiempoInicial() {
        return tiempoInicial;
    }
    public void setTiempoInicial(Integer tiempoInicial) {
        this.tiempoInicial = tiempoInicial;
    }
    public Integer getTiempoActivo() {
        return tiempoActivo;
    }
    public void setTiempoActivo(Integer tiempoActivo) {
        this.tiempoActivo = tiempoActivo;
    }
    public Boolean getJuegoActivo() {
        return juegoActivo;
    }
    public void setJuegoActivo(Boolean juegoActivo) {
        this.juegoActivo = juegoActivo;
    }
    public Integer getMisionId() {
        return misionId;
    }
    public void setMisionId(Integer misionId) {
        this.misionId = misionId;
    }
    
    // otros métodos    
    public void cargarSonidos(){

    } 
 
    /**Método para mostrar ejecutar el TEMPORIZADOR en las mision 1**/
    public void temporizadorMision1(Label label, TextField linea1, TextField linea2, TextField linea3, TextField linea4, TextField linea5, TextField linea6, Escena02Controller escena02, Mision mision){
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
        int tiempoRestante = tiempoInicial;
        @Override
        public void run() {
            if (tiempoRestante > 0 && juegoActivo==true) {
                tiempoRestante--; //Disminuye en 1 seg.
                Platform.runLater(() -> label.setText(String.valueOf(tiempoRestante))); //Modifica el label con el tiempoActual
            } else{
                timer.cancel(); //Detiene el temporizador
                setJuegoActivo(false);
                linea1.setEditable(false);
                linea2.setEditable(false);
                linea3.setEditable(false);
                linea4.setEditable(false);
                linea5.setEditable(false);
                linea6.setEditable(false);
                escena02.jugAct.setPuntuacion(mision.getPuntAnterior()+mision.getPuntMision());
                mision.setPuntFinal(mision.getPuntAnterior()+mision.getPuntMision());
                //Redirecciona a las escenas de éxito o fallo         
                if (mision.getPuntMision()>=60){
                    try {
                    App.setRoot("escena06");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    try {
                    App.setRoot("escena07");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        };
        timer.scheduleAtFixedRate(task, 0, 1000); // Hace que se ejecute la tarea a cada segundo
    }
    
    /**Método para mostrar ejecutar el primer TEMPORIZADOR en las mision 2**/
    public void temporizador(Label label, Label linea1, TextField textJug){
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int tiempoRestante = 5;
            @Override
            public void run() {
                setJuegoActivo(true);
                if (tiempoRestante > 0) {
                    tiempoRestante--; //Disminuye en 1 seg.
                    Platform.runLater(() -> label.setText(String.valueOf(tiempoRestante))); //Modifica el label con el tiempoActual
                } else {
                    timer.cancel(); //Detiene el temporizador
                    linea1.setVisible(false);
                    temporizador2(label, textJug);
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000); // Hace que se ejecute la tarea a cada segundo
    }
    
    /**Método para mostrar ejecutar el segundo TEMPORIZADOR en las mision 2**/    
    public void temporizador2 (Label label, TextField textJug){
        textJug.setVisible(true);
        Mision mision = new Mision();
        Escena02Controller escena02 = new Escena02Controller();
        Timer timer2 = new Timer();
        TimerTask task2 = new TimerTask() {
            int tiempoRestante2 = 15;
            @Override
            public void run(){
                if(tiempoRestante2 > 0 && juegoActivo==true){
                    tiempoRestante2--;
                    Platform.runLater(() -> label.setText(String.valueOf(tiempoRestante2)));
                }else{
                    timer2.cancel();
                    setJuegoActivo(false);
                    escena02.jugAct.setPuntuacion(mision.getPuntAnterior()+mision.getPuntMision());
                    mision.setPuntFinal(mision.getPuntAnterior()+mision.getPuntMision());
                    //Redirecciona a las escenas de éxito o fallo         
                    if (mision.getPuntMision()>=100){
                        try {
                        App.setRoot("escena06");
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    } else {
                        try {
                        App.setRoot("escena07");
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
                
            }
        };
        timer2.scheduleAtFixedRate(task2, 0, 1000); // Hace que se ejecute la tarea a cada segundo
    }
    
    /**Método para mostrar ejecutar el TEMPORIZADOR en las mision 3**/    
    public void temporizadorMision3(Label label){
        Mision mision = new Mision();
        Escena02Controller escena02 = new Escena02Controller();
        Timer timer3 = new Timer();
        TimerTask task3 = new TimerTask() {
        int tiempoRestante = tiempoInicial;
        @Override
        public void run() {
            if (tiempoRestante > 0 && juegoActivo==true) {
                tiempoRestante--; //Disminuye en 1 seg.
                Platform.runLater(() -> label.setText(String.valueOf(tiempoRestante))); //Modifica el label con el tiempoActual
            } else {
                timer3.cancel(); //Detiene el temporizador
                setJuegoActivo(false);
                escena02.jugAct.setPuntuacion(mision.getPuntAnterior()+mision.getPuntMision());
                mision.setPuntFinal(mision.getPuntAnterior()+mision.getPuntMision());
                //Redirecciona a las escenas de éxito o fallo
                if (mision.getPuntMision()>=100){
                    try {
                    App.setRoot("escena06");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    try {
                    App.setRoot("escena07");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        };
        timer3.scheduleAtFixedRate(task3, 0, 1000); // Hace que se ejecute la tarea a cada segundo
    }    
    
    /**Método que HABILITA la opción de ver los INPUTS al iniciar el juego**/
    public void habilitarInput(TextField field, Boolean lineaActiva){
        if (lineaActiva == true){
            field.setVisible(true);
        }else{
            field.setEditable(false);
        }
    }
    
    /**Método que LIMITA el MÁXIMO de CARACTERES de la línea de código**/
    public void addTextLimit(final TextField field, final int maxLength) {
        field.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(final ObservableValue<? extends String> ov, final String oldValue, final String newValue) {
                if (field.getText().length() > maxLength) {
                    String s = field.getText().substring(0, maxLength);
                    field.setText(s);
                }
            }
        });
    }
}
