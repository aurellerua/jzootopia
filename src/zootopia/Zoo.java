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
    private Cell cell[][];
    private Cage cage;
    private Restaurant restaurant;
    private Park park;
    private Entrance entrance;
    private Exit exit;

    public Zoo(int x, int y, int num_of_cage)
    {
        this.x = x;
        this.y = y;
        this.num_of_cage = num_of_cage;
//        this.park_bar = park_bar;
//        this.park_kol = park_kol;
//        this.rest_bar = rest_bar;
//        this.rest_kol = rest_kol;
        cell = new Cell[x][y];
        for (int it=0; it<num_of_cage; it++) cage = new Cage(cage_bar,cage_kol);
    }
    
    public void assignCage(int cage_bar, int cage_kol, Cage cage) {
        //assert Cage <= num_of_cage;
        for (int i=0; i<cage_bar; i++) {
            for (int j=0; j<cage_kol; j++) {
                cell[i][j] = cage.getCageCell(i,j);
            }
        }
    }
    
    public void assignRestaurant(int rest_bar, int rest_kol, Restaurant restaurant) {
        for (int i=0; i<rest_bar; i++) {
            for (int j=0; j<rest_kol; j++) {
                cell[i][j] = getCell(i,j);
            }
        }  
    }
    
    public void assignPark(int park_bar, int park_kol, Park park) {
        for (int i=0; i<park_bar; i++) {
            for (int j=0; j<park_kol; j++) {
                cell[i][j] = getCell(i,j);
            }
        }
    }
    
    public void assignRoad(int i, int j, Road road) {
        for (int _i=0; _i<i; _i++) {
            for (int _j=0; _j<j; _j++) {
                cell[_i][_j] = getCell(_i,_j);
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
    
    public void addCell(int frag_bar, int frag_kol, Cell c) {
        for (int i=0; i<frag_bar; i++) {
            for (int j=0; j<frag_kol; j++) {
                cell[i][j] = c;
            }
        }
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