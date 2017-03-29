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
public class ParrotTest {
    
    public ParrotTest() {
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
     * Test of tampilKarakter method, of class Parrot.
     */
    @Test
    public void testTampilKarakter() {
        System.out.println("tampilKarakter");
        Parrot instance = new Parrot(1,1);
        instance.tampilKarakter();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of bersuara method, of class Parrot.
     */
    @Test
    public void testBersuara() {
        System.out.println("bersuara");
        Parrot instance = new Parrot(1,1);
        instance.bersuara();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of berjalan method, of class Parrot.
     */
    @Test
    public void testBerjalan() {
        System.out.println("berjalan");
        Parrot instance = new Parrot(1,1);
        instance.berjalan();
        int expRes = 2;
        int res = instance.getLokasi().getX();
        assertEquals(expRes, res);
        System.out.println("new location (x): " + res);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of terbang method, of class Parrot.
     */
    @Test
    public void testTerbang() {
        System.out.println("terbang");
        Parrot instance = new Parrot(1,1);
        instance.terbang();
        int expRes = 2;
        int res = instance.getLokasi().getX();
        assertEquals(expRes, res);
        System.out.println("new location (x): " + res);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
