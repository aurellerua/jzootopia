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
public class Cage<Cell> {
	private Cell c;

	public void add (Cell c) {
		this.c = c;
	}

	public Cell getCell() {
		return c;
	}
}