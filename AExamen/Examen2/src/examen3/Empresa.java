package examen3;

import java.util.Scanner;

/**
 * Clase principal Empresa
 *
 * @author mtisc version 25.05.2023
 */
public class Empresa {

    /**
     * Variables de tipo double
     * <ul>
     * <li>retencion</li>
     * <li>sueldoNeto</li>
     * </ul>
     * Se calculan llamando a sus respectivos métodos de las clases Trabajador
     */
    /**
     * Variable de tipo int 
     * valor para elegir opcion del menú
     * 
     */
    /**
     * Se crea Objeto trabajador1 de la clase TrabajadorPorComision
     * 
     */
    /**
     * Se crea Objeto trabajador2 de la clase TrabajadorPorHoras
     * 
     */
    

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double retencion;
        double sueldoNeto;
        int opcion;
        TrabajadorPorComision trabajador1 = new TrabajadorPorComision();
        TrabajadorPorHoras trabajador2 = new TrabajadorPorHoras();

     /**
      * Bucle do-while para elegir opción del menú:
      * <ul>
      * <li>trabajador por horas</li>
      * <li>trabajador por comision</li>
      * <li>salir del programa</li>
      * </ul>
      * 
      */  
     /**
      * Objeto trabajador1 de tipo TrabajadorPorComision llama a métodos:
      * <ul>
      * <li>datosTrabajador</li>
      * <li>calculoSueldoBruto</li>
      * <li>calculoRetencion</li>
      * <li>calculoSueldoNeto</li>
      * <li>toString</li>
      * </ul>
      * 
      */
     /**
      * Objeto trabajador2 de tipo TrabajadorPorHoras llama a métodos:
      * <ul>
      * <li>datosTrabajador</li>
      * <li>calculoSueldoBruto</li>
      * <li>calculoRetencion</li>
      * <li>calculoSueldoNeto</li>
      * <li>toString</li>
      * </ul>
      * 
      */

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
                    retencion = TrabajadorPorComision.calculoRetencion(trabajador1.calculoSueldoBruto());
                    sueldoNeto = TrabajadorPorComision.calculoSueldoNeto(trabajador1.calculoSueldoBruto(), retencion);

                    System.out.println(trabajador1.toString());

                    System.out.println("El sueldo bruto de trabajador por comisión es  " + trabajador1.calculoSueldoBruto()
                            + " la retención es " + retencion
                            + " el sueldo neto es " + sueldoNeto);
                    break;
                case 2:
                    trabajador2.datosTrabajador();
                    trabajador2.calculoSueldoBruto();
                    retencion = TrabajadorPorHoras.calculoRetencion(trabajador2.calculoSueldoBruto());
                    sueldoNeto = TrabajadorPorHoras.calculoSueldoNeto(trabajador2.calculoSueldoBruto(), retencion);

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
