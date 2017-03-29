/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zootopia;

/**
 *
 * @author Jacqueline
 */
public class Eagle extends FlyingAnimal {

    public Eagle(int x, int y) {
        super();
        beratBadan = 3;
        jenisMakanan = 'k';
        isLiar = true;
        lokasi = new Point(x,y);
        addMakanan(jenisMakanan);
        code = 'E';
    }

    @Override
    public char tampilKarakter() {
       return code;
    }

    @Override
    public void bersuara() {
        System.out.println("Gal, I'm an eagle.");
    }

    @Override
    public void berjalan() {
        getLokasi().move(1,1);
    }

    @Override
    public void terbang() {
        getLokasi().move(1,1);
    }
    
}
