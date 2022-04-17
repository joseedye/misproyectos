package sandwichmio;

import javax.swing.JOptionPane;

public class Maquina {
    Ingredientes ques,mortadel,jamo,pa,panIn;
    Queso queso;
    Mortadela mortadela;
    Jamon jamon;
    Pan pan,panIntegral;
    int iva,costosfijos,riesgos,ganancia,ingresos;
    
    public Maquina() {
      ques = new Queso();  
      mortadel = new Mortadela();
      jamo = new Jamon();
      pa = new Pan();
      panIn = new Pan();
      iva=0;
        costosfijos=0;
        riesgos=0;
        ganancia=0;        
        ingresos=0;
      convertirObjeto();
     }
    
    public void convertirObjeto (){
    queso = (Queso)ques;
    mortadela = (Mortadela)mortadel;
    jamon = (Jamon)jamo;
    pan = (Pan)pa;
    panIntegral = (Pan)panIn;
        }
    
    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }
    
     public int registrarVenta(String tipoS,String tipoP){
       
        if(tipoS.equalsIgnoreCase("Medio Simple")){
        if(queso.getCantidad()>=15 && mortadela.getCantidad()>=10 && panIntegral.getCantidad()>=1 && pan.getCantidad()>1){
        queso.setCantidad(-15);
        mortadela.setCantidad(-10);
        jamon.setCantidad(0); 
        if(tipoP.equalsIgnoreCase("Blanco")){
            pan.setCantidad(-1);
            this.iva+=(int) 1000*0.19;
            this.costosfijos+=(int) 1000*0.05;
            this.riesgos+=(int) 1000*0.01;
            this.ganancia+=(int) 1000*0.1;
            return 1000;
        }else{
            panIntegral.setCantidad(-1);
            this.iva+=(int) 1100*0.19;
            this.costosfijos+=(int) 1100*0.05;
            this.riesgos+=(int) 1100*0.01;
            this.ganancia+=(int) 1100*0.1;
            return 1100;
        }
        }else{
            JOptionPane.showMessageDialog(null, "No hay ingredientes suficientes para preparar este sanduish");           
        }    
        }
        
        if(tipoS.equalsIgnoreCase("Medio Exquisito")){
        if(queso.getCantidad()>=15 && jamon.getCantidad()>=10 && panIntegral.getCantidad()>=1 && pan.getCantidad()>1){
        queso.setCantidad(-15);
        mortadela.setCantidad(0);
        jamon.setCantidad(-10);
        if(tipoP.equalsIgnoreCase("Blanco")){
            pan.setCantidad(-1);
            this.iva+=(int) 1100*0.19;
            this.costosfijos+=(int) 1100*0.05;
            this.riesgos+=(int) 1100*0.01;
            this.ganancia+=(int) 1100*0.1;
            return 1100;
        }else{
            panIntegral.setCantidad(-1);
            this.iva+=(int) 1200*0.19;
            this.costosfijos+=(int) 1200*0.05;
            this.riesgos+=(int) 1200*0.01;
            this.ganancia+=(int) 1200*0.1;
            return 1200;
        }
        }else{
            JOptionPane.showMessageDialog(null, "No hay ingredientes suficientes para preparar este sanduish");           
        }    
        }
        
           if(tipoS.equalsIgnoreCase("Normal Simple")){
        if(queso.getCantidad()>=30 && mortadela.getCantidad()>=20 && panIntegral.getCantidad()>=2 && pan.getCantidad()>2){
        queso.setCantidad(-30);
        mortadela.setCantidad(-20);
        jamon.setCantidad(0);    
        if(tipoP.equalsIgnoreCase("Blanco")){
            pan.setCantidad(-2);
            this.iva+=(int) 2000*0.19;
            this.costosfijos+=(int) 2000*0.05;
            this.riesgos+=(int) 2000*0.01;
            this.ganancia+=(int) 2000*0.1;
            return 2000;
        }else{
            panIntegral.setCantidad(-2);
            this.iva+=(int) 2200*0.19;
            this.costosfijos+=(int) 2200*0.05;
            this.riesgos+=(int) 2200*0.01;
            this.ganancia+=(int) 2200*0.1;
            return 2200;
        }
        }else{
            JOptionPane.showMessageDialog(null, "No hay ingredientes suficientes para preparar este sanduish");           
        }    
        }
           
         if(tipoS.equalsIgnoreCase("Normal Exquisito")){
        if(queso.getCantidad()>=30 && jamon.getCantidad()>=20 && panIntegral.getCantidad()>=2 && pan.getCantidad()>2){
        queso.setCantidad(-30);
        mortadela.setCantidad(0);
        jamon.setCantidad(-20);
        if(tipoP.equalsIgnoreCase("Blanco")){
            pan.setCantidad(-2);
            this.iva+=(int) 2200*0.19;
            this.costosfijos+=(int) 2200*0.05;
            this.riesgos+=(int) 2200*0.01;
            this.ganancia+=(int) 2200*0.1;
            return 2200;
        }else{
            panIntegral.setCantidad(-2);
            this.iva+=(int) 2400*0.19;
            this.costosfijos+=(int) 2400*0.05;
            this.riesgos+=(int) 2400*0.01;
            this.ganancia+=(int) 2400*0.1;
            return 2400;
        }
        }else{
            JOptionPane.showMessageDialog(null, "No hay ingredientes suficientes para preparar este sanduish");           
        }    
        }
         
         
          if(tipoS.equalsIgnoreCase("Doble Simple")){
        if(queso.getCantidad()>=45 && mortadela.getCantidad()>=30 && panIntegral.getCantidad()>=3 && pan.getCantidad()>3){
        queso.setCantidad(-45);
        mortadela.setCantidad(-30);
        jamon.setCantidad(0);
        if(tipoP.equalsIgnoreCase("Blanco")){
            pan.setCantidad(-3);
            this.iva+=(int) 3000*0.19;
            this.costosfijos+=(int) 3000*0.05;
            this.riesgos+=(int) 3000*0.01;
            this.ganancia+=(int) 3000*0.1;
            return 3000;
        }else{
            panIntegral.setCantidad(-3);
            this.iva+=(int) 3300*0.19;
            this.costosfijos+=(int) 3300*0.05;
            this.riesgos+=(int) 3300*0.01;
            this.ganancia+=(int) 3300*0.1;
            return 3300;
        }
        }else{
            JOptionPane.showMessageDialog(null, "No hay ingredientes suficientes para preparar este sanduish");           
        }    
        }
         
            if(tipoS.equalsIgnoreCase("Doble Exquisito")){
        if(queso.getCantidad()>=45 && jamon.getCantidad()>=30 && panIntegral.getCantidad()>=3 && pan.getCantidad()>3){
        queso.setCantidad(-45);
        mortadela.setCantidad(0);
        jamon.setCantidad(-30);
        if(tipoP.equalsIgnoreCase("Blanco")){
            pan.setCantidad(-3);
            this.iva+=(int) 3300*0.19;
            this.costosfijos+=(int) 3300*0.05;
            this.riesgos+=(int) 3300*0.01;
            this.ganancia+=(int) 3300*0.1;
            return 3300;
        }else{
            panIntegral.setCantidad(-3);
            this.iva+=(int) 3600*0.19;
            this.costosfijos+=(int) 3600*0.05;
            this.riesgos+=(int) 3600*0.01;
            this.ganancia+=(int) 3600*0.1;
            return 3300;
        }
        }else{
            JOptionPane.showMessageDialog(null, "No hay ingredientes suficientes para preparar este sanduish");           
        }    
        }
            
       return 0;
       
    }
     
     public int calcularCosto(String tipoS,String tipop){
        if(tipoS.equalsIgnoreCase("Medio Simple")){
            if(tipop.equalsIgnoreCase("Blanco")){
                return 1350;
            }else{
                return 1485;
            }
        }
        
        if(tipoS.equalsIgnoreCase("Medio Exquisito")){
            if(tipop.equalsIgnoreCase("Blanco")){
                return 1485;
            }else{
                return 1620;
            }
        }
        
        if(tipoS.equalsIgnoreCase("Normal Simple")){
            if(tipop.equalsIgnoreCase("Blanco")){
                return 2700;
            }else{
                return 2970;
            }
        }
        
        if(tipoS.equalsIgnoreCase("Normal Exquisito")){
            if(tipop.equalsIgnoreCase("Blanco")){
                return 2970;
            }else{
                return 3240;
            }
        }
        
        if(tipoS.equalsIgnoreCase("Doble Simple")){
            if(tipop.equalsIgnoreCase("Blanco")){
                return 4050;
            }else{
                return 4455;
            }
        }
        
        if(tipoS.equalsIgnoreCase("Doble exquisito")){
            if(tipop.equalsIgnoreCase("Blanco")){
                return 4455;
            }else{
                return 4860;
            }
        }
        
        return 0;
    }
    
}
