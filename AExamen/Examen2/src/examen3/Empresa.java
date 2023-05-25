package examen3;



public class Empresa {
   

    public static void main(String[] args) {
          
        double sueldoBruto;
        double retencion;
        double sueldoNeto;
        
        TrabajadorPorComision trabajador1 = new TrabajadorPorComision();

        trabajador1.datosTrabajador();
        
        

       trabajador1.calculoSueldoBrutoMasComision(trabajador1);
        retencion = TrabajadorPorHoras.claculoRetencion(trabajador1.calculoSueldoBrutoMasComision(trabajador1));
        sueldoNeto = TrabajadorPorHoras.calculoSueldoNeto(trabajador1.calculoSueldoBrutoMasComision(trabajador1), retencion);

        System.out.println(trabajador1.imprimirDatos());

        System.out.println("El sueldo bruto es " + trabajador1.calculoSueldoBrutoMasComision(trabajador1)
                + " la retención es " + retencion
                + " el sueldo neto es " + sueldoNeto);

    }


}
