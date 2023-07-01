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

    Mision3(int i, String ordenada) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    void verificarPalabra(String palabraIngresada) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void iniciarMision(Label tiempo5c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
}
