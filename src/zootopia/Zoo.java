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

	//Cell c;


    public Zoo(int x, int y)
    {
        Cell[][] cell = new Cell[x][y];
        for (int i=0; i<x; i++) {
            for (int j=0; j<y; j++) {
                cell[i][j] = new Cell() 
                {
                    //System.out.println(cell[i][j].getCellCode());
                };
            }
        }
    }
    
    public void printZoo() {
        for (int i=0; i<x; i++) {
            for (int j=0; j<y; j++) {
                System.out.println(cell[i][j].getCellCode());
            }
        }
    }
        
}