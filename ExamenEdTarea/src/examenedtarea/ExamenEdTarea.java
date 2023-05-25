
package examenedtarea;

/**
 *
 * @author mtisc
 */
public class ExamenEdTarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double sueldoBruto;
        double retencion;
        double sueldoNeto;
        
        Trabajador trabajador1 = new Trabajador();

        trabajador1.datosTrabajador();
        
        

        sueldoBruto = trabajador1.getHorasTrabajadas() * trabajador1.getPrecioHora();
        retencion = sueldoBruto * (5.0 / 100.0);
        sueldoNeto = sueldoBruto - retencion;

        System.out.println(trabajador1.imprimirDatos());

        System.out.println("El sueldo bruto es " + sueldoBruto
                + " la retención es " + retencion
                + " el sueldo neto es " + sueldoNeto);

    }

    
    
}
