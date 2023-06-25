/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import java.io.IOException;
import java.util.Timer; 
import java.util.TimerTask;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
/**
 *
 * @author williamhernandezleon
 */
// La clase Mision será la clase padre para cada una de las 3 misiones del juego
public class Mision {
    // atributos generales de la misión
    private Integer lineasCorrectas;
    private Integer lineasErradas;
    private Integer tiempoInicial;
    private Integer tiempoActivo;
    private Boolean juegoActivo = false;

    //constructor para el temporizador
    public Mision(Integer tiempoInicial) {
        this.tiempoInicial = tiempoInicial;
    }

    public Mision(Integer lineasCorrectas, Integer lineasErradas, Integer tiempoInicial, Integer tiempoActivo) {
        this.lineasCorrectas = lineasCorrectas;
        this.lineasErradas = lineasErradas;
        this.tiempoInicial = tiempoInicial;
        this.tiempoActivo = tiempoActivo;
    }

    public Mision(Integer lineasCorrectas, Integer lineasErradas, Boolean juegoActivo) {
        this.lineasCorrectas = lineasCorrectas;
        this.lineasErradas = lineasErradas;
        this.juegoActivo = juegoActivo;
    }

    //Constructor vacio para condiciones
    public Mision() {
    }
    
    
    // métodos getter y setter
    public Integer getLineasCorrectas() {
        return lineasCorrectas;
    }
    public void setLineasCorrectas(Integer lineasCorrectas) {
        this.lineasCorrectas = lineasCorrectas;
    }
    public Integer getLineasErradas() {
        return lineasErradas;
    }
    public void setLineasErradas(Integer lineasErradas) {
        this.lineasErradas = lineasErradas;
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
    
    // otros métodos
    public void cargarPersonaje(){

    }
    
    public void cargarEscenario(){

    }
    
    public void cargarSonidos(){

    } 
    
    public void iniciar(){

    }    
    
    // Método para mostrar ejecutar el TEMPORIZADOR en las diferentes misiones.
    public void temporizador(Label label, TextField linea1, TextField linea2, TextField linea3, TextField linea4, TextField linea5, TextField linea6){
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
        int tiempoRestante = tiempoInicial;
        @Override
        public void run() {
            setJuegoActivo(true);
            if (tiempoRestante > 0) {
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
                
            }
        }
        };
        timer.scheduleAtFixedRate(task, 0, 1000); // Hace que se ejecute la tarea a cada segundo
    }
    
    public void temporizadorSencillo(Label label){
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
        int tiempoRestante = tiempoInicial;
        @Override
        public void run() {
            setJuegoActivo(true);
            if (tiempoRestante > 0) {
                tiempoRestante--; //Disminuye en 1 seg.
                Platform.runLater(() -> label.setText(String.valueOf(tiempoRestante))); //Modifica el label con el tiempoActual
            } else {
                timer.cancel(); //Detiene el temporizador
                setJuegoActivo(false);
            }
        }
        };
        timer.scheduleAtFixedRate(task, 0, 1000); // Hace que se ejecute la tarea a cada segundo
    }    
    
    
    //HABILITA la opción de ver los INPUTS al iniciar el juego
    public void habilitarInput(TextField field, Boolean lineaActiva){
        if (lineaActiva == true){
            field.setVisible(true);
        }else{
            field.setEditable(false);
        }
    }
    
    //LIMITA el MÁXIMO de CARACTERES de la línea de código
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
       
    public void validarLineas(){

    }    
    
    public void guardarPuntaje(){

    }
   
    
}
