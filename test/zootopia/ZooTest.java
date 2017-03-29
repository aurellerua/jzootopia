/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zootopia;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author theaolivia
 */
public class ZooTest {
    
    public ZooTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of assignCage method, of class Zoo.
     */
    @Test
    public void testAssignCage() {
        System.out.println("assignCage");
        int cage_bar = 0;
        int cage_kol = 0;
        Cage cage = new Cage(2,2,new Air());
        Zoo instance = new Zoo(5,5,2);
        instance.assignCage(cage_bar, cage_kol, cage);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of assignRestaurant method, of class Zoo.
     */
    @Test
    public void testAssignRestaurant() {
        System.out.println("assignRestaurant");
        int rest_bar = 0;
        int rest_kol = 0;
        Restaurant restaurant = new Restaurant();
        Zoo instance = new Zoo(5,5,2);
        instance.assignRestaurant(rest_bar, rest_kol, restaurant);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of assignPark method, of class Zoo.
     */
    @Test
    public void testAssignPark() {
        System.out.println("assignPark");
        int park_bar = 0;
        int park_kol = 0;
        Park park = new Park();
        Zoo instance = new Zoo(5,5,2);
        instance.assignPark(park_bar, park_kol, park);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of assignRoad method, of class Zoo.
     */
    @Test
    public void testAssignRoad() {
        System.out.println("assignRoad");
        int road_bar = 0;
        int road_kol = 0;
        Road road = new Road();
        Zoo instance = new Zoo(5,5,2);
        instance.assignRoad(road_bar, road_kol, road);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEntrance method, of class Zoo.
     */
    @Test
    public void testGetEntrance() {
        System.out.println("getEntrance");
        Zoo instance = new Zoo(5,5,2);
        Entrance expResult = new Entrance();
        Entrance result = instance.getEntrance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getExit method, of class Zoo.
     */
    @Test
    public void testGetExit() {
        System.out.println("getExit");
        Zoo instance = new Zoo(5,5,2);
        Exit expResult = new Exit();
        Exit result = instance.getExit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCell method, of class Zoo.
     */
    @Test
    public void testGetCell() {
        System.out.println("getCell");
        int i = 0;
        int j = 0;
        Zoo instance = new Zoo(5,5,2);
        Cell expResult = new Air();
        Cell result = instance.getCell(i, j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addCell method, of class Zoo.
     */
    @Test
    public void testAddCell() {
        System.out.println("addCell");
        int x = 0;
        int y = 0;
        Zoo instance = new Zoo(5,5,2);
        instance.addCell(x, y);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class Zoo.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        int i = 0;
        int j = 0;
        Zoo instance = new Zoo(5,5,2);
        boolean expResult = false;
        boolean result = instance.isEmpty(i, j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPawn method, of class Zoo.
     */
    @Test
    public void testGetPawn() {
        System.out.println("getPawn");
        Zoo instance = new Zoo(5,5,2);
        Pawn expResult = new Pawn();
        Pawn result = instance.getPawn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of printZoo method, of class Zoo.
     */
    @Test
    public void testPrintZoo() {
        System.out.println("printZoo");
        Zoo instance = new Zoo(5,5,2);
        instance.printZoo();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
