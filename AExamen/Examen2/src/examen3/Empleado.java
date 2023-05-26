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
     * Constructor con parámetros
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param dni
     * @param nss
     * @param horasTrabajadas
     * @param precioHora
     * @param numeroSeguroSocial 
     */
    public Empleado(String nombre, String apellido1, String apellido2, String dni, String nss, double horasTrabajadas, double precioHora, String numeroSeguroSocial) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.horasTrabajadas = horasTrabajadas;
        this.precioHora = precioHora;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido1
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * @param apellido1 the apellido1 to set
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * @return the apellido2
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * @param apellido2 the apellido2 to set
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the numeroSeguroSocial
     */
    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    /**
     * @param numeroSeguroSocial the dni to set
     */
    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    /**
     * @return the horasTrabajadas
     */
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    /**
     * @param horasTrabajadas the horasTrabajadas to set
     */
    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * @return the precioHora
     */
    public double getPrecioHora() {
        return precioHora;
    }

    /**
     * @param precioHora the precioHora to set
     */
    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    /**
     * Método datosTrabajador Metodo que pide por teclado introducir los datos
     * de trabajador
     */
    public abstract void datosTrabajador();

    /**
     * Método abstracto tipo double calculoSueldoBruto que cada clase 
     * hija lo implementa de una manera diferente
     * @return sueldoBruto
     */

    public abstract double calculoSueldoBruto();

    /**
     * Método calculaSueldoNeto Método que calcula el sueldoNeto con la resta de
     * sueldoBruto menos retencion
     *
     * @param sueldoBruto
     * @param retencion
     * @return sueldoNeto
     */
    public static double calculoSueldoNeto(double sueldoBruto, double retencion) {
        double sueldoNeto;
        sueldoNeto = sueldoBruto - retencion;
        return sueldoNeto;
    }

    /**
     * Método calculoRetencion Método que calcula valor de retencion
     * multiplicando sueldoBruto por 0.05
     *
     * @param sueldoBruto
     * @return retencion
     */
    public static double calculoRetencion(double sueldoBruto) {
        double retencion;
        retencion = sueldoBruto * (5.0 / 100.0);
        return retencion;
    }

    /**
     * Método toString Método que devuelve los datos de trabajador
     *
     * @return nombre, apellido1, apellido2, dni, numeroSeguroSocial
     */
    @Override
    public String toString() {
        return "El trabajador " + nombre + " " + apellido1 + " " + apellido2 + " con DNI " + dni + " con nss " + numeroSeguroSocial;
    }

}
