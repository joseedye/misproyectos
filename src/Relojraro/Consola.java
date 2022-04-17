/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relojraro;

 

/**
 * Todo computador tiene una entrada y salida estandar, típicamente el teclado y la pantalla.
 * Al entrada y la salida del computador constituyen el mecanismo de comunicación con el usuario,
 * lo que se conoce como la interfaz entre el humano y la máquina. La interfaz puede ser simple, 
 * sólo texto o gráfica.
 * La clase Consola proporciona un conjunto de métodos que ofrecen una interfaz simple, sólo texto,
 * Se ofrecen métodos para leer e imprimnir datos de todos los tipos básicos de Java.
 * En ésta versión se soportan objetos sencillos.
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co) 
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
class Consola{

    /**
     * Lee un entero en el rango de los byte (-128 a 127).
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @return un byte
     */
    public  byte leerByte(String aviso){
        Byte numero = null;
        boolean hayError=false;
        //aviso += " \n('Ingrese sÃ³lo un valor entero de tipo byte [" + Byte.MIN_VALUE + "," + Byte.MAX_VALUE + "]')";
        do{
            try{
                numero = new Byte(this.leerCadena(aviso));
                hayError=false;
            }//fin try
            catch(Exception e){
                hayError=true;
            }//fin catch
        }//fin do
        while(hayError);
        return numero.byteValue();
    }//Fin mÃ³todo leerByte

    /**
     * Lee un entero en el rango de los short (-32768 a 32767).
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @return un short
     */
    public  short leerShort(String aviso){
        Short numero=null;
        boolean hayError=false;
        //aviso += " \n('Ingrese sÃ³lo un valor entero de tipo short [" + Short.MIN_VALUE + "," + Short.MAX_VALUE + "]')";
        do{
            try{
                numero = new Short(this.leerCadena(aviso));
                hayError=false;
            }//fin try
            catch(Exception e){
                hayError=true;
            }//fin catch
        }//fin do
        while(hayError);
        return numero.shortValue();
    }//Fin mÃ³todo leerShort

    /**
     * Lee un entero en el rango de los int (-2147483648 a 2147483647).
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @return un int
     */
    public  int leerEntero(String aviso){
        Integer numero=null;
        boolean hayError=false;
        //aviso += " \n('Ingrese sÃ³lo un valor entero de tipo Integer [" + Integer.MIN_VALUE + "," + Integer.MAX_VALUE + "]')";
        do{
            try{
                numero = new Integer(this.leerCadena(aviso));
                hayError=false;
            }//fin try
            catch(Exception e){
                hayError=true;
            }//fin catch
        }//fin do
        while(hayError);
        return numero.intValue();
    }//Fin mÃ³todo leerEntero

    /**
     * Lee un entero en el rango de los long (-9223372036854775808 a 9223372036854775807).
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @return un long
     */
    public  long leerLong(String aviso){
        Long numero=null;
        boolean hayError=false;
        //aviso += " \n('Ingrese sÃ³lo un valor entero de tipo long [" + Long.MIN_VALUE + "," + Long.MAX_VALUE + "]')";
        do{
            try{
                numero = new Long(this.leerCadena(aviso));
                hayError=false;
            }//fin try
            catch(Exception e){
                hayError=true;
            }//fin catch
        }//fin do
        while(hayError);
        return numero.longValue();
    }//Fin mÃ³todo leerLong

    /**
     * Lee un real en el rango de los float (1.4E-45 a 3.4028235E38).
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @return un float
     */
    public  float leerFloat(String aviso){
        Float numero=null;
        boolean hayError=false;
        //aviso += " \n('Ingrese sÃ³lo un valor real de tipo float [" + Float.MIN_VALUE + "," + Float.MAX_VALUE + "]')";
        do{
            try{
                numero = new Float(this.leerCadena(aviso));
                hayError=false;
            }//fin try
            catch(Exception e){
                hayError=true;
            }//fin catch
        }//fin do
        while(hayError);
        return numero.floatValue();
    }//Fin mÃ³todo leerFloat

    /**
     * Lee un real en el rango de los double (4.9E-324 a  1.7976931348623157E308).
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @return un double
     */
    public  double leerDouble(String aviso){
        Double numero=null;
        boolean hayError=false;
        //aviso += " \n('Ingrese sÃ³lo un valor real de tipo double [" + Double.MIN_VALUE + "," + Double.MAX_VALUE + "]')";
        do{
            try{
                numero = new Double(this.leerCadena(aviso));
                hayError=false;
            }//fin try
            catch(Exception e){
                hayError=true;
            }//fin catch
        }//fin do
        while(hayError);
        return numero.doubleValue();
    }//Fin mÃ³todo leerDouble

    /**
     * Lee una cadena de caracteres. Cualquier cantidad de caracteres UNICODE
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @return un String
     */
    public  String leerCadena(String aviso){
        byte [] buffer = new byte[255];//Nuestro shell esta limitado a 255 caracteres por lectura
        String rta = "";
        int n=0;
        System.out.print(aviso + ": ");
        try{
            System.in.skip(System.in.available());//Vacia el buffer del teclado
            n=System.in.read(buffer);//lee todo el buffer o un mÃ¡ximo de 255 caracteres
        }
        catch(Exception e){
            System.err.println("Algo anda mal");
        }

        for(int i=0; i<n;i++) {
            if(buffer[i]!=10 && buffer[i]!=13)//el enter
                rta = rta + ((char)buffer[i]);//al leer por consola se lee es el ascii
        }

        return rta.length() != 0 ? rta : "0";
    }//Fin mÃ³todo leerCadena

    /**
     * Lee sÃ³lo un caracter. Cualquier caracter UNICODE (0 -65536)
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @view http://www.unicode.org
     * @link http://www.unicode.org
     * @return un char
     */
    public  char leerCaracter(String aviso){
        String caracter = null;
        boolean hayError=false;
        //aviso += " \n('Ingrese sÃ³lo un caracter - tipo char')";
        do{
            try{
                caracter = this.leerCadena(aviso);
                hayError=false;
            }//fin try
            catch(Exception e){
                hayError=true;
            }//fin catch
        }//fin do
        while(hayError||caracter.length()>1);
        return caracter.charAt(0);
    }//Fin mÃ³todo leerCaracter

    /**
     * Lee un valor lÃ³gico: SI, si, YES, yes, true, OK, ok NO, no
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @return un boolean
     */
    public  boolean leerBoolean(String aviso){
        boolean valor=false;
        boolean hayError=false;
        String cadena = null;
        //aviso += " ('Escriba true | false')";
        do{
            try{
                cadena = this.leerCadena(aviso);
                hayError = ! "true".equals(cadena) && ! "false".equals(cadena);
                valor = !hayError && "true".equals(cadena);
            }//fin try
            catch(Exception e){
                hayError=true;
            }//fin catch
        }//fin do
        while(hayError);
        return valor;
    }//Fin mÃ³todo leerBoolean

    /**
     * Muestra un menÃº de opciones y regresa la posiciÃ³n de la opciÃ³n seleccionada.
     * @param  opciones    Un arreglo con las opciones a seleccionar
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @return un String que indica la opciÃ³n seleccionada
     */
    public  int menu(String [] opciones, String aviso){
        int opcion;
        System.out.println("**********Menu**********");
        for(int i=0; i<opciones.length; i++)
            System.out.println((i+1)+"- "+opciones[i]);
        opcion = this.leerEnteroEnRango("Escriba una opciÃ³n ", 1, opciones.length);
        return opcion -1;
    }//fin mÃ³todo menu

    /**
     * Lee un entero como int en un rango dado MIN-MAX
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @param  MIN el valor entero mínimo del rango
     * @param  MAX el valor entero máximo del rango
     * @return  un valor entero (int) mayor o igual que MIN y menor o igual que MAX (MIN <= numero <= MAX
     */
    public  int leerEnteroEnRango(String aviso, final int MIN, final int MAX){
        int numero;
        do{
            numero = leerEntero(aviso + " (mÃ­nimo= " + MIN + ", mÃ¡ximo= "+ MAX +")");
        }
        while(numero<MIN || numero>MAX);
        return numero;
    }//fin mÃ³todo leerEnteroEnRango

    public void imprimir(String aviso, Object obj)
    {
        System.out.println(aviso + " --> "  + obj);
    }

    public void imprimir(String aviso)
    {
        System.out.println(aviso);
    } 
    
    public static void main(String [] args){
      Consola consola = new Consola();
      consola.imprimir("**********Test Consola**********");
      consola.leerEntero("Test Integer");
    }

}//fin clase Shell

