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
public class Cheetah extends LandAnimal {
    
    public Cheetah(int x, int y) {
        super();
        beratBadan = 1000;
        jenisMakanan = 'k';
        isLiar = true;
        lokasi = new Point(x,y);
        addMakanan(jenisMakanan);
    }

    @Override
    public void tampilKarakter() {
        System.out.println("H");
    }

    @Override
    public void bersuara() {
        System.out.println("Tah, I'm a cheetah.");
    }

    @Override
    public void berjalan() {
        getLokasi().move(1,1);
    }

}

