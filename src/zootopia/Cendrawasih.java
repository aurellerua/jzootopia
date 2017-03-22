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
public class Cendrawasih extends FlyingAnimal {

    public Cendrawasih(int x, int y) {
        super();
        beratBadan = 3;
        jenisMakanan = 'o';
        isLiar = false;
        lokasi = new Point(x,y);
    }

    @Override
    public void tampilKarakter() {
        System.out.println("C");
    }

    @Override
    public void bersuara() {
        System.out.println("See, I'm a cendrawasih.");
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
