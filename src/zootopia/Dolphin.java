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
public class Dolphin extends WaterAnimal {

    public Dolphin(int x, int y) {
        super();
        beratBadan = 500;
        jenisMakanan = 'k';
        isLiar = false;
        lokasi = new Point(x,y);
        addMakanan(jenisMakanan);
        code = 'I';
    }

    @Override
    public char tampilKarakter() {
        return code;
    }

    @Override
    public void bersuara() {
        System.out.println("Hoo, I'm a dolphin.");
    }

    @Override
    public void berenang() {
        getLokasi().move(1,1);
    }
    
}
