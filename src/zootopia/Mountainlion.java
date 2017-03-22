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
public class Mountainlion extends LandAnimal {

    public Mountainlion(int x, int y) {
        super();
        beratBadan = 2000;
        jenisMakanan = 'k';
        isLiar = true;
        lokasi = new Point(x,y);
        addMakanan(jenisMakanan);
    }

    @Override
    public void tampilKarakter() {
        System.out.println("M");
    }

    @Override
    public void bersuara() {
        System.out.println("M, grrr, I'm a mountain lion.");
    }

    @Override
    public void berjalan() {
        getLokasi().move(1,1);
    }
    
}
