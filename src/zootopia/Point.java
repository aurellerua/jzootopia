/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zootopia;

/**
 *
 * @author Aurelia
 */
class Point {
    private int x;
    private int y;
    /**
     * Konstruktor dari kelas Point.
     * <p>
     * Menciptakan sebuah point (0,0).
     */
    public Point() {
        x = 0;
        y = 0;
    }
    /**
     * Konstruktor dari kelas Point.
     * <p>
     * Menciptakan sebuah point (x,y).
     * @param x posisi x
     * @param y posisi y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setX(int newX) {
        x = newX;
    }
    
    public void setY(int newY) {
        y = newY;
    }
    
    public void move(int dx, int dy) {
        if (x+dx>3)
            x=x-(3-dx);
        else
            x+=dx;
        assert x>3;
        if (y+dy>3)
            y=y-(3-dy);
        else
            y+=dy;
        assert y>3;
    }
    
    public boolean isEqual(Point P1, Point P2) {
        return (P1.getX()==P2.getX()) && (P1.getY()==P2.getY());
    }
}
