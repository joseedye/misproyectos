/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author acer
 */
public class sus {
    

    
   /*
     * Suma dos numeros binarios.
     * Recibe dos arreglos de tipo entero y retorna un
     * arreglo de tipo entero con el resultado de la suma.
     */
    public String sumarNumerosBinarios ( String  numeroUno , String  numeroDos ) {
    String resultado =  " " ;
    char acarreo =  '0';
    for ( int i = numeroUno.length()- 1 ; i >=  0 ; i-- ) {
        if (numeroUno.charAt (i) ==  '0'  && numeroDos.charAt (i) ==  '0' ) {
	if (acarreo ==  '0' ) {	resultado =  "0" + resultado;
        } else {
	resultado =  "1" + resultado;
	}
     } else  if ((numeroUno . charAt (i) ==  '0'  && numeroDos . charAt (i) ==  '1' ) ||
	 (numeroUno . charAt (i) ==  '1'  && numeroDos . charAt (i) ==  '0' )) {
	if (acarreo ==  '0' ) {
		resultado =  "1" + resultado;
	} else {
	acarreo =  '1' ;
	resultado =  "0" + resultado;
	}
 } else  if ((numeroUno . charAt (i) ==  '1'  && numeroDos . charAt (i) ==  '1' )) {
	if (acarreo ==  '0' ) {
	acarreo =  '1' ;
	resultado =  "0" + resultado;
	} else {
	resultado =  "1" + resultado;
	}
		}
		}
    if (acarreo == '1' ) {
			resultado = acarreo + resultado;
		}
		
    return resultado;
    }
		
		
    
			
			
			
		

     
     
   // suma dos binarios
//      public  String Suma(String a, String b) {
//        int a1 = Integer.parseInt(a, 2);
//        int b1 = Integer.parseInt(b, 2);
//        int c1 = a1 + b1;
//          System.out.println(""+ a1+" " +b1+" "+c1);
//        String resultado = Integer.toString(c1, 2);
//        return resultado;
//    }
//      
//      
//      //modificado
       public  String Suma(int a, int b) {
         String a2 =""+ a+"",b2=b+"";
        int a1 = Integer.parseInt(a2, 2);
        int b1 = Integer.parseInt(b2, 2);
        int c1 = a1 + b1;
          System.out.println(""+ a1+" " +b1+" "+c1);
        String resultado = Integer.toString(c1, 2);
        return resultado;
//return "";
    }
    
//       
//       public int complemento_a_dos(int complemento)
//{
//    int res;
//    while((complemento%=10)!=1){
//    complemento/=10;
//    }
//       res=(complemento%=10);
//
// return res;
//}
}

 
