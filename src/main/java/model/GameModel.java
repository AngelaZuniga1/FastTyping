package model;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GameModel {
    private List<String> palabras = Arrays.asList("Java", "Programación", "Escritura", "Rápida", "Desarrollo", "Interfaz", "Usuario", "Tiempo", "Nivel", "Juego");
    private Random random = new Random();
    private int nivel = 1;
    private int tiempo = 20;
    private int oportunidades = 4;

    public String getPalabraAleatoria() {
        return palabras.get(random.nextInt(palabras.size()));
    }

    public int getNivel() {
        return nivel;
    }

    public void incrementarNivel() {
        nivel++;
        if (nivel % 5 == 0 && tiempo > 2) {
            tiempo -= 2;
        }
    }

    public int getTiempo() {
        return tiempo;
    }

    public void reducirOportunidad() {
        oportunidades--;
    }

    public int getOportunidades() {
        return oportunidades;
    }

    public boolean isGameOver() {
        return oportunidades <= 0;
    }
}