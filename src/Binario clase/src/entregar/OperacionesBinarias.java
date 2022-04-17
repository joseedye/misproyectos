/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregar;

/**
 *
 * @author acer
 */
public class OperacionesBinarias {
    
    
    public static String completarDerecha(String a){
    char [] f =a.toCharArray(); 
       char [] g = new char [((f.length)*2)+1];
       String rta ="";
       
       for (int i = 0; i < g.length; i++) {
            g[i]='0';
               }
       
        for (int i = 0,j=0; i <f.length; i++,j++) {
            g[j]=f[i];
        }
       
        for (int i = 0; i < g.length; i++) {
            rta+=g[i];
               }
    return rta;
    }
    
    public  String complementoA2(String a){
        String com =getComplemento_a_1(a);
        //System.out.println("llega del uno al dos"+com);
        String b=suma(com,"1");
        //System.out.println("llega de la suma"+b);
    return b;
    }
 
     
    public String getComplemento_a_1(String a)
    {//System.out.println("llega a uno"+a);
       char [] f =a.toCharArray(); 
       char [] g = new char [f.length];
       String rta ="";
        for(int i =0; i<f.length;i++)
        {    
           if(f[i]=='1'){g[i]='0';}else{g[i]='1';}
        }
        
        for (int i = 0; i < g.length; i++) {
            rta+=g[i];
               }
        //System.out.println("sale de uno"+rta);
          return rta; 
          
    }
    
    
    public static String suma(String a,String b){
        
        //System.out.println("a "+ a.length()+a+" b "+ b.length()+b);
       
        char [] f =a.toCharArray(); 
        char [] z =b.toCharArray(); 
        char [] g;
        if(z.length<f.length){ g = new char [f.length];}
        else{ g = new char [z.length];}
        
        String rta="";
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int c1 = a1 + b1;
        String resultado = Integer.toString(c1, 2);
        //System.out.println("reultado de la suma"+resultado);
        char [] h =resultado.toCharArray();
         for (int i = 0; i < g.length; i++) {
            g[i]='0';
               } 
         System.out.println("tam g "+g.length);
         System.out.println("tam h "+h.length);
         for (int i = h.length-1,j=g.length-1; i >=0; i--,j--) {
            g[j]=h[i];
        }
        for (int i = 0; i < g.length; i++) {
            rta+=g[i];
               }
         return rta;

    }
    
    public static String completarIzquierda(String a){
       char [] f =a.toCharArray(); 
       char [] g = new char [((f.length)*2)+1];
       String rta ="";
       
       for (int i = 0; i < g.length; i++) {
            g[i]='0';
               }
       
        for (int i = f.length-1,j=g.length-2; i >=0; i--,j--) {
            g[j]=f[i];
        }
       
        for (int i = 0; i < g.length; i++) {
            rta+=g[i];
               }
    return rta;

    }
    
    public  String desplazarDerecha(String a){
         char [] bb =a.toCharArray();
         char[]nuevo= new char [bb.length];
        String e="";
      
        for (int i = 0,j=1; i < nuevo.length-1; i++,j++) {
            nuevo[0]=bb[0];
            nuevo[j]=bb[i];
            //System.out.println("i "+i+" j "+j);
        }
      
        for (int i = 0; i < nuevo.length; i++) {
           e+=nuevo[i]; 
        }
    return e;

    }
    
    public static String sumaEspecial(String a,String b){
        
        //System.out.println("a "+ a.length()+a+" b "+ b.length()+b);
       
        char [] f =a.toCharArray(); 
        char [] z =b.toCharArray(); 
        char [] g;
        if(z.length<f.length){ g = new char [f.length];}
        else{ g = new char [z.length];}
        for (int i = 0; i < g.length; i++) {
            g[i]='0';
               }
        
        String rta="";
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int c1 = a1 + b1;
        String resultado = Integer.toString(c1, 2);
        //System.out.println("reultado de la suma"+resultado);
        char [] h =resultado.toCharArray();
        
         //por si el resultado es mayor que la entrda
        if(h.length>g.length){
                for (int i = h.length-1,j=g.length-1; j >=0; i--,j--) 
            {
                g[j]=h[i];  }
                }
                else
                {
         if(h.length<g.length){
                for (int i = h.length-1,j=g.length-1; i >=0; i--,j--) 
                {
                g[j]=h[i];  }
            }else
         {
           for (int i = h.length-1,j=g.length-1; i >=0; i--,j--) {
            g[j]=h[i];
        }
         
         }   
        }

        
        for (int i = 0; i < g.length; i++) {
            rta+=g[i];
               }
         return rta;

    }
    
     public  String algoritmo(String multiplicando, String multiplicador)
{
    String resultado="";
    String A=completarDerecha(multiplicando);
    String S=complementoA2(multiplicando);
    S=completarDerecha(S);
    String P=completarIzquierda(multiplicador);
    System.out.println("A "+A);
    System.out.println("S "+S);
    System.out.println("P "+P);
    int i=0,n=multiplicando.length();
    char ultimo, penultimo;
    char cadena[]=new char[2*n];
    
    for(i=0;i<n;i++)
    {
        ultimo=P.charAt(P.length()-1);
        penultimo=P.charAt(P.length()-2);
      
        System.out.println("ultimo "+ultimo+" penultimo "+penultimo);
        if(penultimo=='0' && ultimo=='0')
        {
        // No realizar ninguna acción
        }
        else
        {
            if(penultimo=='0' && ultimo=='1')
            {System.out.println("entro en 0,1");
            // P termina en [0 1] -> P = P + A
               P=sumaEspecial(P, A);
                               
            }
            else
                if(penultimo=='1' && ultimo=='0')
                {
                // P termina en [1 0] -> P = P + S = P - A
                   P=sumaEspecial(P, S);
                    System.out.println("entro en 1,0");
                }
                else
                {
                // No realizar ninguna acción
                }
        }
        System.out.println("p vale "+P);
        System.out.println("\n dezplace a la derecha");
        P=desplazarDerecha(P);
        System.out.println("p "+P);
    }
//    P=P=desplazarDerecha(P);
//    System.out.println("p en salida "+P);
    String rta="";
    for (int j = 0; j < cadena.length; j++) {
       rta+=cadena[j]; 
    }
//    System.out.println("rta = "+rta);
    for(i=0;i<2*n;i++)
    {
       // System.out.println("cadena pos"+cadena[i]+"p[i]"+P.charAt(i));
        cadena[i]=P.charAt(i);
        //System.out.println("cadena pos"+cadena[i]+"p[i]"+P.charAt(i));
    }
   
    resultado=String.valueOf(cadena);
 
    // devuelve el resultado, quitandole el ULTIMO bit
    return resultado;
} 
    
    public static void main(String[] args) {
        OperacionesBinarias o = new OperacionesBinarias();
        String multiplicando ="0110";
        String multiplicador = "0010";
        System.out.println(o.algoritmo(multiplicando, multiplicador));
        
        //System.out.println(o.complementoA2("1101"));
        
    }
}

