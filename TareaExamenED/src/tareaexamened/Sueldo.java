
package tareaexamened;

/**
 *
 * @author mtisc
 */
public class Sueldo {
    
    
        private double horasTrabajadas;
        private double precioHora;
        private double sueldoBruto;
        private double retencion;
        private double sueldoNeto;

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
     * @return the sueldoBruto
     */
    public double getSueldoBruto() {
        return sueldoBruto;
    }

    /**
     * @param sueldoBruto the sueldoBruto to set
     */
    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    /**
     * @return the retencion
     */
    public double getRetencion() {
        return retencion;
    }

    /**
     * @param retencion the retencion to set
     */
    public void setRetencion(double retencion) {
        this.retencion = retencion;
    }

    /**
     * @return the sueldoNeto
     */
    public double getSueldoNeto() {
        return sueldoNeto;
    }

    /**
     * @param sueldoNeto the sueldoNeto to set
     */
    public void setSueldoNeto(double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }
    
   public static double calculoSueldoBruto(double horasTrabajadas, double precioHora) {
        double sueldoBruto;
        sueldoBruto = horasTrabajadas * precioHora;
        return sueldoBruto;
    }

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
        return "Sueldo{" + "sueldoBruto=" + sueldoBruto + ", retencion=" + retencion + ", sueldoNeto=" + sueldoNeto + '}';
    }
}
