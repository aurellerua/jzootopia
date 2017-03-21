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
    public LandWaterAnimal() {
        habitat = new char[2];
        habitat[0] = 'l';
        habitat[1] = 'w';
    }
    
    public abstract void berjalan();
    public abstract void berenang();
}
