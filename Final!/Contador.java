import greenfoot.*; 
import java.awt.Color; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo) // para dar color a letra o imagen
/**
 * Write a description of class contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;

public class Contador extends Actor {
    private int contador;

    public Contador() {
        contador = 0;
    }

    public void incrementarContador() {
        contador++;
    }

    public void act() {
        // Actualizar el texto del contador en cada iteración del juego
        actualizarTexto();
    }

    private void actualizarTexto() {
        World world = getWorld();
        // Muestra el contador en la esquina superior izquierda de la pantalla
        world.showText("Pescados comidos: " + contador, 100, 20);
    }
}

