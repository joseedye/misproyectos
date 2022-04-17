package GUI;
import Negocio.Calculadora;
import javax.swing.*;

/**
 * 
 * @author Estudiante
 */

public class Consola {
    
   private static double pantalla;
   private static double a;
   private static double b;
   
    public static void imprimir(double x) {
        System.out.println("El resultado es: " + x);
        JOptionPane.showMessageDialog(null, "El resultado es: " + x);
    }

    public static void main(String[] args) {

        Calculadora cal1 = new Calculadora();
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija opción. \n1. Apagar \n2. AC "
                    + "\n3. Sumar. \n4. Restar \n5. Multiplicar. \n6. Dividir \n7. Porcentaje. \n8. Potencia "
                    + "\n9. M+  \n10. M- \n11. MRC. \n"));
            
            
            if (opcion == 3 || opcion == 4 || opcion == 5 || opcion == 6 || opcion == 7 || opcion == 8) {
                a = pedirNum();
                b = pedirNum();
            }
            
            switch (opcion) {
                case 1:
                    System.exit(0);
                    break;
                case 2:
                    imprimir(cal1.limpiarPantalla());
                case 3:
                    pantalla = cal1.sumar(a, b);
                    imprimir(pantalla);
                    break;
                case 4:
                    pantalla = cal1.restar(a, b);
                    imprimir(pantalla);
                    break;
                case 5:
                    pantalla = cal1.multiplicar(a, b);
                    imprimir(pantalla);
                    break;
                case 6:
                    pantalla = cal1.dividir(a, b);
                    imprimir(pantalla);
                    break;
                case 7:
                    pantalla = cal1.porcentaje(a, b);
                    imprimir(pantalla);
                    break;
                case 8:
                    pantalla = cal1.potencia(a, b);
                    imprimir(pantalla);
                    break;
                case 9:
                    pantalla = cal1.Mmas(pantalla);
                    imprimir(pantalla);
                    break;
                case 10:
                    pantalla = cal1.Mmenos(pantalla);
                    imprimir(pantalla);
                    break;
                case 11:
                    imprimir(cal1.MRC());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite una opción válida");
                    break;
            }
        } while (opcion != 1);

    }

    public static double pedirNum() {

        double num = Double.parseDouble(JOptionPane.showInputDialog("Por favor digite un número: "));
        return num;
    }

}
