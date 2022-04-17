package Negocio;
import javax.swing.JOptionPane;
public class Maquina {
    private int cantidadqueso;
    private int cantidadMortadela;
    private int cantidadJamon;
    private int cantidadPanblanco,cantidadPanIntegral;
    private int iva,costosfijos,riesgos,ganancia,ingresos;

    public Maquina() {
        this.cantidadqueso=1500;
        this.cantidadMortadela=1000;
        this.cantidadJamon=1000;
        this.cantidadPanblanco=100;
        this.cantidadPanIntegral=100;
        iva=0;
        costosfijos=0;
        riesgos=0;
        ganancia=0;        
        ingresos=0;
    }

    public int getCantidadqueso() {
        return cantidadqueso;
    }

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    
    

    public void setCantidadqueso(int cantidadqueso) {
        this.cantidadqueso = cantidadqueso;
    }

    public int getCantidadMortadela() {
        return cantidadMortadela;
    }

    public void setCantidadMortadela(int cantidadMortadela) {
        this.cantidadMortadela = cantidadMortadela;
    }

    public int getCantidadJamon() {
        return cantidadJamon;
    }

    public void setCantidadJamon(int cantidadJamon) {
        this.cantidadJamon = cantidadJamon;
    }

    public int getCantidadPanblanco() {
        return cantidadPanblanco;
    }

    public void setCantidadPanblanco(int cantidadPanblanco) {
        this.cantidadPanblanco = cantidadPanblanco;
    }

    public int getCantidadPanIntegral() {
        return cantidadPanIntegral;
    }

    public void setCantidadPanIntegral(int cantidadPanIntegral) {
        this.cantidadPanIntegral = cantidadPanIntegral;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getCostosfijos() {
        return costosfijos;
    }

    public void setCostosfijos(int costosfijos) {
        this.costosfijos = costosfijos;
    }

    public int getRiesgos() {
        return riesgos;
    }

    public void setRiesgos(int riesgos) {
        this.riesgos = riesgos;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }
    
    public int registrarVenta(String tipoS,String tipoP){
       
        if(tipoS.equalsIgnoreCase("Medio Simple")){
        if(cantidadqueso>=15 && cantidadMortadela>=10 && cantidadPanIntegral>=1 && cantidadPanblanco>1){
        this.cantidadqueso=cantidadqueso-15;
        this.cantidadMortadela=cantidadMortadela-10;
        this.cantidadJamon=cantidadJamon-0;
        if(tipoP.equalsIgnoreCase("Blanco")){
            this.cantidadPanblanco--;
            this.iva+=(int) 1000*0.19;
            this.costosfijos+=(int) 1000*0.05;
            this.riesgos+=(int) 1000*0.01;
            this.ganancia+=(int) 1000*0.1;
            return 1000;
        }else{
            this.cantidadPanIntegral--;
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
        if(cantidadqueso>=15 && cantidadJamon>=10 && cantidadPanIntegral>=1 && cantidadPanblanco>1){
        this.cantidadqueso=cantidadqueso-15;
        this.cantidadMortadela=cantidadMortadela-0;
        this.cantidadJamon=cantidadJamon-10;
        if(tipoP.equalsIgnoreCase("Blanco")){
            this.cantidadPanblanco--;
            this.iva+=(int) 1100*0.19;
            this.costosfijos+=(int) 1100*0.05;
            this.riesgos+=(int) 1100*0.01;
            this.ganancia+=(int) 1100*0.1;
            return 1100;
        }else{
            this.cantidadPanIntegral--;
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
        if(cantidadqueso>=30 && cantidadMortadela>=20 && cantidadPanIntegral>=2 && cantidadPanblanco>2){
        this.cantidadqueso=cantidadqueso-30;
        this.cantidadMortadela=cantidadMortadela-20;
        this.cantidadJamon=cantidadJamon-0;
        if(tipoP.equalsIgnoreCase("Blanco")){
            this.cantidadPanblanco=cantidadPanblanco-2;
            this.iva+=(int) 2000*0.19;
            this.costosfijos+=(int) 2000*0.05;
            this.riesgos+=(int) 2000*0.01;
            this.ganancia+=(int) 2000*0.1;
            return 2000;
        }else{
            this.cantidadPanIntegral=cantidadPanIntegral-2;
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
        if(cantidadqueso>=30 && cantidadJamon>=20 && cantidadPanIntegral>=2 && cantidadPanblanco>2){
        this.cantidadqueso=cantidadqueso-30;
        this.cantidadMortadela=cantidadMortadela-0;
        this.cantidadJamon=cantidadJamon-20;
        if(tipoP.equalsIgnoreCase("Blanco")){
            this.cantidadPanblanco=cantidadPanblanco-2;
            this.iva+=(int) 2200*0.19;
            this.costosfijos+=(int) 2200*0.05;
            this.riesgos+=(int) 2200*0.01;
            this.ganancia+=(int) 2200*0.1;
            return 2200;
        }else{
            this.cantidadPanIntegral=cantidadPanIntegral-2;
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
        if(cantidadqueso>=45 && cantidadMortadela>=30 && cantidadPanIntegral>=3 && cantidadPanblanco>3){
        this.cantidadqueso=cantidadqueso-45;
        this.cantidadMortadela=cantidadMortadela-30;
        this.cantidadJamon=cantidadJamon-0;
        if(tipoP.equalsIgnoreCase("Blanco")){
            this.cantidadPanblanco=cantidadPanblanco-3;
            this.iva+=(int) 3000*0.19;
            this.costosfijos+=(int) 3000*0.05;
            this.riesgos+=(int) 3000*0.01;
            this.ganancia+=(int) 3000*0.1;
            return 3000;
        }else{
            this.cantidadPanIntegral=cantidadPanIntegral-3;
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
        if(cantidadqueso>=45 && cantidadJamon>=30 && cantidadPanIntegral>=3 && cantidadPanblanco>3){
        this.cantidadqueso=cantidadqueso-45;
        this.cantidadMortadela=cantidadMortadela-0;
        this.cantidadJamon=cantidadJamon-30;
        if(tipoP.equalsIgnoreCase("Blanco")){
            this.cantidadPanblanco=cantidadPanblanco-3;
            this.iva+=(int) 3300*0.19;
            this.costosfijos+=(int) 3300*0.05;
            this.riesgos+=(int) 3300*0.01;
            this.ganancia+=(int) 3300*0.1;
            return 3300;
        }else{
            this.cantidadPanIntegral=cantidadPanIntegral-3;
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
        
        if(tipoS.equalsIgnoreCase("Normal Simple")){
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
