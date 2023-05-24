package tareaexamened;

import java.util.Scanner;


public class Principal {


    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        String nombre;
        String apellido1;
        String apellido2;
        String dni;        
        double horasTrabajadas;
        double precioHora;      
           
        System.out.println("Introduce nombre del trabajador:");
        nombre=sc.nextLine();
        System.out.println("Introduce primer apellido del trabajador:");
        apellido1=sc.nextLine();
        System.out.println("Introduce segundo apellido del trabajador:");
        apellido2=sc.nextLine();
        System.out.println("Introduce dni del trabajador:");
        dni=sc.nextLine();        
        System.out.println("Introduce horas trabajadas:");
        horasTrabajadas=sc.nextDouble();        
        System.out.println("Introduce precio por hora:");
        precioHora=sc.nextDouble();
                
        
        double sueldoBruto = Sueldo.calculoSueldoBruto(horasTrabajadas, precioHora);
        double retencion = Sueldo.calculoRetencion(sueldoBruto);
        double sueldoNeto = Sueldo.calculoSueldoNeto(sueldoBruto, retencion);
         
        
        System.out.println("El trabajador "+nombre +" "+ apellido1 + " " + apellido2 + " con DNI "+ dni+ " tiene un sueldo bruto de "+ sueldoBruto + " ,una retención de "+ retencion + " y un sueldo neto de " + sueldoNeto);
       
    }

    
}
