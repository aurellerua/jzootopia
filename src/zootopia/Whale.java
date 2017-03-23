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
public class Whale extends WaterAnimal {

    public Whale(int x, int y) {
        super();
        beratBadan = 50000;
        jenisMakanan = 'k';
        isLiar = true;
        lokasi = new Point(x,y);
        addMakanan(jenisMakanan);
    }

    @Override
    public void tampilKarakter() {
        System.out.println("W");
    }

    @Override
    public void bersuara() {
        System.out.println("La, I'm a whale.");
    }

    @Override
    public void berenang() {
        getLokasi().move(1,1);
    }
    
}
