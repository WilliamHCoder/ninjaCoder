/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author williamhernandezleon
 */
// Hacemos uso de la herencia y llamamos los atributos y métodos de la clase mision
public class Mision2 extends Mision{
    // atributos de la misión 2
    public String Palabracondicion;
    public Integer misionId ;

    // constructor

    public Mision2() {
    }

    public Mision2(String Palabracondicion, Integer misionId, Integer tiempoInicial) {
        super(tiempoInicial);
        this.Palabracondicion = Palabracondicion;
        this.misionId = misionId;
    }

    public Mision2(String Palabracondicion, Integer misionId, Integer lineasCorrectas, Integer lineasErradas, Integer tiempoInicial, Integer tiempoActivo) {
        super(lineasCorrectas, lineasErradas, tiempoInicial, tiempoActivo);
        this.Palabracondicion = Palabracondicion;
        this.misionId = misionId;
    }

    public Mision2(String Palabracondicion, Integer misionId, Integer lineasCorrectas, Integer lineasErradas, Boolean juegoActivo) {
        super(lineasCorrectas, lineasErradas, juegoActivo);
        this.Palabracondicion = Palabracondicion;
        this.misionId = misionId;
    }

    public Mision2(String Palabracondicion, Integer misionId) {
        this.Palabracondicion = Palabracondicion;
        this.misionId = misionId;
    }

    public String getPalabracondicion() {
        return Palabracondicion;
    }

    public void setPalabracondicion(String Palabracondicion) {
        this.Palabracondicion = Palabracondicion;
    }

    public Integer getMisionId() {
        return misionId;
    }

    public void setMisionId(Integer misionId) {
        this.misionId = misionId;
    }
    
    
    
    
    

    
}
