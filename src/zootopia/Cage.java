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
    /**
     * menghitung cage yang tercipta.
     */
    private static int countCage = 0;
    /**
     * kolom dari Cage yang tercipta.
     */
    private final int kol;
    /**
     * baris dari Cage yang tercipta.
     */
    private final int bar;
    /**
     * array dari cage.
     */
    private final Cell[][] isiCage;
    /**
     * penciptaan objek Animal.
     */
    private Animal animal;
    /**
     * Konstruktor dari kelas Cage.
     * <p>
     * Membuat cage dengan ukuran tertentu
     * @param m banyak kolom,
     * @param n banyak baris,
     * @param c isi sel
     */
    public Cage(final int m, final int n, final Cell c) {
        kol = m;
        bar = n;
        isiCage = new Cell[bar][kol];
        countCage++;
        for (int i = 0; i < bar; i++) {
            for (int j = 0; j < kol; j++) {
                isiCage[i][j] = c;
            }
        }
    }
    /**
     * Menambah cage baru.
     * <p>
     * @param c isi sel.
     */
    public final void addCage(final Cell c) {
        for (int i = 0; i < bar; i++) {
            for (int j = 0; j < kol; j++) {
                isiCage[i][j] = c;
            }
        }
    }
    /**
     * Mengembalikan isi cage pada posisi tertentu.
     * <p>
     * @param i posisi baris
     * @param j posisi kolom
     * @return isi cell
     */
    public final Cell getCageCell(final int i, final int j) {
        return isiCage[i][j];
    }
    /**
     * Mengembalikan banyak cages yang dibuat.
     * <p>
     * @return banyak cage yang dibuat.
     */
    public static int getNumberOfCages() {
        return countCage;
    }
    /**
     * assign animal ke dalam cage.
     * @param i posisi horisontal animal.
     * @param j posisi vertikal animal.
     * @param cage cage tempat menampung animal.
     * @param animal animal yang ditampung oleh cage.
     */
    public final void assignAnimal(int i, int j, Cage cage, Animal animal){
        isiCage[i][j] = animal;
    }
    /**
     * Mencetak cage ke layar.
     * <p>
     * @param cage cage yang akan dicetak.
     */
    public final void printCage(final Cage cage) {
        int i, j;
        for (i = 0; i < bar; i++) {
            for (j = 0; j < kol; j++) {        
                System.out.print(getCageCell(i, j).getCellCode());
            }
            System.out.println();
        }
    }
}