  package entregar;

public class Binario implements Comparable{
    
    private boolean numBinario[];

    public boolean[] getNumBinario() {
        return numBinario;
    }

    public void setNumBinario(boolean[] numBinario) {
        this.numBinario = numBinario;
    }

    public Binario() {
    }
    
    public Binario(int can)
    {
    this.numBinario=new boolean[can];
    }
    
    public Binario(String numero)
    {
    this.numBinario=new boolean[numero.length()];
  
    char v[]=numero.toCharArray();
    for(int i=v.length-1;i>=0;i--)
        {
            this.numBinario[i]=(v[i]=='1')?true:false;
           }
    }
    
    
    @Override
    public boolean equals (Object c){
    Binario dos = (Binario)c;
    if(this.numBinario.length==dos.numBinario.length){
         for(int j=0; j<this.numBinario.length;j++)
        if(this.numBinario[j]!=dos.numBinario[j]){
            return false;
        }
        return true;
    }
    return false;
    }
    
    
    @Override
    public String toString() {
        String  bin= "Binario{" ;
        for(boolean xbin:this.numBinario)
        {
            
            bin+=xbin?"1":"0";
        }
    return (bin+"}");
    }

    
    @Override
    public int compareTo(Object t) 
     {
     Binario dos=(Binario)t;
     int tam=this.numBinario.length-dos.numBinario.length;
     if (tam==0)
     {
            for(int i=0; i<this.numBinario.length;i++)
            {
                if(this.numBinario[i] && !dos.numBinario[i])
                {
                    return 1;
                }
                else
                {
                    if(!this.numBinario[i] && dos.numBinario[i])
                    {
                        return -1;
                    }
                }
            }
     } 
     
     return tam;
            
    }
    
    
    
    /**
     * Complemento a 2:
     * El complemento a 1 y a 2 de un número binario son importantes porque permiten
        la  representación de números negativos. El método de complemento a 2 en
        aritmética es comúnmente usada en computadoras para manipular números
        negativos.
        Obteniendo el complemento a 1 de un numero binario
        El complemento a 1 de un numero binario es encontrado simplemente cambiando
        todos los 1s por 0s y todos los 0s por 1s.
     */
    
    public Binario getComplemento_a_2()
    {
    Binario rta;
    //Binario rtaa = getComplemento_a_1();
    Binario a = new Binario(""+1);
    rta = sumas(getComplemento_a_1(),a);
    System.out.println(rta);
    return rta;
    }
    
    
     
    public Binario getComplemento_a_1()
    {
       Binario rta=new Binario(this.getNumBinario().length);
       boolean convertidor [] = new boolean [this.getNumBinario().length];
       for(int i =0; i<this.getNumBinario().length;i++)
        {    
           convertidor[i] = !this.numBinario[i];
        }
        rta.setNumBinario(convertidor);
          return rta; 
          
    }
    
//    suma dos binarios FORMA CORTA mirar
//      public  Binario Suma(Binario aa, Binario bb) {
//          System.out.println(" comp 1 "+aa +"/n uno "+ bb);
//       String a = aa.boleanoabinario();
//       String b = bb.boleanoabinario();
//        int a1 = Integer.parseInt(a, 2);
//        int b1 = Integer.parseInt(b, 2);
//        int c1 = a1 + b1;
//        String resultado = Integer.toString(c1, 2);
//         Binario rta = new Binario(resultado);
//         return rta;
//    }
      
        //suma larga
    public  Binario sumas(Binario uno,Binario dos){
        
        Binario mayor=dos,menor=uno,rta;
        boolean llevo=false;
        String resultado="";
        
        if((uno.getNumBinario().length-dos.getNumBinario().length)>0){
              menor=relleno(uno,dos);mayor=uno;}
        else
            {   if((uno.getNumBinario().length-dos.getNumBinario().length)<0){
                  menor=relleno(dos,uno);mayor=dos;}}
       
            for(int t= menor.getNumBinario().length-1; t>=0;t--)  {
               
                if((mayor.getNumBinario()[t]&&!menor.getNumBinario()[t]&&!llevo)||
                   (!mayor.getNumBinario()[t]&&menor.getNumBinario()[t]&&!llevo)||
                   (!mayor.getNumBinario()[t]&&!menor.getNumBinario()[t]&&llevo)||
                   (mayor.getNumBinario()[t]&&menor.getNumBinario()[t]&&llevo)){
                resultado="1"+resultado; }else{resultado="0"+resultado;}
                   
                if((mayor.getNumBinario()[t]&&menor.getNumBinario()[t])||
                    (mayor.getNumBinario()[t]&&!menor.getNumBinario()[t]&&llevo)||
                    (menor.getNumBinario()[t]&&!mayor.getNumBinario()[t]&&llevo)){
                    llevo=true;}else{llevo=false;  }
                
            }//fin for
                
        if(llevo){resultado="1"+resultado;}
        rta = new Binario(resultado);
        
    return rta;
    }
    
     //rellena y retorna el binario menor con el tamaño del mayor
    public Binario relleno(Binario mayor,Binario menor){
     Binario rta = new Binario(mayor.getNumBinario().length);   
          for(int k=mayor.getNumBinario().length-1,j=menor.getNumBinario().length-1;j>=0;k--,j--){
           rta.getNumBinario()[k]=menor.getNumBinario()[j];
        }
        return rta;}
    
    public Binario sumaBinarios(Binario b){
        int[] menor,mayor;
        if(this.numBinario.length<b.numBinario.length){
           Binario ba= (relleno(b,this));
        menor = ba.boleanoabinario(); mayor=b.boleanoabinario();  }
        else{Binario baa=relleno(this,b);  menor=baa.boleanoabinario();
            mayor=this.boleanoabinario();}
        String rta="";
        int llevo =0;
        for (int h = menor.length-1; h > 0; h--) {
           switch(menor[h]+mayor[h]+llevo){
               case 0 : rta="0"+rta;llevo=0;
               case 1 : rta="1"+rta;llevo=0;
               case 2 : rta="0"+rta;llevo=1;
               case 3 : rta="1"+rta;llevo=1;
           } 
        }
        if(llevo==1){rta="1"+rta;}
//         Binario rta = new Binario(b.numBinario.length);
         
    return new Binario(rta);
    }
    
      public int[] boleanoabinario(){
          boolean a [] = getNumBinario();
          int [] b= new int[getNumBinario().length];
          for (int i =b.length; i>0; i--) {
              if(a[i]){b[i]=1;}else{b[i]=0;}
                   }
               return b;
      }
    
    
    /**
     * Convierte el numero binario a su correspondiente decimal
     */
    
    public long getDecimal()
    {
    long rta=0;
    
    String  bin= "" ;
        for(boolean xbin:this.numBinario)
        {            
            bin+=xbin?"1":"0";
        }
      int numero = Integer.parseInt(bin);
    
        int  exponente = 0, digito;
        while(numero>0){
            digito = numero%10;
            rta = rta + digito * (int)Math.pow(2, exponente);
            numero /= 10;
            exponente++;
        }
       return rta;
    }
    
    public static void main(String[] args) {
        Binario b = new Binario("111");
        Binario bb = new Binario("111");
       // System.out.println(b.boleanoabinario());
//        System.out.println(b.toString());
        System.out.println(b.sumaBinarios(bb).toString());
    } 
    

}

