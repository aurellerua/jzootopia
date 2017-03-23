/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zootopia;



/**
 *
 * @author Thea Olivia
 */
public class Cage {
    private final int kol;
    private final int bar;
    private final Cell[][] isiCage;
    
    public Cage(int m, int n) {
        kol = m;
        bar = n;
        isiCage = new Cell[kol][bar];
    }
    
    public void addCage(Cell c) {
        for (int i=0; i<bar; i++) {
            for (int j=0; j<kol; j++) {
                isiCage[j][i] = c;
            }
        }
    }
    
    public Cell getCageCell(int i, int j) {
        return isiCage[j][i];
    }
    
    public void printCage(Cage cage) {
        int i,j;
        for (i=0; i<bar; i++) {
            for (j=0; j<kol; j++) {                
                System.out.print(getCageCell(i,j).getCellCode());
            }
            System.out.println();
        }
    }
}