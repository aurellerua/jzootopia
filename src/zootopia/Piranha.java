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
public class Piranha extends WaterAnimal {

    public Piranha(int x, int y) {
        super();
        beratBadan = 1;
        jenisMakanan = 'k';
        isLiar = true;
        lokasi = new Point(x,y);
    }

    @Override
    public void tampilKarakter() {
        System.out.println("Z");
    }

    @Override
    public void bersuara() {
        System.out.println("Eeer, I'm a piranha.");
    }

    @Override
    public void berenang() {
        getLokasi().move(1,1);
    }
    
}
