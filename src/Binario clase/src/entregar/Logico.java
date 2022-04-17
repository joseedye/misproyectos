package entregar;

/**
 *
 * @author jose
 */
public class Logico {

    
    private Binario num1, num2;
    private int i =0;
    private Binario [] bins;

    public Logico() {
    }
   
    public Logico(int a) {
        bins= new Binario [a];
        }
    
   public Binario getSumar()
   {
    Binario rta=new Binario();
    return rta;
   }
    
    public Binario getNum1() {
        return num1;
    }

    public void setNum1(Binario num1) {
        this.num1 = num1;
    }

    public Binario getNum2() {
        return num2;
    }

    public void setNum2(Binario num2) {
        this.num2 = num2;
    }
    
    public void agregar(Binario nuevo){
        bins[i]= nuevo;
        i++;
    }
    
    
    
    //forma uno //
     public Binario []  get_mas_se_repitee(){
     Binario [] entrada = bins;
     Binario [] salida ;
     int [] contador = new int [i];
     int mayor =0,posicion =0;
      for(int j=0; j<i-1;j++)  {
        if(entrada[j].getNumBinario()!=null){
        for(int k=1; k<i-1;k++){
            if (j!=k){
            if(entrada[k].getNumBinario()!=null){
            if(entrada[j].equals(entrada[k])){
                contador[j]+=1;
            entrada[k].setNumBinario(null);
             }
            }
            }
            }
         }
     }
    //  guardo en la variable mayor la cantidad de veces que esta presente
     for(int j=0; j<contador.length;j++)
     {   if(mayor < contador[j]) {posicion=j;mayor=contador[j];}
     }
         
     for(int j=0; j<contador.length;j++)  {
          System.out.println(""+contador[j]); 
         }
  
salida = new Binario[contador.length];
    for(int j=0; j<contador.length;j++)  {      
    if(contador[j]==mayor){
        
        
    salida[j] = entrada[posicion];}
    }
    
     return salida;
     }

     
     
     //segunda forma
    // ME DA EL ARREGLO DE NUMERO QUE MAS SE REPITE
  
//    public Binario []  get_mas_se_repitee(){
//     Binario [] salida ;
//     int [] contador = new int [i];
//     int mayor =0,posicion =0;
//     
//     //agrega en el vector contador las cantidades de veces que estan precentes
//     for(int j=0; j<i;j++)  {
//        for(int k=0; k<i;k++){
//            if(bins[j].equals(bins[k])){
//             contador[j]= contador[j]+1;
//             }                 
//            }
//     }
//     
//     
//     // guardo en la variable mayor la cantidad de veces que esta presente
//     for(int j=0; j<contador.length;j++)
//     {   if(mayor < contador[j]) {posicion=j;mayor=contador[j];}
//     }
//     
//     
//     int [] mayores ; int candidadDeRepetidos =0;
//     for(int j=0; j<contador.length;j++)
//     {   if(contador[j]==mayor) {candidadDeRepetidos ++;}
//     }
//        System.out.println("repetidos "+candidadDeRepetidos);
//     
//      //sacar los indices de los que se repiten
//     int [] indicesrepetidos = new int [candidadDeRepetidos];
//      for(int j=0,m=0; j<contador.length;j++)  {
//         if(contador[j]==mayor){indicesrepetidos[m]=j;
//             System.out.println("indeces repetidos"+j);
//         }  
//     }
//      
//      //comparar y guardar los que sirvan
//       for(int j=0; j<indicesrepetidos.length;j++)  {
//        for(int k=0; k<indicesrepetidos.length-1;k++){
//            
//            if(j!=k){
//if((bins[indicesrepetidos[j]].equals(bins[indicesrepetidos[k]]))&&
//        (indicesrepetidos[k]!=-1)&&(indicesrepetidos[j]!=-1)){
//                System.out.println("posiciones borradas"+k);
//             indicesrepetidos[k]= -1;
//                
//             }  
//            }
//             }       }
//      // guuardar y salir lo que quedo
////      salida = new Binario [indicesrepetidos.length];
////     for(int j=0,k=0; j<indicesrepetidos.length;j++)  {
////         if(indicesrepetidos[j]!=-1){
////         salida[k]=bins[indicesrepetidos[j]];k++;
////         }
////     
////     }
//     
//     return null; //salida
//    }
    
    //suma corta
//    public  Binario Suma(Binario aa, Binario bb) {
//        String a = aa.boleanoabinario();
//        String b = bb.boleanoabinario();
//        int a1 = Integer.parseInt(a, 2);
//        int b1 = Integer.parseInt(b, 2);
//        int c1 = a1 + b1;
//        String resultado = Integer.toString(c1, 2);
//         Binario rta = new Binario(resultado);
//         return rta;
//    }
    
    //rellena y retorna el binario menor con el tamaño del mayor
    public Binario relleno(Binario mayor,Binario menor){
     Binario rta = new Binario(mayor.getNumBinario().length);   
          for(int k=mayor.getNumBinario().length-1,j=menor.getNumBinario().length-1;j>=0;k--,j--){
           rta.getNumBinario()[k]=menor.getNumBinario()[j];
        }
        return rta;} 
          
    
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
       
    // numeros que mas se repiten
     public Binario  get_mas_se_repite(){
     Binario  salida ;
     int [] contador = new int [i];
     int mayor =0,posicion=0;
     for(int j=0; j<i;j++)  {
        for(int k=0; k<i;k++){
             if(bins[j].equals(bins[k])){
             contador[j]= contador[j]+1;
             }                  
            }
     }
     for(int j=0; j<contador.length;j++)
     {   System.out.println(""+contador[j]);
         if(mayor < contador[j]) {posicion=j;mayor=contador[j];}
     }
     
     salida = bins[mayor];
        
     return salida ;
    }
   }

    

