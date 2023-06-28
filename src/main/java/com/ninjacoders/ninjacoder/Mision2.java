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
* Clase Mision2
*
* @author williamhernandezleon
* | Clase mision2 - parametros, constructores y metodos.
*/
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

    public Mision2(String Palabracondicion, Integer misionId, Integer puntMision, Integer puntFinal, Integer tiempoInicial, Integer tiempoActivo, Boolean juegoActivo) {
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
