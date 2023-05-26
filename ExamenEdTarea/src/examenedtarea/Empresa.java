
package examenedtarea;
import java.util.Scanner;
/**
 *
 * @author mtisc
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double retencion;
        double sueldoNeto;
        int opcion;
        TrabajadorComision trabajador1 = new TrabajadorComision();
        TrabajadorHoras trabajador2 = new TrabajadorHoras();
        
        do {
            System.out.println("\n Elige a un tipo de trabajador:");
            System.out.println("1.-Trabajador por comision");
            System.out.println("2.-trabajador por horas");
            System.out.println("3.-Salir del programa.");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    trabajador1.datosTrabajador();                    
                    trabajador1.calculoSueldoBruto();
                    retencion = TrabajadorComision.calculoRetencion(trabajador1.calculoSueldoBruto());
                    sueldoNeto = TrabajadorComision.calculoSueldoNeto(trabajador1.calculoSueldoBruto(), retencion);

                    System.out.println(trabajador1.toString());

                    System.out.println("El sueldo bruto de trabajador por comisión es  " + trabajador1.calculoSueldoBruto()
                            + " la retención es " + retencion
                            + " el sueldo neto es " + sueldoNeto);
                    break;
                case 2:
                    trabajador2.datosTrabajador();
                    trabajador2.calculoSueldoBruto();
                    retencion = TrabajadorHoras.calculoRetencion(trabajador2.calculoSueldoBruto());
                    sueldoNeto = TrabajadorHoras.calculoSueldoNeto(trabajador2.calculoSueldoBruto(), retencion);

                    System.out.println(trabajador1.toString());

                    System.out.println("El sueldo bruto de trabajador por horas es  " + trabajador2.calculoSueldoBruto()
                            + " la retención es " + retencion
                            + " el sueldo neto es " + sueldoNeto);
                    break;

                case 3:

                    System.out.println("Saliendo del programa....");
                    sc.close();
                    break;

                default:
                    System.out.println("Opción no válida, introduzca una opción del menú:");
            }

        } while (opcion != 3);

        

        
    }

    
    
}
