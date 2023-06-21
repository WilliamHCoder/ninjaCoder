/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import javafx.scene.control.TextField;

/**
 *
 * @author williamhernandezleon
 */
// Hacemos uso de la herencia y llamamos los atributos y métodos de la clase mision
public class Mision1 extends Mision{
    // atributos de la misión 1
    private String condiciones;
    private Integer misionId = 1;

    // constructor
    public Mision1(String condiciones, Integer misionId, TextField lineaJugador, Integer lineasCorrectas, Integer lineasErradas, Integer tiempoInicial, Integer tiempoActivo, Boolean juegoActivo) {
        super(lineaJugador, lineasCorrectas, lineasErradas, tiempoInicial, tiempoActivo, juegoActivo);
        this.condiciones = condiciones;
        this.misionId = misionId;
    }

    public Mision1(Integer misionId, TextField lineaJugador, Integer lineasCorrectas, Integer lineasErradas, Boolean juegoActivo) {
        super(lineaJugador, lineasCorrectas, lineasErradas, juegoActivo);
        this.misionId = misionId;
    }


    // métodos getter and setter
    public String getCondiciones() {
        return condiciones;
    }
    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }
    public Integer getMisionId() {
        return misionId;
    }
    public void setMisionId(Integer misionId) {
        this.misionId = misionId;
    }
    
    // otros métodos
    public void crearCondAleatorias(){

    }
    
    
}
