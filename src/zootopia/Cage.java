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
    
    /**
     * Konstruktor dari kelas Cage.
     * <p>
     * Membuat cage dengan ukuran tertentu
     * @param m banyak kolom,
     * @param n banyak baris,
     * @param c isi sel
     */
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
    /**
     * Menambah cage baru
     * <p>
     * @param c isi sel
     */
    public void addCage(Cell c) {
        for (int i=0; i<bar; i++) {
            for (int j=0; j<kol; j++) {
                isiCage[i][j] = c;
            }
        }
    }
    /**
     * Mengembalikan isi cage pada posisi tertentu
     * <p>
     * @param i posisi baris
     * @param j posisi kolom
     * @return isi cell
     */
    public Cell getCageCell(int i, int j) {
        return isiCage[i][j];
    }
    /**
     * Mengembalikan banyak cages yang dibuat
     * <p>
     * @return banyak cage yang dibuat
     */
    public static int getNumberOfCages() {
        return count_cage;
    }
    
    public void assignAnimal(int i, int j, Cage cage, Animal animal){
        isiCage[i][j] = animal;
    }
    
    /**
     * Mencetak cage ke layar
     * <p>
     * @param cage cage yang akan dicetak
     */
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