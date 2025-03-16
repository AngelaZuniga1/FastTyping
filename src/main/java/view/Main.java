package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Clase principal que inicia la aplicación.
 * Carga la interfaz gráfica desde el archivo FXML y muestra la ventana principal.
 */
public class Main extends Application {


    /**
     * Método principal que inicia la aplicación.
     *
     * @param args Argumentos de la línea de comandos.
     */
    /**
     * Método que se ejecuta al iniciar la aplicación.
     * Carga la vista desde el archivo FXML y la muestra en una ventana.
     *
     * @param primaryStage La ventana principal de la aplicación.
     */

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/game_view.fxml"));
        primaryStage.setTitle("Escritura Rápida");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}