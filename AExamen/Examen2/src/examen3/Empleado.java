
package examen3;

import java.util.Scanner;

public class Empleado {
    
    
    Scanner sc = new Scanner(System.in);
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected String dni;
    protected String numeroSeguroSocial;
    protected double horasTrabajadas;
    protected double precioHora;

    public Empleado() {
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
        
    
    public static double calculoSueldoBruto(TrabajadorPorHoras trabajador1) {
        double sueldoBruto;
        sueldoBruto = Math.abs(trabajador1.getHorasTrabajadas()) * Math.abs( trabajador1.getPrecioHora()) ;
        return sueldoBruto;
    }
     
    public static double calculoSueldoNeto(double sueldoBruto, double retencion) {
        double sueldoNeto;
        sueldoNeto = sueldoBruto - retencion;
        return sueldoNeto;
    }

    public static double claculoRetencion(double sueldoBruto) {
        double retencion;
        retencion = sueldoBruto * (5.0 / 100.0);
        return retencion;
    }
    public String imprimirDatos() {
        return "El trabajador " + nombre + " " + apellido1 + " " + apellido2 + " con DNI " + dni + " con nss " + numeroSeguroSocial;
    }
    
}
