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
    protected char[] habitat;
    
    static float nbDaging = 0;
    static float nbSayur = 0;
    
    public void addMakanan(char c) {
        if (c=='k') {
            nbDaging = (float) (nbDaging + (0.02*beratBadan));
            System.out.println("animal carnivore!");
        }
        else if (c=='h') {
            nbSayur = (float) (nbSayur + (0.02*beratBadan));
        }
        else if (c=='o') {
            nbDaging = (float) (nbDaging + (0.01*beratBadan));
            nbSayur = (float) (nbSayur + (0.02*beratBadan));
        }
    }
    
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
    
    public float getNbMakanan() {
        return nbDaging + nbSayur;
    }
    
    public abstract void tampilKarakter();
    public abstract void bersuara();
}
