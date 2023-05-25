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
public class EmpleadoIT {
    
    public EmpleadoIT() {
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
     * Test of getNombre method, of class Empleado.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Empleado.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Empleado instance = new Empleado();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellido1 method, of class Empleado.
     */
    @Test
    public void testGetApellido1() {
        System.out.println("getApellido1");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getApellido1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellido1 method, of class Empleado.
     */
    @Test
    public void testSetApellido1() {
        System.out.println("setApellido1");
        String apellido1 = "";
        Empleado instance = new Empleado();
        instance.setApellido1(apellido1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellido2 method, of class Empleado.
     */
    @Test
    public void testGetApellido2() {
        System.out.println("getApellido2");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getApellido2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellido2 method, of class Empleado.
     */
    @Test
    public void testSetApellido2() {
        System.out.println("setApellido2");
        String apellido2 = "";
        Empleado instance = new Empleado();
        instance.setApellido2(apellido2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDni method, of class Empleado.
     */
    @Test
    public void testGetDni() {
        System.out.println("getDni");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getDni();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDni method, of class Empleado.
     */
    @Test
    public void testSetDni() {
        System.out.println("setDni");
        String dni = "";
        Empleado instance = new Empleado();
        instance.setDni(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroSeguroSocial method, of class Empleado.
     */
    @Test
    public void testGetNumeroSeguroSocial() {
        System.out.println("getNumeroSeguroSocial");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getNumeroSeguroSocial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroSeguroSocial method, of class Empleado.
     */
    @Test
    public void testSetNumeroSeguroSocial() {
        System.out.println("setNumeroSeguroSocial");
        String numeroSeguroSocial = "";
        Empleado instance = new Empleado();
        instance.setNumeroSeguroSocial(numeroSeguroSocial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHorasTrabajadas method, of class Empleado.
     */
    @Test
    public void testGetHorasTrabajadas() {
        System.out.println("getHorasTrabajadas");
        Empleado instance = new Empleado();
        double expResult = 0.0;
        double result = instance.getHorasTrabajadas();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHorasTrabajadas method, of class Empleado.
     */
    @Test
    public void testSetHorasTrabajadas() {
        System.out.println("setHorasTrabajadas");
        double horasTrabajadas = 0.0;
        Empleado instance = new Empleado();
        instance.setHorasTrabajadas(horasTrabajadas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioHora method, of class Empleado.
     */
    @Test
    public void testGetPrecioHora() {
        System.out.println("getPrecioHora");
        Empleado instance = new Empleado();
        double expResult = 0.0;
        double result = instance.getPrecioHora();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioHora method, of class Empleado.
     */
    @Test
    public void testSetPrecioHora() {
        System.out.println("setPrecioHora");
        double precioHora = 0.0;
        Empleado instance = new Empleado();
        instance.setPrecioHora(precioHora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of datosTrabajador method, of class Empleado.
     */
    @Test
    public void testDatosTrabajador() {
        System.out.println("datosTrabajador");
        Empleado instance = new Empleado();
        instance.datosTrabajador();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculoSueldoBruto method, of class Empleado.
     */
    /*@Test
    public void testCalculoSueldoBruto() {
        System.out.println("calculoSueldoBruto1");  
        double horasTrabajadas = 20.00;
        double precioHora = 10.00;
        double expResult = 200.0;
        double result = Empleado.calculoSueldoBruto(horasTrabajadas, precioHora);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
      
    }*/
    
     /**
     * Test of calculoSueldoBruto method, of class Empleado.
     */
   /* @Test
    public void testCalculoSueldoBruto() {
        System.out.println("calculoSueldoBruto2");  
        double horasTrabajadas = 0.00;
        double precioHora = 0.00;
        double expResult = 0.0;
        double result = Empleado.calculoSueldoBruto(horasTrabajadas, precioHora);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
      
    }*/
    
     /**
     * Test of calculoSueldoBruto method, of class Empleado.
     */
    /*@Test
    public void testCalculoSueldoBruto() {
        System.out.println("calculoSueldoBruto3");  
        double horasTrabajadas = -10.00;
        double precioHora = 20.00;
        double expResult = 200.0;
        double result = Empleado.calculoSueldoBruto(horasTrabajadas, precioHora);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of calculoSueldoNeto method, of class Empleado.
     */
    @Test
    public void testCalculoSueldoNeto() {
        System.out.println("calculoSueldoNeto1");
        double sueldoBruto = 1000.0;
        double retencion = 50.0;
        double expResult = 950.0;
        double result = Empleado.calculoSueldoNeto(sueldoBruto, retencion);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of calculoRetencion method, of class Empleado.
     */
    /*@Test
    public void testCalculoRetencion() {
        System.out.println("calculoRetencion1");
        double sueldoBruto = 1000.0;
        double expResult = 50.0;
        double result = Empleado.claculoRetencion(sueldoBruto);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }*/
    
    @Test
    public void testCalculoRetencion() {
        System.out.println("calculoRetencion2");
        double sueldoBruto = 0.0;
        double expResult = 0.0;
        double result = Empleado.claculoRetencion(sueldoBruto);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of imprimirDatos method, of class Empleado.
     */
    @Test
    public void testImprimirDatos() {
        System.out.println("imprimirDatos");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.imprimirDatos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
