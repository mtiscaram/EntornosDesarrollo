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
public class TrabajadorPorComisionIT {
    
    public TrabajadorPorComisionIT() {
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
     * Test of getComision method, of class TrabajadorPorComision.
     */
    @Test
    public void testGetComision() {
        System.out.println("getComision");
        TrabajadorPorComision instance = new TrabajadorPorComision();
        double expResult = 0.0;
        double result = instance.getComision();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComision method, of class TrabajadorPorComision.
     */
    @Test
    public void testSetComision() {
        System.out.println("setComision");
        double comision = 0.0;
        TrabajadorPorComision instance = new TrabajadorPorComision();
        instance.setComision(comision);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of datosTrabajador method, of class TrabajadorPorComision.
     */
    @Test
    public void testDatosTrabajador() {
        System.out.println("datosTrabajador");
        TrabajadorPorComision instance = new TrabajadorPorComision();
        instance.datosTrabajador();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculoSueldoBruto method, of class TrabajadorPorComision.
     */
    @Test
    public void testCalculoSueldoBruto() {
        System.out.println("calculoSueldoBruto");
        TrabajadorPorComision instance = new TrabajadorPorComision();
        double comision = 100.00;
        double precioHora = 10;
        double horasTrabajadas = 10;
        double expResult = 200.0;
        double result = instance.calculoSueldoBruto();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
