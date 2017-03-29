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
public abstract class FlyingAnimal extends Animal {
    /**
     * Konstruktor dari kelas FlyingAnimal.
     * <p>
     * Menciptakan FlyingAnimal dengan habitat.
     */
    public FlyingAnimal() {
        habitat = new char[2];
        habitat[0] = 'l';
        habitat[1] = 'a';
    }
    /**
     * Bergerak di habitat land yang ditandai dengan 'l'.
     */
    public abstract void berjalan();
    /**
     * Bergerak di habitat air uang ditandai dengan 'a'.
     */
    public abstract void terbang();
}
