package sandwichmio;
public class Prueba {
    public static void main(String[] args) {
        Maquina m = new Maquina();
        System.out.println("descripcion de ingredientes:\n");
        m.mortadela.descripcion();
        m.pan.descripcion();
        m.jamon.descripcion();
        m.queso.descripcion();
        m.panIntegral.descripcion();
        System.out.println("\n averiguar precio de sanduis medio simple con pan blanco\n");
        System.out.println(""+m.calcularCosto("Medio Simple","Blanco"));
        System.out.println("\ncomprar sanduis medio simple con pan blanco\n");
        m.setIngresos(m.getIngresos() + m.registrarVenta("Medio Simple","Blanco"));
        
        System.out.println("descripcion de ingredientes:\n");
        m.mortadela.descripcion();
        m.pan.descripcion();
        m.jamon.descripcion();
        m.queso.descripcion();
        m.panIntegral.descripcion();
        System.out.println("\n averiguar precio de sanduis medio simple con pan integral\n");
        System.out.println(""+m.calcularCosto("Medio Simple","Integral"));
        System.out.println("\ncomprar sanduis medio simple con pan Integral\n"); 
        m.setIngresos(m.getIngresos() + m.registrarVenta("Medio Simple","Integral"));
        
        System.out.println("descripcion de ingredientes:\n");
        m.mortadela.descripcion();
        m.pan.descripcion();
        m.jamon.descripcion();
        m.queso.descripcion();
        m.panIntegral.descripcion();
        System.out.println("\n averiguar precio de sanduis medio exquisito con pan blanco\n");
        System.out.println(""+m.calcularCosto("Medio Exquisito","Blanco"));
        System.out.println("\ncomprar sanduis medio exquisito con pan blanco\n");
        m.setIngresos(m.getIngresos() + m.registrarVenta("Medio Exquisito","Blanco"));
        
        System.out.println("descripcion de ingredientes:\n");
        m.mortadela.descripcion();
        m.pan.descripcion();
        m.jamon.descripcion();
        m.queso.descripcion();
        m.panIntegral.descripcion();
        System.out.println("\n averiguar precio de sanduis medio exquisito con pan integral\n");
        System.out.println(""+m.calcularCosto("Medio Exquisito","Integral"));
        System.out.println("\ncomprar sanduis medio exquisito con pan integral\n");
        m.setIngresos(m.getIngresos() + m.registrarVenta("Medio Exquisito","Integral"));
       
        System.out.println("descripcion de ingredientes:\n");
        m.mortadela.descripcion();
        m.pan.descripcion();
        m.jamon.descripcion();
        m.queso.descripcion();
        m.panIntegral.descripcion();
        System.out.println("\n averiguar precio de sanduis normal simple con pan blanco\n");
        System.out.println(""+m.calcularCosto("Normal Simple","Blanco"));
        System.out.println("\ncomprar sanduis normal simle con pan blanco\n");
        m.setIngresos(m.getIngresos() + m.registrarVenta("Normal Simple","Blanco"));
        
        System.out.println("descripcion de ingredientes:\n");
        m.mortadela.descripcion();
        m.pan.descripcion();
        m.jamon.descripcion();
        m.queso.descripcion();
        m.panIntegral.descripcion();
        System.out.println("\n averiguar precio de sanduis normal simple con pan integral\n");
        System.out.println(""+m.calcularCosto("Normal Simple","Integral"));
        System.out.println("\ncomprar sanduis normal simple con pan integral\n");
        m.setIngresos(m.getIngresos() + m.registrarVenta("Normal Simple","Integral"));
        
        System.out.println("descripcion de ingredientes:\n");
        m.mortadela.descripcion();
        m.pan.descripcion();
        m.jamon.descripcion();
        m.queso.descripcion();
        m.panIntegral.descripcion();
        System.out.println("\n averiguar precio de sanduis normal exquisito con pan blanco\n");
        System.out.println(""+m.calcularCosto("Normal Exquisito","Blanco"));
        System.out.println("\ncomprar sanduis normal Exquisito con pan blanco\n");
        m.setIngresos(m.getIngresos() + m.registrarVenta("Normal Exquisito","Blanco"));
        
        System.out.println("descripcion de ingredientes:\n");
        m.mortadela.descripcion();
        m.pan.descripcion();
        m.jamon.descripcion();
        m.queso.descripcion();
        m.panIntegral.descripcion();
        System.out.println("\n averiguar precio de sanduis normal exquisito con pan integral\n");
        System.out.println(""+m.calcularCosto("Normal Exquisito","Integral"));
        System.out.println("\ncomprar sanduis normal Exquisito con pan integral\n");
        m.setIngresos(m.getIngresos() + m.registrarVenta("Normal Exquisito","Integral"));
        
        System.out.println("descripcion de ingredientes:\n");
        m.mortadela.descripcion();
        m.pan.descripcion();
        m.jamon.descripcion();
        m.queso.descripcion();
        m.panIntegral.descripcion();
        System.out.println("\n averiguar precio de sanduis doble simple con pan blanco\n");
        System.out.println(""+m.calcularCosto("Doble Simple","Blanco"));
        System.out.println("\ncomprar sanduis doble simpleo con pan blanco\n");
        m.setIngresos(m.getIngresos() + m.registrarVenta("Doble Simple","Blanco"));
        
        System.out.println("descripcion de ingredientes:\n");
        m.mortadela.descripcion();
        m.pan.descripcion();
        m.jamon.descripcion();
        m.queso.descripcion();
        m.panIntegral.descripcion();
        System.out.println("\n averiguar precio de sanduis Doble simple con pan integral\n");
        System.out.println(""+m.calcularCosto("Doble Simple","Integral"));
        System.out.println("\ncomprar sanduis Doble Simple con pan integral\n");
        m.setIngresos(m.getIngresos() + m.registrarVenta("Doble Simple","Integral"));
        
        System.out.println("descripcion de ingredientes:\n");
        m.mortadela.descripcion();
        m.pan.descripcion();
        m.jamon.descripcion();
        m.queso.descripcion();
        m.panIntegral.descripcion();
        System.out.println("\n averiguar precio de sanduis doble Exquisito con pan blanco\n");
        System.out.println(""+m.calcularCosto("Doble Exquisito","Blanco"));
        System.out.println("\ncomprar sanduis doble Exquisito con pan blanco\n");
        m.setIngresos(m.getIngresos() + m.registrarVenta("Doble Exquisito","Blanco"));
        
        System.out.println("descripcion de ingredientes:\n");
        m.mortadela.descripcion();
        m.pan.descripcion();
        m.jamon.descripcion();
        m.queso.descripcion();
        m.panIntegral.descripcion();
        System.out.println("\n averiguar precio de sanduis Doble Exquisito con pan integral\n");
        System.out.println(""+m.calcularCosto("Doble Exquisito","Integral"));
        System.out.println("\ncomprar sanduis Doble Exquisito con pan integral\n");
        m.setIngresos(m.getIngresos() + m.registrarVenta("Doble Exquisito","Integral"));
        
        System.out.println("IVA : "+m.iva);
        System.out.println("COSTOS FIJOS : "+m.costosfijos);
        System.out.println("GANANCIA : "+m.ganancia);
        System.out.println("INGRESOS : "+m.getIngresos());
        System.out.println("RIEGOS : "+m.riesgos);        
    }  
}
