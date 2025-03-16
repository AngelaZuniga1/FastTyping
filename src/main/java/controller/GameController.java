package controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.GameModel;

public class GameController {
    @FXML private Label palabraLabel;
    @FXML private TextField entradaTextField;
    @FXML private Button validarButton;
    @FXML private ProgressBar eclipseProgressBar;
    @FXML private Label tiempoLabel;
    @FXML private Label nivelLabel;

    private GameModel model = new GameModel();

    @FXML
    public void initialize() {
        actualizarVista();
        configurarEventos();
    }

    private void actualizarVista() {
        palabraLabel.setText(model.getPalabraAleatoria());
        tiempoLabel.setText("Tiempo restante: " + model.getTiempo());
        nivelLabel.setText("Nivel: " + model.getNivel());
        eclipseProgressBar.setProgress(model.getOportunidades() / 4.0);
    }

    private void configurarEventos() {
        validarButton.setOnAction(event -> validarPalabra());
        entradaTextField.setOnAction(event -> validarPalabra());
    }

    private void validarPalabra() {
        if (entradaTextField.getText().equals(palabraLabel.getText())) {
            model.incrementarNivel();
            actualizarVista();
        } else {
            model.reducirOportunidad();
            if (model.isGameOver()) {
                mostrarGameOver();
            } else {
                actualizarVista();
            }
        }
        entradaTextField.clear();
    }

    private void mostrarGameOver() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Game Over");
        alert.setHeaderText("Has perdido el juego");
        alert.setContentText("Niveles completados: " + model.getNivel());
        alert.showAndWait();
    }
}