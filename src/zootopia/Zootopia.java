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
public class Zootopia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal c = new Cheetah(1,1);
        Cheetah cc = new Cheetah(0,1);
        
        //c.berjalan();
        c.bersuara();
        if (c.isHabitat('l')) {
            System.out.println("this is land animal");
        }
        System.out.println(c.getLokasi().getX());
        System.out.println(c.getNbMakanan());
        
        System.out.println("done");
        // TODO code application logic here

        
        Cage cageLand = new Cage(2,2);
        cageLand.addCage(new Land());
        
        System.out.println(cageLand.getCageCell(1, 1).getCellCode());
        
//        Cage<Land> cageland = new Cage<Land>();

//
//        cageland.add(new Land());
//        System.out.printf("Check land :%d\n\n", cageland.getCell());

    }
}
    

