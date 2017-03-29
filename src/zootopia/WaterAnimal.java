/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zootopia;

/**
 *
 * @author Aurelia
 */
public abstract class WaterAnimal extends Animal {
    /**
     * Konstruktor dari kelas WaterAnimal.
     * <p>
     * Menciptakan sebuah WaterAnimal di habitat air.
     */
    public WaterAnimal() {
        habitat = new char[2];
        habitat[0] = 'w';
        habitat[1] = '\0';
    }
    /**
     * Bergerak di habitat water yang ditandai dengan 'w'.
     */
    public abstract void berenang();
}
