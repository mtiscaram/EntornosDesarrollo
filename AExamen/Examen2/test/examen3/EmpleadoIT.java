
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
        Empleado instance = new EmpleadoImpl();
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
        Empleado instance = new EmpleadoImpl();
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
        Empleado instance = new EmpleadoImpl();
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
        Empleado instance = new EmpleadoImpl();
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
        Empleado instance = new EmpleadoImpl();
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
        Empleado instance = new EmpleadoImpl();
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
        Empleado instance = new EmpleadoImpl();
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
        Empleado instance = new EmpleadoImpl();
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
        Empleado instance = new EmpleadoImpl();
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
        Empleado instance = new EmpleadoImpl();
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
        Empleado instance = new EmpleadoImpl();
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
        Empleado instance = new EmpleadoImpl();
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
        Empleado instance = new EmpleadoImpl();
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
        Empleado instance = new EmpleadoImpl();
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
        Empleado instance = new EmpleadoImpl();
        instance.datosTrabajador();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculoSueldoBruto method, of class Empleado.
     */
    @Test
    public void testCalculoSueldoBruto() {
        System.out.println("calculoSueldoBruto");
        Empleado instance = new EmpleadoImpl();
        double expResult = 0.0;
        double result = instance.calculoSueldoBruto();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of calculoSueldoNeto method, of class Empleado.
     */
    @Test
    public void testCalculoSueldoNeto() {
        System.out.println("calculoSueldoNeto");
        double sueldoBruto = 0.0;
        double retencion = 0.0;
        double expResult = 0.0;
        double result = Empleado.calculoSueldoNeto(sueldoBruto, retencion);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of calculoRetencion method, of class Empleado.
     */
    @Test
    public void testCalculoRetencion() {
        System.out.println("calculoRetencion");
        double sueldoBruto = 0.0;
        double expResult = 0.0;
        double result = Empleado.calculoRetencion(sueldoBruto);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of toString method, of class Empleado.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Empleado instance = new EmpleadoImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class EmpleadoImpl extends Empleado {

        public void datosTrabajador() {
        }

        public double calculoSueldoBruto() {
            return 0.0;
        }
    }
    
}
