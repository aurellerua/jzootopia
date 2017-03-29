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
     * banyaknya baris
     */
    private int x;
    /**
     * banyaknya kolom
     */
    private int y;
    private int num_of_cage;
    private int cage_bar;
    private int cage_kol;
    private int rest_bar;
    private int rest_kol;
    private int park_bar;
    private int park_kol;
    private int road_bar;
    private int road_kol;
    private Cell cell[][];
    private Cell c;
    private Cage cage;
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
     * @param  num_of_cage banyaknya cage yang diciptakan
     */
    public Zoo(int x, int y, int num_of_cage) {
        this.x = x;
        this.y = y;
        this.num_of_cage = num_of_cage;
        cell = new Cell[x][y];
        cage = new Cage(cage_bar, cage_kol, c);
        int it = Cage.getNumberOfCages();
        assert it <= num_of_cage;
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
     * @param  cage_bar  an absolute URL giving the base location of the image
     * @param  cage_kol the location of the image, relative to the url argument
     * @return      the image at the specified URL
     * @see         Zoo
     */
    public void assignCage(int cage_bar, int cage_kol, Cage cage) {
        Cell[][] temp;
        temp = new Cell[x + 1][];
        System.arraycopy(cell, 0, temp, 0, x);
        temp[x] = new Cell[]{};        
        for (int i = 0; i < cage_bar; i++) {
            for (int j = 0; j < cage_kol; j++) {
                assert this.isEmpty(i, j);
                cell[i][j] = cage.isiCage[i][j];
            }
        }
    }
    
    public void assignRestaurant(int rest_bar, int rest_kol, Restaurant restaurant) {
        for (int i=0; i<rest_bar; i++) {
            for (int j=0; j<rest_kol; j++) {
                assert this.isEmpty(i,j);
                cell[i][j] = restaurant;
            }
        }  
    }
    
    public void assignPark(int park_bar, int park_kol, Park park) {  
        for (int i=0; i<park_bar; i++) {
            for (int j=0; j<park_kol; j++) {
                assert this.isEmpty(i,j);
                cell[i][j] = park;             
            }
        }
    }
    
    public void assignRoad(int road_bar, int road_kol, Road road) {
        for (int i=0; i<road_bar; i++) {
            for (int j=0; j<road_kol; j++) {
                assert this.isEmpty(i,j);
                cell[i][j] = road;
            }
        }
    }
    
    public Entrance getEntrance() {
        return entrance;
    }
    
    public Exit getExit() {
        return exit;
    }
    /**
     * Method untuk mengembalikan isi dari matriks zoo.
     * <p>
     * Menciptakan FlyingAnimal dengan habitat.
     */    
    public Cell getCell(int i, int j){
        return cell[i][j];
    }    
    public void addCell(int x, int y) {
        Cell [][] new_cell = new Cell[x][y];
        int new_x = Math.min(x, this.x);
        int new_y = Math.min(y, this.y);
        for (int i=0; i<new_x; i++) {
            System.arraycopy(cell, y, new_cell, 0, new_y);
        }
        cell = new_cell;
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
     * Mengecek isi matriks. 
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
    
    public void assignPawn(int i, int j, Road road, Animal animal) {
        cell[i][j] = pawn;
    }
    
    public void assignAnimal(int i, int j, Cage cage, Animal animal){
        if (animal.isHabitat(cell[i][j].getCellCode()))
            cell[i][j] = animal;
    }
    /**
     * Menampilkan matriks zoo.
     * <p>
     * @return      sebuah matriks zoo yang nampak di layar.
     */
    public void printZoo() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(getCell(i, j). getCellCode());
            }
            System.out.println();
        }
    }
}