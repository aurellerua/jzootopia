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
public class Parrot extends FlyingAnimal {

    public Parrot(int x, int y) {
        super();
        beratBadan = 2;
        jenisMakanan = 'o';
        isLiar = false;
        lokasi = new Point(x,y);
    }

    @Override
    public void tampilKarakter() {
        System.out.println("A");
    }

    @Override
    public void bersuara() {
        System.out.println("Rot, I'm a parrot.");
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
