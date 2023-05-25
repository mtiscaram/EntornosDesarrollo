package examen3;

/**
 * Clase TrabajadorPorComision que extiende de Empleado
 *
 * @author mtisc
 */

    public class TrabajadorPorComision extends Empleado {

    /**
     * Variable fija de comision
     */
    final double COMISION = 10.25;
    /**
     * Constructor vacio de TrabajadorPor Comision
     */
    public TrabajadorPorComision() {
    }
    /**
     * Método calculoSueldoBrutoMasComision
     * Método que calcula sueldoBruto multiplicando los parámetros horasTrabajadas y precioHora de un objeto trabajador1
     * y sumandole la comision
     * @param trabajador1
     * @return sueldoBruto
     */
    public double calculoSueldoBrutoMasComision(TrabajadorPorComision trabajador1) {
        double sueldoBruto;
        sueldoBruto = (trabajador1.getHorasTrabajadas() * trabajador1.getPrecioHora()) + COMISION;
        return sueldoBruto;
    }

    /**
     * Método TrabajadorPor Comision para acceder a los atributos de TrabajadorPorComision
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param dni
     * @param nss
     * @param horasTrabajadas
     * @param precioHora 
     */

    private TrabajadorPorComision(String nombre, String apellido1, String apellido2, String dni, String nss,
            double horasTrabajadas, double precioHora) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.numeroSeguroSocial = nss;
        this.horasTrabajadas = horasTrabajadas;
        this.precioHora = precioHora;

    }

}
