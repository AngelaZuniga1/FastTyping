package model;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * El modelo que contiene y mantiene la lógica del juego.
 * Implementación de palabras
 */
public class GameModel {
    private List<String> palabras = Arrays.asList("C++", "Java", "Python", "Sistema", "Almacenamiento", "Operativo", "Desarrollo", "Interfaz", "Grafico", "Modulo", "Solar", "Eclipse");
    private Random random = new Random();
    private int nivel = 1;
    private int tiempo = 20;
    private int oportunidades = 4;

    /**
     * Obtiene una palabra aleatoria de la lista.
     *
     * @return Una palabra aleatoria.
     */
    public String getPalabraAleatoria() {
        return palabras.get(random.nextInt(palabras.size()));
    }

    public int getNivel() {
        return nivel;
    }
    /**
     * Incrementa el nivel y reduce el tiempo cada 5 niveles.
     */
    public void incrementarNivel() {
        nivel++;
        if (nivel % 5 == 0 && tiempo > 2) {
            tiempo -= 2;
        }
    }

    public int getTiempo() {
        return tiempo;
    }

    /**
     * Reduce las oportunidades del jugador.
     */
    public void reducirOportunidad() {
        oportunidades--;
    }

    public int getOportunidades() {
        return oportunidades;
    }

    /**
     * Verifica si el juego ha terminado.
     * @return true si el juego ha terminado, false en caso contrario.
     */
    public boolean isGameOver() {
        return oportunidades <= 0;
    }
}