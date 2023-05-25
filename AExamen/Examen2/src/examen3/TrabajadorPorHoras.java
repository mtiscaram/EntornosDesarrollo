package examen3;

/**
 * Clase TrabajadorPorHoras que extiende de clase Empleado
 * @author mtisc
 */

public class TrabajadorPorHoras extends Empleado {
/**
 * Contructor vacio de TrabajadorPorHoras
 */
   


    public TrabajadorPorHoras() {
    }
    /**
     * 
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param dni
     * @param nss
     * @param horasTrabajadas
     * @param precioHora 
     */

    private TrabajadorPorHoras(String nombre, String apellido1, String apellido2, String dni, String nss, double horasTrabajadas, double precioHora) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni; 
        this.numeroSeguroSocial = nss;
        this.horasTrabajadas = horasTrabajadas;
        this.precioHora = precioHora;
    }


}
