/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ninjacoders.ninjacoder;

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
    
    public void temporizador(){

    }   
    
    public void validarLineas(){

    }    
    
    public void guardarPuntaje(){

    }
    
}
