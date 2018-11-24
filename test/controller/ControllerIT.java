/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.color.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AW 13
 */
public class ControllerIT {
    
    public ControllerIT() {
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
     * Test of getPrimary method, of class Controller.
     */
    @Test
    public void testGetPrimary() {
        System.out.println("getPrimary");
        Controller instance = new Controller();
        List<Color> result = instance.getPrimary();
        assertEquals(3, result.size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mixTwoColors method, of class Controller.
     */
    @Test
    public void testMixTwoColors() {
        System.out.println("mixTwoColors");
        String nameColor1 = "AMARILLO";
        String nameColor2 = "AZUL";
        Controller instance = new Controller();
        Color expResult = new Color("AZUL", "SECUNDARIO", "#008F39","AMARILLOAZUL");
        Color result = instance.mixTwoColors(nameColor1, nameColor2);
        assertEquals(expResult.getName(), result.getName());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
