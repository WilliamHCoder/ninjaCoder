package com.ninjacoders.ninjacoder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * JavaFX App
 * | Clase principal que ejecuta el juego.
 */
public class App extends Application {

    private static Scene scene;
    
    /**Inicializa el juego en la escena 01**/
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("escena01"), 1280, 720);
        stage.setScene(scene);
        stage.show();
    }
    
    /**Cambia la escena de acuerdo a la seleccion**/
    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    /**Carga los FXML con las interfaz del juego**/
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**Ejecuta el juego**/
    public static void main(String[] args) {
        launch();
    }
}