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
public class Shark extends WaterAnimal {

    public Shark(int x, int y) {
        super();
        beratBadan = 2000;
        jenisMakanan = 'k';
        isLiar = true;
        lokasi = new Point(x,y);
    }

    @Override
    public void tampilKarakter() {
        System.out.println("Y");
    }

    @Override
    public void bersuara() {
        System.out.println("Shoo, I'm a shark.");
    }

    @Override
    public void berenang() {
        getLokasi().move(1,1);
    }
    
}
