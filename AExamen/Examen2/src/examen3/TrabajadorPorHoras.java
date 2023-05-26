package examen3;

/**
 * Clase TrabajadorPorHoras que extiende de clase Empleado
 * @author mtisc
 */

public class TrabajadorPorHoras extends Empleado {
    
    /**
     * Contructor TrabajadorPorHoras que
     */
    
    public TrabajadorPorHoras() {
        super();
    }
    
    
    
    /**
     * Método calculoSueldoBruto 
     * Calcula el sueldoBruto multiplicando horasTrabajadas con precioHora 
     * @return sueldoBruto
     */

    @Override
    public double calculoSueldoBruto() {
        double sueldoBruto;
        sueldoBruto = Math.abs(horasTrabajadas) * Math.abs( precioHora) ;
        return sueldoBruto;
    }
    /**
     * Método datosTrabajador Metodo que pide por teclado introducir los datos
     * de trabajador
     */
    @Override
    public void datosTrabajador() {
        System.out.println("Introduce nombre del trabajador:");
        nombre = sc.nextLine();
        System.out.println("Introduce primer apellido del trabajador:");
        apellido1 = sc.nextLine();
        System.out.println("Introduce segundo apellido del trabajador:");
        apellido2 = sc.nextLine();
        System.out.println("Introduce dni del trabajador:");
        dni = sc.nextLine();
        System.out.println("Introduce nss del trabajador:");
        numeroSeguroSocial = sc.nextLine();
        System.out.println("Introduce horas trabajadas:");
        horasTrabajadas = sc.nextDouble();
        System.out.println("Introduce precio por hora:");
        precioHora = sc.nextDouble();
    }


}
