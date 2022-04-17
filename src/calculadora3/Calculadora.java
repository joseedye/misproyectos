package calculadora3;
//jose eduardo rozo
public class Calculadora {
    int memoria1=0,memoria2=0,memoriaDeM=0;
    String signo = null,pantalla=null;
    boolean estado = false;
    public Calculadora(){}
    
    public void setEstado(boolean estado){this.estado=estado;}  
    public boolean getEstado(){return this.estado;}
    public String getPantalla(){return this.pantalla;}
    public void setPantalla(int numero){pantalla=getPantalla()+"numero";}
    public void setMemoria1(int numero){this.memoria1=(memoria1*10)+numero;}
    public void setMemoria2(int numero){this.memoria2=(memoria2*10)+numero;}
    public void setMemoriaDeM(int numero){this.memoriaDeM=memoriaDeM+numero;}
    public int getMemoriaDeM(){return this.memoriaDeM;}
    public void setSigno(String signo){if(memoria1!=0&&memoria2==0){this.signo=signo;pantalla="";}}
    public int getMemoria1(){return this.memoria1;}
    public int getMemoria2(){return this.memoria2;}
    
    //boton del 0 al 9
    public void botones(int numero){
        if (estado==true){
            setPantalla(numero);if(!signo.equals("")){
                setMemoria2(numero);}else{setMemoria1(numero);}}}
    
    public void igual(){if(this.estado==true){
        if(signo.equals("+")){this.memoria1 = getMemoria1() + getMemoria2();   }
        if(signo.equals("-")){this.memoria1 = getMemoria1() - getMemoria2();   }
        if(signo.equals("*")){this.memoria1 = getMemoria1() * getMemoria2();   }
        if(signo.equals("/")){this.memoria1 = getMemoria1() / getMemoria2();   }
        if(signo.equals("%")){this.memoria1 = (getMemoria1() * getMemoria2())/100;   }
        this.memoria2=0;this.signo="";
        
    }
       
}
    public void mMas(){if(getMemoria2()==0){setMemoriaDeM(getMemoria1());}else{
    setMemoriaDeM(getMemoria2()); }}
    
    public void mMenos(){if(getMemoria2()==0){setMemoriaDeM(getMemoria1()*(-1));}else{
       setMemoriaDeM(getMemoria2()*(-1));}}
    
    public void mCR(){if(memoriaDeM!=0){pantalla="0";setPantalla(memoriaDeM);}}

    public void prender(){setEstado(true);}
    public void apagar(){setEstado(false);memoria1=0;memoria2=0;signo="";memoriaDeM=0;pantalla="";}
         
}


