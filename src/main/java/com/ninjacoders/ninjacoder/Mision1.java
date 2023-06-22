/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import java.util.ArrayList;
import javafx.scene.control.TextField;

/**
 *
 * @author williamhernandezleon
 */
// Hacemos uso de la herencia y llamamos los atributos y métodos de la clase mision
public class Mision1 extends Mision{
    // atributos de la misión 1
    private ArrayList condiciones;
    private Integer misionId = 1;

    // constructor
    public Mision1(Integer misionId, Integer lineasCorrectas, Integer lineasErradas, Boolean juegoActivo) {
        super(lineasCorrectas, lineasErradas, juegoActivo);
        this.misionId = misionId;
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
    
    // otros métodos
    
    
}
