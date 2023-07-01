/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ninjacoders.ninjacoder;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javafx.event.ActionEvent;

public class Escena05cController {

    @FXML
    private Label tiempo5c;
    
    @FXML
    private Label palabraLabel;
    
    @FXML
    private TextField palabraTextField;

    private List<Palabra> palabras;
    private Mision3 mision;

    @FXML
    void iniciarJuego(ActionEvent event) {
        palabras = new ArrayList<>();
        palabras.add(new Palabra("casa", "asac"));
        palabras.add(new Palabra("perro", "rrope"));
        palabras.add(new Palabra("jardín", "inrjda"));
        // Agrega todas las palabras que desees al listado

        // Desordenar las palabras
        Collections.shuffle(palabras);

        Palabra palabraActual = palabras.get(0);
        palabraLabel.setText(palabraActual.getDesordenada());

        mision = new Mision3(30, palabraActual.getOrdenada());
        mision.iniciarMision(tiempo5c);
    }

    @FXML
    void verificarPalabra(ActionEvent event) {
        if (mision != null) {
            String palabraIngresada = palabraTextField.getText().trim();
            mision.verificarPalabra(palabraIngresada);
            palabraTextField.setText("");
        } else {
            mostrarAlerta("Error", "Debes iniciar el juego primero.");
        }
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

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    private class Palabra {
        private String ordenada;
        private String desordenada;

        public Palabra(String ordenada, String desordenada) {
            this.ordenada = ordenada;
            this.desordenada = desordenada;
        }

        public String getOrdenada() {
            return ordenada;
        }

        public String getDesordenada() {
            return desordenada;
        }
    }
}
