package examenedtarea;

/**
 *
 * @author mtisc
 */
public class TrabajadorHoras extends Empleado {

    public TrabajadorHoras() {
        super();
    }

    @Override
    public double calculoSueldoBruto() {
        double sueldoBruto;
        sueldoBruto = Math.abs(horasTrabajadas) * Math.abs(precioHora);
        return sueldoBruto;
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
    }
}
