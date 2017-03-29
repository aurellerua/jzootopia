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
public abstract class Animal extends Cell {
    /**
     * counter banyaknya hewan yang tercipta.
     */
    protected static int numOfAnimals = 0;
    /**
     * berat badan.
     */
    protected int beratBadan;
    /**
     * jenis makanan.
     */
    protected char jenisMakanan;
    /**
     * TRUE jika liar
     */
    protected boolean isLiar;
    /**
     * mengembalikan lokasi berupa Point.
     */
    protected Point lokasi;
    /**
     * habitat hewan.
     */
    protected char[] habitat;
    /**
     * konstanta pengali untuk digunakan di method addMakanan(c).
     */
    protected int constant1 = (int)0.01;
    /**
     * konstanta pengali untuk digunakan di method addMakanan(c).
     */
    protected int constant2 = (int)0.02;
    /**
     * counter banyaknya daging untuk karnivora.
     */
    static float nbDaging = 0;
    /**
     * counter banyaknya sayur untuk herbivora.
     */
    static float nbSayur = 0;
    /**
     * kode untuk animal.
     */
    protected char code;
    /**
     * Konstruktor dari kelas Animal.
     * <p>
     * Menghitung animal yang diciptakan.
     */
    public Animal() {
        numOfAnimals++;
    }
    /**
     * Menambah makanan dari Animal.
     * <p>
     * @param c char yang merupakan tag dari makanan.
     */
    public void addMakanan(char c) {
        if (c == 'k') {
            nbDaging = (float) (nbDaging + (constant2 * beratBadan));
        }
        else if (c == 'h') {
            nbSayur = (float) (nbSayur + (constant2 * beratBadan));
        }
        else if (c == 'o') {
            nbDaging = (float) (nbDaging + (constant1 * beratBadan));
            nbSayur = (float) (nbSayur + (constant2 * beratBadan));
        }
    }
    /**
     * Getter dari berat badan animal.
     * @return beratBadan berat badan.
     */
    public int getBeratBadan() {
        return beratBadan;
    }
    /**
     * Getter dari jenis makanan.
     * @return jenisMakanan.
     */
    public char getJenisMakanan() {
        return jenisMakanan;
    }
    /**
     * Getter dari liar.
     * @return true jika liar.
     */
    public boolean checkIsLiar() {
        return isLiar;
    }
    /**
     * Getter lokasi.
     * @return lokasi.
     */
    public Point getLokasi() {
        return lokasi;
    }
    /**
     * Mengecek apakah habitat atau bukan.
     * @param c kode habitat yang akan dicek.
     * @return true jika sesuai dengan hewan.
     */
    public boolean isHabitat(char c) {
        return (habitat[0] == c || habitat[1] == c);
    }
    /**
     * getter banyak makanan total.
     * @return banyak makanan total yang tercipta.
     */
    public float getNbMakanan() {
        return nbDaging + nbSayur;
    }
    /**
     * fungsi abstrak menampilkan karakter.
     * @return char untuk menampilkan karakter
     */
    public abstract char tampilKarakter();
    /**
     * fungsi abstrak untuk menampilkan suara hewan.
     */
    public abstract void bersuara();
    /**
     * Getter dari banyaknya hewan yang tercipta.
     * @return num_of_animals banyaknya hewan yang tercipta.
     */
    public static int getNumOfAnimals() {
        return numOfAnimals;
    }
}
