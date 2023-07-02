/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ninjacoders.ninjacoder;
import java.util.ArrayList;
import javafx.scene.control.Label;

/**
* Clase Mision3
*
* @author piteralexanderbenavides
* | Clase mision3 - parametros, constructores y metodos.
*/
public class Mision3 extends Mision{
    // atributos de la misión 3
    private ArrayList listaPalabras;
    
    // constructor
    public Mision3(ArrayList listaPalabras, Integer misionId, Integer tiempoInicial) {
        super(tiempoInicial);
        this.listaPalabras = listaPalabras;
    }
    
    public Mision3(){
    }

    // métodos getter and setter
    public ArrayList getListaPalabras() {
        return listaPalabras;
    }
    public void setListaPalabras(ArrayList listaPalabras) {
        this.listaPalabras = listaPalabras;
    }    
}
