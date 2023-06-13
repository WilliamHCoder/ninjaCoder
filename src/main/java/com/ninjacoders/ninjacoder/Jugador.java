/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ninjacoders.ninjacoder;
/**
 *
 * @author williamhernandezleon
 */
public class Jugador {
    // atributos del Jugador
    private String nickname;
    private Integer tonoPiel;
    private Integer colorOjos;
    private Integer puntuacion;

    // constructor
    public Jugador(String nickname, Integer tonoPiel, Integer colorOjos, Integer puntuacion) {
        this.nickname = nickname;
        this.tonoPiel = tonoPiel;
        this.colorOjos = colorOjos;
        this.puntuacion = puntuacion;
    }

    // métodos getter y setter
    public Integer getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public Integer getTonoPiel() {
        return tonoPiel;
    }
    public void setTonoPiel(Integer tonoPiel) {
        this.tonoPiel = tonoPiel;
    }
    public Integer getColorOjos() {
        return colorOjos;
    }
    public void setColorOjos(Integer colorOjos) {
        this.colorOjos = colorOjos;
    }
    
    // otros métodos
    public void ganar(){

    }
    
    public void perder(){

    }
    
}
