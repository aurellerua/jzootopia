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
public class Zoo {
    /**
     * banyaknya baris.
     */
    private final int x;
    /**
     * banyaknya kolom.
     */
    private final int y;
    /**
     * banyaknya cage yang diciptakan.
     */
    private final int numOfCage;
    /**
     * banyaknya baris dari cage.
     */
    private int cageBar;
    /**
     * banyaknya kolom dari cage.
     */
    private int cageKol;
    /**
     * banyaknya baris dari restaurant.
     */
    private int restBar;
    /**
     * banyaknya kolom dari restaurant.
     */
    private int restKol;
    /**
     * banyaknya baris dari park.
     */
    private int parkBar;
    /**
     * banyaknya kolom dari park.
     */
    private int parkKol;
    /**
     * banyaknya baris dari road.
     */
    private int roadBar;
    /**
     * banyaknya kolom dari road.
     */
    private int road_kol;
    private Cell cell[][];
    private Cell c;
    private final Cage cage;
    private Restaurant restaurant;
    private Park park;
    private Entrance entrance;
    private Exit exit;
    private Pawn pawn;
    private Animal animal;
    private Road road;
    /**
     * Konstruktor dari kelas Zoo. 
     * <p>
     * Menciptakan sebuah tabel dua dimensi.
     *
     * @param  x banyaknya baris dari matriks Zoo.
     * @param  y banyaknya kolom dari matriks Zoo.
     * @param  numOfCage banyaknya cage yang diciptakan
     */
    public Zoo(int x, int y, int numOfCage) {
        this.x = x;
        this.y = y;
        this.numOfCage = numOfCage;
        cell = new Cell[x][y];
        cage = new Cage(cageBar, cageKol, c);
        int it = Cage.getNumberOfCages();
        assert it <= numOfCage;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                cell[i][j] = null;
            }
        }
    }    
    /**
      * Memperluas matriks Zoo dengan menambahkan Cage.
      * <p>
      *
      * @param  cage_bar baris maksimal dari cage yang diciptakan.
      * @param  cage_kol kolom maksimal dari cage yang diciptakan.
      * @param cage cage yang akan diassign ke zoo.
      * @see         Zoo
      */
    public final void assignCage(int cage_bar, int cage_kol, Cage cage) {
        Cell[][] temp;
        temp = new Cell[x + 1][];
        System.arraycopy(cell, 0, temp, 0, x);
        temp[x] = new Cell[]{ c };        
        for (int i = 0; i < cage_bar; i++) {
            for (int j = 0; j < cage_kol; j++) {
                assert this.isEmpty(i, j);
                cell[i][j] = null;
            }
        }
    }
    /**
      * mengkopi restaurant ke zoo.
      * <p>
      * @param restaurant restaurant yang diassign
      * @param  restBar  baris maksimal restaurant
      * @param  restKol kolom maksimal restaurant
      * @see         Zoo
      */
    public void assignRestaurant(int restBar, int restKol, int x, int y, Restaurant restaurant) {
        for (int i = 0; i < restBar; i++) {
            for (int j = 0; j < restKol; j++) {
                assert this.isEmpty(i+x-1, j+y-1);
                cell[i+x-1][j+y-1] = restaurant;
            }
        }  
    }
    /**
      * mengkopi park ke zoo.
      * <p>
      * @param park restaurant yang diassign
      * @param  parkBar  baris maksimal park
      * @param  parkKol kolom maksimal park
      * @see         Zoo
      */
    public void assignPark(int parkBar, int parkKol, int x, int y, Park park) {  
        for (int i = 0; i < parkBar; i++) {
            for (int j = 0; j < parkKol; j++) {
                assert this.isEmpty(i+x-1, j+y-1);
                cell[i+x-1][j+y-1] = park;        
            }
        }
    }
    /**
      * mengkopi road ke zoo.
      * <p>
      * @param road restaurant yang diassign
      * @param  roadBar  baris maksimal restaurant
      * @param  roadKol kolom maksimal restaurant
      * @see         Zoo
      */
    public void assignRoad(int roadBar, int roadKol, Road road) {
        for (int i = 0; i < roadBar; i++) {
            for (int j = 0; j < roadKol; j++) {
                assert this.isEmpty(i, j);
                cell[i][j] = road;
            }
        }
    }
    
    public int getRow() {
        return x;
    }
    
    public int getCol() {
        return y;
    }
    
    public Entrance getEntrance() {
        return entrance;
    }
    
    public Exit getExit() {
        return exit;
    }
    /**
     * Method untuk mengembalikan isi dari matriks zoo.
     * @param i posisi cell secara horizontal.
     * @param j posisi cell secara vertikal.
     * @return isi dari cell dengan posisi pada i,j.
     */    
    public Cell getCell(int i, int j){
        return cell[i][j];
    }
    /**
     * Menambah cell.
     * @param x menambahkan cell secara horizontal.
     * @param y menambahkan cell secara vertikal.
     */
    public void addCell(int x, int y) {
        Cell[][] newCell = new Cell[x][y];
        int newX = Math.min(x, this.x);
        int newY = Math.min(y, this.y);
        for (int i = 0; i < newX; i++) {
            System.arraycopy(cell, y, newCell, 0, newY);
        }
        cell = newCell;
    }
    /**
     * Meng-generate zoo baru
     * @param  deltaX    pertambahan baris
     * @param  deltaY    pertambahan kolom
     * @param  cell      tabel lama
     * @see    Cell
     */
    public void extendZoo(int deltaX, int deltaY, Cell cell) {
        int newX = x + deltaX;
        int newY = y + deltaY;
        Cell[][] newCell = new Cell[newX][newY];
        for (int i = 0; i < newX; i++) {
            for (int j = 0; j < newY; j++) {
                newCell[i][j] = cell;
            }
        }
        //return newCell;
    }
    /**
     * Mengecek apakah matriks mengandung objek null. 
     * <p>
     * Jika kosong, maka akan mengembalikan true.
     * @param  i    baris yang dicek
     * @param  j    kolom yang dicek
     * @return      nilai true jika didapati isi matriks adalah kosong.
     * @see         boolean
     */
    public boolean isEmpty(int i, int j) {
        return cell[i][j] == null;
    }
    /**
     * Mengembalikan assignment pengunjung pada Road.
     * @param i posisi pengunjung secara horizontal.
     * @param j posisi pengunjung secara vertikal.
     * @param road road tempat menampung pengunjung.
     * @param animal animal yang ditaruh di cage.
     */
    public void assignPawn(int i, int j, Road road, Animal animal) {
        cell[i][j] = pawn;
    }
    /**
     * Menampilkan matriks zoo.
     * @param i posisi animal secara horizontal.
     * @param j posisi animal secara vertikal.
     * @param cage cage tempat menampung animal.
     * @param animal animal yang ditaruh di cage.
     */
    public void assignAnimal(int i, int j, Cage cage, Animal animal){
        if (animal.isHabitat(cell[i][j].getCellCode())) {
            cell[i][j] = animal;
        }
    }
    /**
     * Menampilkan matriks zoo.
     */
    public void printZoo() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (!isEmpty(i,j))
                    System.out.print(getCell(i, j).getCellCode());
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}