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
public class Mision2 extends Mision{
    // atributos de la misión 2
    private String Palabracondicion;
    private Integer misionId;

    // constructor
    public Mision2(String Palabracondicion, Integer misionId) {
        this.Palabracondicion = Palabracondicion;
        this.misionId = misionId;
    }

    // métodos getter and setter
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
    
    // otros métodos
    public void elegirPalabCondAleat(){

    }
    
    
}
