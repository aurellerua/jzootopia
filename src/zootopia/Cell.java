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
//public class Cell {
//	int x;
//	int y;
//	static char val = '\0';
//
//	// public Cell(int _x, int _y) {
//	// 	x = _x;
//	// 	y = _y;
//	// 	val = '\0';
//	// }
//
//	public int getX() {
//		return x;
//	}
//
//	public int getY() {
//		return y;
//	}
//	public char getChar() {
//		return val;
//	}
//}

public abstract class Cell {
    protected char code;
    
    public char getCellCode() {
        return code;
    }
}