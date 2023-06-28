/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import java.util.ArrayList;

/**
 * Clase Mision1
 *
 * @author williamhernandezleon
 * | Clase mision1 - parametros, constructores y metodos.
 */
public class Mision1 extends Mision{
    // atributos de la misión 1
    private ArrayList condiciones;
    private Integer misionId = 1;

    // constructor
    public Mision1(Integer puntAnterior, Integer puntMision, Integer tiempoInicial, Boolean juegoActivo) {
        super(puntAnterior, puntMision, tiempoInicial, juegoActivo);
        this.misionId = misionId;
    }
    
    public Mision1(){
    }
    
    // métodos getter and setter
    public ArrayList getCondiciones() {
        return condiciones;
    }
    public void setCondiciones(ArrayList condiciones) {
        this.condiciones = condiciones;
    }
    public Integer getMisionId() {
        return misionId;
    }
    public void setMisionId(Integer misionId) {
        this.misionId = misionId;
    }

}
