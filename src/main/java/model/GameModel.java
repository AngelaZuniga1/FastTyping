package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Clase que presenta el modelo del juego.
 * Contiene la lógica del juego, como la generación de palabras aleatorias,
 * el manejo del tiempo, el nivel y las oportunidades del jugador.
 */
public class GameModel {
    private List<String> words;
    private String currentWord;
    private int level;
    private int timeLeft;
    private int opportunities;
    private Random random;

    /**
     * El constructor de la clase GameModel.
     * Inicializa la lista de palabras, el nivel, el tiempo y las oportunidades.
     */

    public GameModel() {
        words = new ArrayList<>();
        words.add("C#");
        words.add("C++");
        words.add("Java");
        words.add("Ruby");
        words.add("Script");
        words.add("Python");
        words.add("Programación");
        words.add("Internet");
        words.add("Sistemas");
        words.add("Desarrollo");
        words.add("Interfaz");
        words.add("Controlador");
        random = new Random();
        level = 1;
        timeLeft = 20;
        opportunities = 4;
        currentWord = getRandomWord();
    }

    /**
     * Obtiene una palabra aleatoria de la lista de palabras.
     *
     * @return Una palabra aleatoria.
     */
    public String getRandomWord() {
        return words.get(random.nextInt(words.size()));
    }

    /**
     * Obtiene la palabra actual que el jugador debe escribir.
     *
     * @return La palabra actual.
     */
    public String getCurrentWord() {
        return currentWord;
    }

    /**
     * Obtiene el nivel actual del juego.
     *
     * @return El nivel actual.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Obtiene el tiempo restante para completar el nivel.
     *
     * @return El tiempo restante.
     */
    public int getTimeLeft() {
        return timeLeft;
    }

    /**
     * Obtiene las oportunidades restantes del jugador.
     *
     * @return Las oportunidades restantes.
     */
    public int getOpportunities() {
        return opportunities;
    }

    /**
     * Reduce el tiempo restante en 1 segundo.
     */
    public void decreaseTime() {
        timeLeft--;
    }

    /**
     * Incrementa el nivel del juego y ajusta el tiempo restante cada 5 niveles.
     */
    public void increaseLevel() {
        level++;
        if (level % 5 == 0 && timeLeft > 2) {
            timeLeft -= 2;
        }
    }

    /**
     * Reduce las oportunidades del jugador en 1.
     */
    public void decreaseOpportunities() {
        opportunities--;
    }

    /**
     * Reinicia el nivel actual, generando una nueva palabra y restableciendo el tiempo.
     */
    public void resetLevel() {
        timeLeft = 20;
        currentWord = getRandomWord();
    }

    /**
     * Verifica si el juego ha terminado (si no quedan oportunidades).
     *
     * @return true si el juego ha terminado, false en caso contrario.
     */

    public boolean isGameOver() {
        return opportunities == 0;
    }
}