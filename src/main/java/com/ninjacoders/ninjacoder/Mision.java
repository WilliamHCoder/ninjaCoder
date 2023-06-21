/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import  java.util.Timer; 
import  java.util.TimerTask;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
/**
 *
 * @author williamhernandezleon
 */
// La clase Mision será la clase padre para cada una de las 3 misiones del juego
public class Mision {
    // atributos generales de la misión
    private TextField lineaJugador;
    private Integer lineasCorrectas;
    private Integer lineasErradas;
    private Integer tiempoInicial;
    private Integer tiempoActivo;
    private Boolean juegoActivo = false;

    //constructor para el temporizador
    public Mision(Integer tiempoInicial) {
        this.tiempoInicial = tiempoInicial;
    }

    public Mision(TextField lineaJugador, Integer lineasCorrectas, Integer lineasErradas, Integer tiempoInicial, Integer tiempoActivo, Boolean juegoActivo) {
        this.lineaJugador = lineaJugador;
        this.lineasCorrectas = lineasCorrectas;
        this.lineasErradas = lineasErradas;
        this.tiempoInicial = tiempoInicial;
        this.tiempoActivo = tiempoActivo;
        this.juegoActivo = juegoActivo;
    }

    public Mision(TextField lineaJugador, Integer lineasCorrectas, Integer lineasErradas, Boolean juegoActivo) {
        this.lineaJugador = lineaJugador;
        this.lineasCorrectas = lineasCorrectas;
        this.lineasErradas = lineasErradas;
        this.juegoActivo = juegoActivo;
    }
    
    
    // métodos getter y setter
    public TextField getLineaJugador() {
        return lineaJugador;
    }
    public void setLineaJugador(TextField lineaJugador) {
        this.lineaJugador = lineaJugador;
    }
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
    
    // Método para mostrar ejecutar el temporizador en las diferentes misiones.
    public void temporizador(Label label){
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int tiempoRestante = tiempoInicial;
            @Override
            public void run() {
                if (tiempoRestante > 0) {
                    setJuegoActivo(true);
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
    
    //Habilita la opción de ver los inputs al iniciar el juego
    public void habilitarInput(TextField field, Boolean lineaActiva, Boolean juegoActivo){
        if (lineaActiva == true && juegoActivo == true){
            field.setVisible(true);
        }else{
            field.setEditable(false);
        }
    }
    
    //Limita el máximo de caracteres de la línea de codigo
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
