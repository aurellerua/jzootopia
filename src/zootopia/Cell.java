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

public abstract class Cell {
    /**
     * variabel penampung kode bentuk polimorfik cell.
     */
    protected char code;
    /**
     * Getter untuk Cell yang berisi bentuk polimorfik Cell.
     * @return code kode dari jenis cell.
     */
    public char getCellCode() {
        return code;
    }
}