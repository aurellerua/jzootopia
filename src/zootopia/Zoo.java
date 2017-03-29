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
    
    private int frag_bar;
    private int frag_kol;
    private int x;
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

    public Zoo(int x, int y, int num_of_cage)
    {
        this.x = x;
        this.y = y;
        this.num_of_cage = num_of_cage;
        cell = new Cell[x][y];
        cage = new Cage(cage_bar,cage_kol,c);
        int it = Cage.getNumberOfCages();
        assert it <= num_of_cage;
        for (int i=0; i<x; i++) {
            for (int j=0; j<y; j++) {
                cell[i][j] = null;
            }
        }
    }
    
    public void assignCage(int cage_bar, int cage_kol, Cage cage) {
        Cell[][] temp;
        temp = new Cell[x+1][];
        System.arraycopy(cell, 0, temp, 0, x);
        temp[x]= new Cell[]{};
        
        for (int i=0; i<cage_bar; i++) {
            for (int j=0; j<cage_kol; j++) {
                assert this.isEmpty(i,j);
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
    
    public Cell getCell(int i, int j){
        return cell[i][j];
    }
    
    public void addCell(int x, int y) {
//        Cell[][] temp;
//        temp = new Cell[x+1][y+1];
//        int j = cell.length;
//        for (int i=0; i<frag_bar; i++) {
//            System.arraycopy(cell[i], 0, temp[i], 0, frag_kol);
//
//        }
        Cell [][] new_cell = new Cell[x][y];
        int new_x = Math.min(x, this.x);
        int new_y = Math.min(y, this.y);
        for (int i=0; i<new_y; i++) {
            System.arraycopy(cell, y, new_cell, 0, new_y);
        }
        cell = new_cell;
    }
    
    public boolean isEmpty(int i, int j) {
        return cell[i][j] == null;
    }
    
    public Pawn getPawn() {
        return pawn;
    }
    
    public void printZoo() {
        for (int i=0; i<x; i++) {
            for (int j=0; j<y; j++) {
                System.out.print(getCell(i,j).getCellCode());
            }
            System.out.println();
        }
    }
}