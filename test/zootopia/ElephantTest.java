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
 * @author Aurelia
 */
public class ElephantTest {
    
    public ElephantTest() {
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
     * Test of tampilKarakter method, of class Elephant.
     */
    @Test
    public void testTampilKarakter() {
        System.out.println("tampilKarakter");
        Elephant instance = new Elephant(1,1);
        instance.tampilKarakter();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of bersuara method, of class Elephant.
     */
    @Test
    public void testBersuara() {
        System.out.println("bersuara");
        Elephant instance = new Elephant(1,1);
        instance.bersuara();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of berjalan method, of class Elephant.
     */
    @Test
    public void testBerjalan() {
        System.out.println("berjalan");
        Elephant instance = new Elephant(1,1);
        instance.berjalan();
        int expRes = 2;
        int res = instance.getLokasi().getX();
        assertEquals(expRes, res);
        System.out.println("new location (x): " + res);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
