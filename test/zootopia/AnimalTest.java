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
public class AnimalTest {
    
    public AnimalTest() {
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
     * Test of addMakanan method, of class Animal.
     */
    @org.junit.Test
    public void testAddMakanan() {
        System.out.println("addMakanan");
        char c = ' ';
        Animal instance = new AnimalImpl();
        instance.addMakanan(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBeratBadan method, of class Animal.
     */
    @org.junit.Test
    public void testGetBeratBadan() {
        System.out.println("getBeratBadan");
        Animal instance = new AnimalImpl();
        int expResult = 0;
        int result = instance.getBeratBadan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJenisMakanan method, of class Animal.
     */
    @org.junit.Test
    public void testGetJenisMakanan() {
        System.out.println("getJenisMakanan");
        Animal instance = new AnimalImpl();
        char expResult = ' ';
        char result = instance.getJenisMakanan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkIsLiar method, of class Animal.
     */
    @org.junit.Test
    public void testCheckIsLiar() {
        System.out.println("checkIsLiar");
        Animal instance = new AnimalImpl();
        boolean expResult = false;
        boolean result = instance.checkIsLiar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLokasi method, of class Animal.
     */
    @org.junit.Test
    public void testGetLokasi() {
        System.out.println("getLokasi");
        Animal instance = new AnimalImpl();
        Point expResult = null;
        Point result = instance.getLokasi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHabitat method, of class Animal.
     */
    @org.junit.Test
    public void testIsHabitat() {
        System.out.println("isHabitat");
        char c = ' ';
        Animal instance = new AnimalImpl();
        boolean expResult = false;
        boolean result = instance.isHabitat(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNbMakanan method, of class Animal.
     */
    @org.junit.Test
    public void testGetNbMakanan() {
        System.out.println("getNbMakanan");
        Animal instance = new AnimalImpl();
        float expResult = 0.0F;
        float result = instance.getNbMakanan();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tampilKarakter method, of class Animal.
     */
    @org.junit.Test
    public void testTampilKarakter() {
        System.out.println("tampilKarakter");
        Animal instance = new AnimalImpl();
        instance.tampilKarakter();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bersuara method, of class Animal.
     */
    @org.junit.Test
    public void testBersuara() {
        System.out.println("bersuara");
        Animal instance = new AnimalImpl();
        instance.bersuara();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfAnimals method, of class Animal.
     */
    @org.junit.Test
    public void testGetNumOfAnimals() {
        System.out.println("getNumOfAnimals");
        int expResult = 0;
        int result = Animal.getNumOfAnimals();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AnimalImpl extends Animal {

        public char tampilKarakter() {
            return code;
        }

        public void bersuara() {
        }
    }
    
}
