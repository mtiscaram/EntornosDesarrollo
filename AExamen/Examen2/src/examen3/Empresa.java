package examen3;

import java.util.Scanner;

public class Empresa {

    /*String nombre;
        String apellido1;
        String apellido2;
        String dni;
        String nss;
        double horasTrabajadas; 
        double precioHora;
        Scanner sc =new Scanner(System.in);*/

    public static void main(String[] args) {
          
        double sueldoBruto;
        double retencion;
        double sueldoNeto;
        
        Trabajador trabajador1 = new Trabajador();

        trabajador1.datosTrabajador();
        
        

        sueldoBruto = trabajador1.getHorasTrabajadas() * trabajador1.getPrecioHora();
        retencion = sueldoBruto * (5.0 / 100.0);
        sueldoNeto = sueldoBruto - retencion;

        System.out.println(trabajador1.imprimirDatos());

        System.out.println("El sueldo bruto es " + sueldoBruto
                + " la retención es " + retencion
                + " el sueldo neto es " + sueldoNeto);

    }

}
