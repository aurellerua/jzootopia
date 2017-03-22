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
public class Lion extends LandAnimal {

    public Lion(int x, int y) {
        super();
        beratBadan = 4000;
        jenisMakanan = 'k';
        isLiar = true;
        lokasi = new Point(x,y);
    }

    @Override
    public void tampilKarakter() {
        System.out.println("N");
    }

    @Override
    public void bersuara() {
        System.out.println("Roar, I'm a lion.");
    }

    @Override
    public void berjalan() {
        getLokasi().move(1,1);
    }
    
}
