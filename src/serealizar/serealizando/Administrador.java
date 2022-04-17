
package serealizando;

public class Administrador extends Empleado
{
    private double incentivo;
    private static final long serialVersionUID = 1L;
    
    public Administrador(String n, double s, int anio, int mes, int dia)
    {
        super(n,s,anio,mes,dia);
        incentivo=0;

    }
    @Override
    public double getSueldo()
    {
        double sueldoBase= super.getSueldo();
        return sueldoBase+incentivo;
    }
    public void setIncentivo(double b)
    {
        incentivo=b;
    }
    @Override
    public String toString()
    {
        return super.toString() + " Incentivo = " + incentivo;
    }
}
