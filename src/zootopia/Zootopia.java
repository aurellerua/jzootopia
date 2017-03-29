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
        /* 
         *  Create animals.
         */
        Animal c = new Cheetah(1, 1);
        /* 
         *  Create cheetah.
         */
        Cheetah cc = new Cheetah(0, 1);    
        /* 
         *  get cheetah's sound.
         */
        c.bersuara();
        if (c.isHabitat('l')) {
            System.out.println("this is land animal");
        }
        System.out.println(c.getLokasi().getX());
        System.out.println(c.getNbMakanan());        
        System.out.println("done");
        /* 
         *  Create cages from respective habitat
         */
        Cage cageLand = new Cage(4,4,new Land());
        Cage cageWater = new Cage(2,1,new Water());
        Cage cageAir = new Cage(1,2,new Air());
        Park park = new Park();
        Restaurant restaurant = new Restaurant();
        Road road = new Road();
        
        //cageLand.addCage(new Land());
        //cageLand.printCage(cageLand);

        Zoo zoo = new Zoo(2,2,3);
        zoo.assignCage(2,2,cageLand);
        //zoo.addCell(4,4,road);
        zoo.addCell(3,2);
        zoo.assignPark(2,2,park);
        //zoo.assignRestaurant(2,4,restaurant);
        //zoo.assignRoad(1,10,road);       
        zoo.printZoo();
    }
}
    

