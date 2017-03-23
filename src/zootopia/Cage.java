/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zootopia;

import java.util.Arrays;

/**
 *
 * @author Thea Olivia
 * @param <Cell>
 */
//public class Cage<Cell> {
//	private Cell c;
//
//	public void add (Cell c) {
//		this.c = c;
//	}
//
//	public Cell getCell() {
//		return c;
//	}
//}

public class Cage {
    private final int kol;
    private final int bar;
    private final Cell[][] isiCage;
    
    public Cage(int m, int n) {
        kol = m;
        bar = n;
        isiCage = new Cell[kol][bar];
    }
    
    public void addCage(Cell c) {
        for (int i=0; i<bar; i++) {
            for (int j=0; j<kol; j++) {
                isiCage[i][j] = c;
            }
        }
    }
    
    public Cell getCageCell(int i, int j) {
        return isiCage[i][j];
    }
    
    public Cell[] getCageRow(int i, int j) {
        Cell[] row = new Cell[bar];
        for (i=0; i<bar; i++) {
            row[i] = isiCage[i][getCageCell(i,j).getCellCode()];
        }
        return row;
    }
    
    public void printCage(Cage cage) {
        int i,j;
        for (i=0; i<bar; i++) {
            for (j=0; j<kol; j++) {                
                System.out.print(getCageCell(i,j).getCellCode());
            }
            System.out.println();
        }
        //System.out.print()
//        for (i=0; i<bar; i++) {
//            System.out.print(getCageCell(i,j).getCellCode());
//        }
//        for (Cell[] row : getCageCell(i,j)) {
//            
//        }
//        System.out.println();
    }
}