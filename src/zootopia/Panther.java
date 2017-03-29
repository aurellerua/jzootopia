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
public class Panther extends LandAnimal {

   public Panther(int x, int y) {
        super();
        beratBadan = 2000;
        jenisMakanan = 'k';
        isLiar = true;
        lokasi = new Point(x,y);
        addMakanan(jenisMakanan);
        code = 'R';
    }

    @Override
    public char tampilKarakter() {
        return code;
    }

    @Override
    public void bersuara() {
        System.out.println("Rrr, I'm a panther.");
    }

    @Override
    public void berjalan() {
        getLokasi().move(1,1);
    }
    
}
