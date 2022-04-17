/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relojraro;

/**
 *
 * @author joseeduardo
 */
class Hora
{
    int numero;
    char jornada;//m,e,M,n,a,N;
    boolean valida;
    void algoritmo(){
        int horas=(numero/10000);
        int minutos=(numero/100)%100;
        int segundos=numero%100;
        int hora=0;
        hora=horas*10000+minutos*100+segundos;
        if(segundos>=0 && segundos<=60 && minutos>=0 && minutos<=60 && horas>=0 && horas<=24){
           if(numero>=120000 && numero<=125959 && (jornada=='m' || jornada=='n')){
            valida=true;
        }
        if(numero>=10000 && numero<=65959 && jornada=='e' ){
            valida=true;
        }
        if(numero>=10000 && numero<=55959 && jornada=='a'){
            valida=true;
        }
        if(numero>=60000 && numero<=115959 && (jornada=='M' || jornada=='N')){
            valida=true;
        }        
        }
        else{
            valida=false;
        }
    }

    public static void main(String[]args){
        Consola c=new Consola();
        Hora h=new Hora();

        h.numero=c.leerEntero("Escriba un numero de 5 o 6 degitos ");
        h.jornada=c.leerCaracter("Escriba una la letra  m, e, M, n, a, N");
        h.algoritmo();
        if (h.valida)
             c.imprimir("si");
        else
             c.imprimir("no");
    }
}
