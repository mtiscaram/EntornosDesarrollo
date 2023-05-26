package examen3;
import java.util.Scanner;
/**
 * Clase TrabajadorPorComision que extiende de Empleado
 *
 * @author mtisc
 */
public class TrabajadorPorComision extends Empleado {
    Scanner sc = new Scanner(System.in);

    
    private double comision;

    
    public TrabajadorPorComision() {
        super();
    }
    
   
    public double getComision() {
        return comision;
    }
    

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    
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
        System.out.println("Introduce la comision del trabajador:");
        comision = sc.nextDouble();
    }

    
    @Override
    public double calculoSueldoBruto() {
        double sueldoBruto;
        sueldoBruto = Math.abs(horasTrabajadas) * Math.abs(precioHora) + comision;
        return sueldoBruto;
    }

}
