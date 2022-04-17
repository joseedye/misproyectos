package entregar;

/**
 *
 * @author acer
 */
public class Pruebas {
    public static void main(String args[])
    {
     String n1="111";
     String n2="11";
     String n3="110";
     String n4="10";
     String n5="11";
     String n6="11";
     String n7="11";     
     String n8="110110";
 
     Binario nn1=new Binario(n1);
     Binario nn2=new Binario(n2);
     Binario nn3=new Binario(n3);
     Binario nn4=new Binario(n4);
     Binario nn5=new Binario(n5);
     Binario nn6=new Binario(n6);
     Binario nn7=new Binario(n7);
     Binario nn8=new Binario(n8);
     Logico s = new Logico(8);
     s.agregar(nn1);
     s.agregar(nn2);
     s.agregar(nn3);
     s.agregar(nn4);
     s.agregar(nn5);
     s.agregar(nn6);
     s.agregar(nn7);
     s.agregar(nn8);
   
       // System.out.println(nn8.getComplemento_a_1()+"");
        nn8.getComplemento_a_2();
      
    }
}
