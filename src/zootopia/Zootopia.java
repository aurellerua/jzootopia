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
        
        c.bersuara();
        if (c.isHabitat('l')) {
            System.out.println("this is land animal");
        }
        System.out.println(c.getLokasi().getX());
        System.out.println(c.getNbMakanan());
        
        System.out.println("done");
        
        Cage cageLand = new Cage(2,2);
        Cage cageWater = new Cage(2,1);
        Cage cageAir = new Cage(1,2);
        Park park = new Park();
        
        //cageLand.addCage(new Land());
//        cageWater.addCage(new Water());
//        cageAir.addCage(new Air());
        
        //cageLand.printCage(cageLand);
        cageLand.addCage(new Land());
        cageLand.printCage(cageLand);
        
        Zoo zoo = new Zoo(6,10,3);
        zoo.assignCage(2, 2, cageLand);

        zoo.printZoo();
        
//        Cage<Land> cageland = new Cage<Land>();

//
//        cageland.add(new Land());
//        System.out.printf("Check land :%d\n\n", cageland.getCell());

    }
}
    

