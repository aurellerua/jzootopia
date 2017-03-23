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
public class Snake extends LandWaterAnimal {

    public Snake(int x, int y) {
        super();
        beratBadan = 3;
        jenisMakanan = 'k';
        isLiar = true;
        lokasi = new Point(x,y);
        addMakanan(jenisMakanan);
    }

    @Override
    public void tampilKarakter() {
        System.out.println("S");
    }

    @Override
    public void bersuara() {
        System.out.println("Shhh, I'm a snake.");
    }
    
    @Override
    public void berjalan() {
        getLokasi().move(1,1);
    }

    @Override
    public void berenang() {
        getLokasi().move(1,1);
    }
    
}
