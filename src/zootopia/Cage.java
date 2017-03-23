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
    private int kol;
    private int bar;
    private Cell[][] isiCage;
    
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
    
}