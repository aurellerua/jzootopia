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
public abstract class Animal {
    
    protected int beratBadan;
    protected char jenisMakanan;
    protected boolean isLiar;
    protected Point lokasi;
    protected char habitat[];
    
    
    public int getBeratBadan() {
        return beratBadan;
    }
    
    public char getJenisMakanan() {
        return jenisMakanan;
    }
    
    public boolean checkIsLiar() {
        return isLiar;
    }
    
    public Point getLokasi() {
        return lokasi;
    }
    
    public boolean isHabitat(char c) {
        return (habitat[0]==c || habitat[1]==c);
    }
    
    public abstract void tampilKarakter();
    public abstract void bersuara();
}
