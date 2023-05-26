/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package examen3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mtisc
 */
public class TrabajadorPorHorasIT {
    
    public TrabajadorPorHorasIT() {
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
     * Test of calculoSueldoBruto method, of class TrabajadorPorHoras.
     */
    @Test
    public void testCalculoSueldoBruto() {
        System.out.println("calculoSueldoBruto");
        TrabajadorPorHoras instance = new TrabajadorPorHoras();
        double expResult = 0.0;
        double result = instance.calculoSueldoBruto();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of datosTrabajador method, of class TrabajadorPorHoras.
     */
    @Test
    public void testDatosTrabajador() {
        System.out.println("datosTrabajador");
        TrabajadorPorHoras instance = new TrabajadorPorHoras();
        instance.datosTrabajador();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
