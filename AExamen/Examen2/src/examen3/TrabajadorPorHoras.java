package examen3;

import java.util.Scanner;

public class TrabajadorPorHoras extends Empleado {

   


    public TrabajadorPorHoras() {
    }

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
