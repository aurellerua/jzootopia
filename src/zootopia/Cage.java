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
    private static int count_cage = 0;
    private final int kol;
    private final int bar;
    final Cell[][] isiCage;
    private Animal animal;
    
    public Cage(int m, int n, Cell c) {
        kol = m;
        bar = n;
        isiCage = new Cell[bar][kol];
        count_cage++;
        for (int i=0; i<bar; i++) {
            for (int j=0; j<kol; j++) {
                isiCage[i][j] = c;
            }
        }
    }
    
    public void addCage(Cell c) {
        for (int i=0; i<bar; i++) {
            for (int j=0; j<kol; j++) {
                isiCage[i][j] = c;
            }
        }
    }
    
    public Cell getCageCell(int i, int j) {
        return isiCage[i][j];
    }
    
    public static int getNumberOfCages() {
        return count_cage;
    }
    
    public void assignAnimal(int i, int j, Cage cage, Animal animal){
        isiCage[i][j] = animal;
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