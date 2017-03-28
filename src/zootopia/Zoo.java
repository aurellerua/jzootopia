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

    public Zoo(int x, int y, Cage cage[][])
    {
        this.x = x;
        this.y = y;
        //cell = new Cell[x][y];
        cage = new Cage[x][y];
        //cage = new Cage[][];
    }
    
    public Cage getCage(int i, int j){
        return cage[i][j];
    }
    
    public void printZoo() {
        for (int i=0; i<x; i++) {
            for (int j=0; j<y; j++) {
                getCage(i,j).printCage(cage);
            }
            System.out.println();
        }
    }
}