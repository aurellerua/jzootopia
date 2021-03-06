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
public class Frog extends LandWaterAnimal {

    public Frog(int x, int y) {
        super();
        beratBadan = 1;
        jenisMakanan = 'k';
        isLiar = false;
        lokasi = new Point(x,y);
        addMakanan(jenisMakanan);
        code = 'F';
    }

    @Override
    public char tampilKarakter() {
        return code;
    }

    @Override
    public void bersuara() {
        System.out.println("Crock, I'm a frog.");
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
