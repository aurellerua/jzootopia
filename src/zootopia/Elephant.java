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
public class Elephant extends LandAnimal {

    public Elephant(int x, int y) {
        super();
        beratBadan = 10000;
        jenisMakanan = 'h';
        isLiar = false;
        lokasi = new Point(x,y);
        addMakanan(jenisMakanan);
        code = 'L';
    }

    @Override
    public char tampilKarakter() {
        return code;
    }

    @Override
    public void bersuara() {
        System.out.println("Humphhh, I'm an elephant.");
    }

    @Override
    public void berjalan() {
        getLokasi().move(1,1);
    }
    
}
