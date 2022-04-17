/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolas;

/**
 *
 * @author acer
 */
public class Prueba {
   
    public static void main(String[] args) {
        EjercicioColas ec = new EjercicioColas();
        System.out.println("prueba de metodo esReconocedor\nse espera true\n");
        System.out.println(ec.esReconocedor("aabaab"));
        System.out.println(ec.esReconocedor("aab"));
        System.out.println(ec.esReconocedor("aaaaaabbb"));
        System.out.println(ec.esReconocedor("se espera una bueno"));
        System.out.println(ec.esReconocedor("este ejemplo lleva una bez"));
        
        System.out.println("\nse espera false\n");
        
        System.out.println(ec.esReconocedor("aabbaa"));
        System.out.println(ec.esReconocedor("aaaabba"));
        System.out.println(ec.esReconocedor("a"));
        System.out.println(ec.esReconocedor("b"));
        System.out.println(ec.esReconocedor("este ejemplo va falso porque lleva cinco a y una b"));
        
        System.out.println("\nprueba de metodo esReconocedorOrdenada \n se espera true \n");
        
        System.out.println(ec.esReconocedorOrdenada("aaaabb"));
        System.out.println(ec.esReconocedorOrdenada("aab"));
        System.out.println(ec.esReconocedorOrdenada("estaesunaprueb"));
        System.out.println(ec.esReconocedorOrdenada("se espera verdadera cuando obbtengo esto"));
        System.out.println(ec.esReconocedorOrdenada("es verdad si mi texto es reconocedor de lenguaje quiero obtener"));
        
        System.out.println("\nse espera false\n");
        
        System.out.println(ec.esReconocedorOrdenada("aabaab"));
        System.out.println(ec.esReconocedorOrdenada("baa"));
        System.out.println(ec.esReconocedorOrdenada("a"));
        System.out.println(ec.esReconocedorOrdenada("b"));
        System.out.println(ec.esReconocedorOrdenada("este ejemplo da como resultado falso pues sobra esto"));
    }
    
    
}
