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
public class Peacock extends FlyingAnimal {

    public Peacock(int x, int y) {
        super();
        beratBadan = 3;
        jenisMakanan = 'o';
        isLiar = false;
        lokasi = new Point(x,y);
        code = 'P';
    }

    @Override
    public char tampilKarakter() {
        return code;
    }

    @Override
    public void bersuara() {
        System.out.println("Cock, I'm a peacock.");
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
