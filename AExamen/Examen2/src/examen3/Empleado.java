package examen3;

import java.util.Scanner;

/**
 * Super clase Empleado
 *
 * @author mtisc
 */
public abstract class Empleado {

    Scanner sc = new Scanner(System.in);
    /**
     * Variables con modificador de acceso protected
     * <ul>
     * <li>nombre</li>
     * <li>apellido1</li>
     * <li>apellido2</li>
     * <li>dni</li>
     * <li>numeroSeguroSocial</li>
     * <li>horasTrabajadas</li>
     * <li>precioHoras</li>
     * </ul>
     */
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected String dni;
    protected String numeroSeguroSocial;
    protected double horasTrabajadas;
    protected double precioHora;

    /**
     * Constructor vacio Empleado
     */
    public Empleado() {
    }

    /**
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return apellido1
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * @param apellido1 apellido1 to set
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * @return apellido2
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * @param apellido2 apellido2 to set
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * @return dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return numeroSeguroSocial
     */
    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    /**
     * @param numeroSeguroSocial numeroSeguridadSocial
     */
    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

 
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

   
    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

  
    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    
    public abstract void datosTrabajador();

  

    public abstract double calculoSueldoBruto();

   
    public static double calculoSueldoNeto(double sueldoBruto, double retencion) {
        double sueldoNeto;
        sueldoNeto = sueldoBruto - retencion;
        return sueldoNeto;
    }

    
    public static double calculoRetencion(double sueldoBruto) {
        double retencion;
        retencion = sueldoBruto * (5.0 / 100.0);
        return retencion;
    }

   
    @Override
    public String toString() {
        return "El trabajador " + nombre + " " + apellido1 + " " + apellido2 + " con DNI " + dni + " con nss " + numeroSeguroSocial;
    }

}
