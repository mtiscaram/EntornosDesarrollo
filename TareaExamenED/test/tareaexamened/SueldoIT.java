/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package tareaexamened;

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
public class SueldoIT {
    
    public SueldoIT() {
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
     * Test of getHorasTrabajadas method, of class Sueldo.
     */
    @Test
    public void testGetHorasTrabajadas() {
        System.out.println("getHorasTrabajadas");
        Sueldo instance = new Sueldo();
        double expResult = 0.0;
        double result = instance.getHorasTrabajadas();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHorasTrabajadas method, of class Sueldo.
     */
    @Test
    public void testSetHorasTrabajadas() {
        System.out.println("setHorasTrabajadas");
        double horasTrabajadas = 0.0;
        Sueldo instance = new Sueldo();
        instance.setHorasTrabajadas(horasTrabajadas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioHora method, of class Sueldo.
     */
    @Test
    public void testGetPrecioHora() {
        System.out.println("getPrecioHora");
        Sueldo instance = new Sueldo();
        double expResult = 0.0;
        double result = instance.getPrecioHora();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioHora method, of class Sueldo.
     */
    @Test
    public void testSetPrecioHora() {
        System.out.println("setPrecioHora");
        double precioHora = 0.0;
        Sueldo instance = new Sueldo();
        instance.setPrecioHora(precioHora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSueldoBruto method, of class Sueldo.
     */
    @Test
    public void testGetSueldoBruto() {
        System.out.println("getSueldoBruto");
        Sueldo instance = new Sueldo();
        double expResult = 0.0;
        double result = instance.getSueldoBruto();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSueldoBruto method, of class Sueldo.
     */
    @Test
    public void testSetSueldoBruto() {
        System.out.println("setSueldoBruto");
        double sueldoBruto = 0.0;
        Sueldo instance = new Sueldo();
        instance.setSueldoBruto(sueldoBruto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRetencion method, of class Sueldo.
     */
    @Test
    public void testGetRetencion() {
        System.out.println("getRetencion");
        Sueldo instance = new Sueldo();
        double expResult = 0.0;
        double result = instance.getRetencion();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRetencion method, of class Sueldo.
     */
    @Test
    public void testSetRetencion() {
        System.out.println("setRetencion");
        double retencion = 0.0;
        Sueldo instance = new Sueldo();
        instance.setRetencion(retencion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSueldoNeto method, of class Sueldo.
     */
    @Test
    public void testGetSueldoNeto() {
        System.out.println("getSueldoNeto");
        Sueldo instance = new Sueldo();
        double expResult = 0.0;
        double result = instance.getSueldoNeto();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSueldoNeto method, of class Sueldo.
     */
    @Test
    public void testSetSueldoNeto() {
        System.out.println("setSueldoNeto");
        double sueldoNeto = 0.0;
        Sueldo instance = new Sueldo();
        instance.setSueldoNeto(sueldoNeto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculoSueldoBruto method, of class Sueldo.
     */
    /*@Test
    public void testCalculoSueldoBruto() {
        System.out.println("calculoSueldoBruto1");
        double horasTrabajadas = 0.0;
        double precioHora = 0.0;
        double expResult = 0.0;
        double result = Sueldo.calculoSueldoBruto(horasTrabajadas, precioHora);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }*/
    /*@Test
    public void testCalculoSueldoBruto() {
        System.out.println("calculoSueldoBruto2");
        double horasTrabajadas = 10.0;
        double precioHora = 20.0;
        double expResult = 200.0;
        double result = Sueldo.calculoSueldoBruto(horasTrabajadas, precioHora);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }*/
    @Test
    public void testCalculoSueldoBruto() {
        System.out.println("calculoSueldoBruto3");
        double horasTrabajadas = -1.0;
        double precioHora = 20.0;
        double expResult = 20.0;
        double result = Sueldo.calculoSueldoBruto(horasTrabajadas, precioHora);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    

    /**
     * Test of calculoSueldoNeto method, of class Sueldo.
     */
    @Test
    public void testCalculoSueldoNeto() {
        System.out.println("calculoSueldoNeto");
        double sueldoBruto = 200.0;
        double retencion = 10;
        double expResult = 190;
        double result = Sueldo.calculoSueldoNeto(sueldoBruto, retencion);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of calculoRetencion method, of class Sueldo.
     */
    @Test
    public void testCalculoRetencion() {
        System.out.println("calculoRetencion");
        double sueldoBruto = 100.0;
        double expResult = 5.0;
        double result = Sueldo.calculoRetencion(sueldoBruto);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Sueldo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Sueldo instance = new Sueldo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
