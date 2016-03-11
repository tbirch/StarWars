/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.starwars.controller;

import byui.cit260.starwars.controller.CollectionController;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Jason
 */
public class CollectionControllerTest {
    
    public CollectionControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        //("The test case is a prototype.");
    }

    /**
     * Test of calculateCylinderVolume method, of class CollectionController.
     */
    @Test
    public void testCalculateCylinderVolume() {
        System.out.println("calculateCylinderVolume1");
        double radius = 8.0;
        double height = 23.0;
        CollectionController instance = new CollectionController();
        double expResult = 4622.08;
        double result = instance.calculateCylinderVolume(radius, height);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("calculateCylinderVolume2");
       radius = -19;
       height = 67.0;
       // CollectionController instance = new CollectionController();
        expResult = -1;
        result = instance.calculateCylinderVolume(radius, height);
        assertEquals(expResult, result, 0.1);
        
        System.out.println("calculateCylinderVolume3");     
        radius = 0.0;
        height = 7.0;
        //lectionController instance = new CollectionController();
        expResult = -1;
        result = instance.calculateCylinderVolume(radius, height);
        assertEquals(expResult, result, 0.1);
        
        System.out.println("calculateCylinderVolume4");
        radius = 99.0;
        height = -86.0;
        //CollectionController instance = new CollectionController();
        expResult = -1;
        result = instance.calculateCylinderVolume(radius, height);
        assertEquals(expResult, result, 0.1);
        
        System.out.println("calculateCylinderVolume5");
        radius = 36.0;
        height = 22.0;
        //CollectionController instance = new CollectionController();
        expResult = 89527.68;
        result = instance.calculateCylinderVolume(radius, height);
        assertEquals(expResult, result, 0.1);
    }
    
}
