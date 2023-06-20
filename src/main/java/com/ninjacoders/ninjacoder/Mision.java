/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import  java.util.Timer; 
import  java.util.TimerTask;
import javafx.application.Platform;
import javafx.scene.control.Label;
/**
 *
 * @author williamhernandezleon
 */
// La clase Mision será la clase padre para cada una de las 3 misiones del juego
public class Mision {
    // atributos generales de la misión
    private String lineaJugador;
    private Integer lineasCorrectas;
    private Integer lineasErradas;
    private Integer tiempoInicial;
    private Integer tiempoActivo;
    private Boolean juegoActivo;

    //constructor para el temporizador
    public Mision(Integer tiempoInicial) {
        this.tiempoInicial = tiempoInicial;
    }

    public Mision(String lineaJugador, Integer lineasCorrectas, Integer lineasErradas, Integer tiempoInicial, Integer tiempoActivo, Boolean juegoActivo) {
        this.lineaJugador = lineaJugador;
        this.lineasCorrectas = lineasCorrectas;
        this.lineasErradas = lineasErradas;
        this.tiempoInicial = tiempoInicial;
        this.tiempoActivo = tiempoActivo;
        this.juegoActivo = juegoActivo;
    }
    
    
    
    
    // métodos getter y setter
    public String getLineaJugador() {
        return lineaJugador;
    }
    public void setLineaJugador(String lineaJugador) {
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
                    tiempoRestante--; //Disminuye en 1 seg.
                    Platform.runLater(() -> label.setText(String.valueOf(tiempoRestante))); //Modifica el label con el tiempoActual
                } else {
                    timer.cancel(); //Detiene el temporizador
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000); // Hace que se ejecute la tarea a cada segundo
    }   
    
    
    public void validarLineas(){

    }    
    
    public void guardarPuntaje(){

    }
    
}
