package examen3;
/**
 * Clase principal Empresa
 * 
 * @author mtisc
 * version 25.05.2023
 */


public class Empresa {
    /**
     * Variables de tipo double
     * <ul>
     * <li>retencion</li>
     * <li>sueldoNeto</li>
     *</ul>
     * que se obtienen de llamar de la clase Tabajador llamando a sus diferentes 
     * métodos para que sean calculados
     */
    /**
     * Objeto trabajador1 de la clase Trabajador PorComision
     * Objeto Trabajador1 que llama al método datosTrabajador
     */
    /**
     * Diferentes métodos que llama de la clase TrabajadorPorHoras
     * 
     * @see calculoSueldoBrutoMasComision
     * @see calculoRetencion
     * @see calculoSueldoNeto
     */
    
   /**
    * 
    * @param args 
    */

    public static void main(String[] args) {
          
        
        double retencion;
        double sueldoNeto;
        
        TrabajadorPorComision trabajador1 = new TrabajadorPorComision();

        trabajador1.datosTrabajador();
        
        

       trabajador1.calculoSueldoBrutoMasComision(trabajador1);
        retencion = TrabajadorPorHoras.calculoRetencion(trabajador1.calculoSueldoBrutoMasComision(trabajador1));
        sueldoNeto = TrabajadorPorHoras.calculoSueldoNeto(trabajador1.calculoSueldoBrutoMasComision(trabajador1), retencion);

        System.out.println(trabajador1.toString());

        System.out.println("El sueldo bruto es  " + trabajador1.calculoSueldoBrutoMasComision(trabajador1)
                + " la retención es " + retencion
                + " el sueldo neto es " + sueldoNeto);

    }


}
