package examen3;



public class TrabajadorPorComision extends Empleado {
     double comision=10.25;

    public double calculoSueldoBrutoMasComision(TrabajadorPorComision trabajador1) {
        double sueldoBruto;
        sueldoBruto = (trabajador1.getHorasTrabajadas() * trabajador1.getPrecioHora()) + comision;
        return sueldoBruto;
    }
   


    public TrabajadorPorComision() {
    }

    private TrabajadorPorComision(String nombre, String apellido1, String apellido2, String dni, String nss,
                                  double horasTrabajadas, double precioHora, double comision) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni; 
        this.numeroSeguroSocial = nss;
        this.horasTrabajadas = horasTrabajadas;
        this.precioHora = precioHora;
        this.comision = comision;
    }
    
    

}
