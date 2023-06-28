/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import java.io.IOException;
import javafx.fxml.FXML;

import com.ninjacoders.ninjacoder.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Escena05c - Mision 3
 *
 * @author peteralexanderbenavidezapraez
 * | Controlador para la mision 3.
 */
public class Escena05cController {

    @FXML
    private Label tiempo5c;

    /**Inicializa el juego**/
    @FXML
    void iniciarJuego(ActionEvent event) {
        List<String> palabras = new ArrayList<>();
        palabras.add("casa");
        palabras.add("perro");
        palabras.add("jardín");
        // Agrega todas las palabras que desees al listado

        Random random = new Random();
        String palabraAleatoria = palabras.get(random.nextInt(palabras.size()));

        System.out.println("Palabra aleatoria: " + palabraAleatoria);

        Mision mision = new Mision(30);
        mision.temporizadorMision3(tiempo5c);
    }

    @FXML
    private void switchToEscena06() throws IOException {
        App.setRoot("escena06");
    }

    @FXML
    private void switchToEscena07() throws IOException {
        App.setRoot("escena07");
    }

    @FXML
    private void switchToEscena4() throws IOException {
        App.setRoot("escena04");
    }

}
