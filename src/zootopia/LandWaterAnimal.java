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
public abstract class LandWaterAnimal extends Animal {
    /**
     * Konstruktor dari kelas LandWaterAnimal.
     * <p>
     * Menciptakan LandWaterAnimal dengan habitat.
     */
    public LandWaterAnimal() {
        habitat = new char[2];
        habitat[0] = 'l';
        habitat[1] = 'w';
    }
    /**
     * Bergerak di habitat land yang ditandai dengan 'l'.
     */
    public abstract void berjalan();
    
    /**
     * Bergerak di habitat water yang ditandai dengan 'w'.
     */
    public abstract void berenang();
}
