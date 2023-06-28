/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ninjacoders.ninjacoder;
import java.util.ArrayList;

/**
* Clase Mision3
*
* @author williamhernandezleon
* | Clase mision3 - parametros, constructores y metodos.
*/
public class Mision3 extends Mision{
    // atributos de la misión 3
    private ArrayList listaPalabras;
    private Integer misionId;
    
    // constructor
    public Mision3(ArrayList listaPalabras, Integer misionId, Integer tiempoInicial) {
        super(tiempoInicial);
        this.listaPalabras = listaPalabras;
        this.misionId = misionId;
    }

    // métodos getter and setter
    public ArrayList getListaPalabras() {
        return listaPalabras;
    }
    public void setListaPalabras(ArrayList listaPalabras) {
        this.listaPalabras = listaPalabras;
    }
    public Integer getMisionId() {
        return misionId;
    }
    public void setMisionId(Integer misionId) {
        this.misionId = misionId;
    }
    
    // otros métodos
    public void elegirPalabAleat(){

    }
    
    public void desordenarPalabra(){

    }
    
    
}
