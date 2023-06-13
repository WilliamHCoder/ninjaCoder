/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ninjacoders.ninjacoder;

/**
 *
 * @author williamhernandezleon
 */
// Hacemos uso de la herencia y llamamos los atributos y métodos de la clase mision
public class Mision1 extends Mision{
    // atributos de la misión 1
    private String condiciones;
    private Integer misionId;

    // constructor
    public Mision1(String condiciones, Integer misionId) {
        this.condiciones = condiciones;
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
