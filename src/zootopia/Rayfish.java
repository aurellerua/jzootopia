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
public class Rayfish extends WaterAnimal {

    public Rayfish(int x, int y) {
        super();
        beratBadan = 1;
        jenisMakanan = 'k';
        isLiar = false;
        lokasi = new Point(x,y);
    }

    @Override
    public void tampilKarakter() {
        System.out.println("X");
    }

    @Override
    public void bersuara() {
        System.out.println("Lash, I'm a rayfish.");
    }

    @Override
    public void berenang() {
        getLokasi().move(1,1);
    }
    
}
