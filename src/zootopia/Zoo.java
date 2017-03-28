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
    private int x;
    private int y;
    private Cell cell[][];
    private Cage cage[][];

    public Zoo(int x, int y)
    {
        this.x = x;
        this.y = y;
        cell = new Cell[x][y];
        
        for (int i=0; i<x; i++) {
            for (int j=0; j<y; j++) {
                
            }
        }
    }
    
    public void assignCage(Cage cage) {
        for (int i=0; i<x; i++) {
            for (int j=0; j<y; j++) {
                
            }
        }
    }
    
    public void assignRestaurant(Restaurant restaurant) {
    
    }
    
    public void assignPark(Park park) {
        
    }
    
    public Cell getCell(int i, int j){
        return cell[i][j];
    }
    
    public void printZoo() {
        for (int i=0; i<x; i++) {
            for (int j=0; j<y; j++) {
                
            }
            System.out.println();
        }
    }
}