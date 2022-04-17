/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author jose eduardo rozo
 */
public class Hotel {
ArrayList <Habitacion> habitacion;

 public Hotel(){
     habitacion = new ArrayList<>();
     habitacion.add(new Habitacion(1,150000,"Primavera",101,5));
     habitacion.add(new Habitacion(1,150000,"Primavera",102,5));
     
     
     //piso 1

  habitacion.add(new Habitacion(1,150000,"Primavera",103,5));
    habitacion.add(new Habitacion(1,150000,"Primavera",104,5));
     habitacion.add(new Habitacion(1,150000,"Primavera",105,5));
 
 //piso 2
  habitacion.add( new Habitacion(2,150000,"Primavera",201,5));
  habitacion.add(new Habitacion(2,150000,"Primavera",202,5));
  habitacion.add(new Habitacion(2,150000,"Primavera",203,5));
   habitacion.add( new Habitacion(2,150000,"Primavera",204,5));
   habitacion.add(new Habitacion(2,150000,"Primavera",205,5));
 //piso 3
 
  habitacion.add(new Habitacion(3,150000,"Primavera",301,5));
  habitacion.add(new Habitacion(3,150000,"Primavera",302,5));
  habitacion.add( new Habitacion(3,150000,"Primavera",303,5));
  habitacion.add( new Habitacion(3,150000,"Primavera",304,5));
  habitacion.add( new Habitacion(3,150000,"Primavera",305,5));
 }
 
 public boolean anadirPersona(int numHabitacion,Persona persona){
     
     for (int i = 0; i < habitacion.size(); i++) {
         if(habitacion.get(i).num_habitacion==numHabitacion){
             
         if(habitacion.get(i).can_disponible>0&&habitacion.get(i).getResponsable()!=null){
             habitacion.get(i).addHuespedes(persona);
             return true;
                }
         }
     }
     return false;
 }
    
 
 //dettalles de la habitacion
 public String obtenerInfo(int numero_hab){
     for (int i = 0; i < habitacion.size(); i++) {
          if(habitacion.get(i).num_habitacion==numero_hab){
       return habitacion.get(i).toString();}
     }
      return "";
 }
 
 //lista info de todas las personas alquilada
  public String listar_info_personas(){
      String rta ="";
     for (int i = 0; i < habitacion.size(); i++) {
        rta +=  habitacion.get(i).toString()+"\n";}
     
      return rta;
 }
 
  //consultar la capacidad maxima de una habitacion
  public int capacidadMaxima(int numero_hab){
     for (int i = 0; i < habitacion.size(); i++) {
        
          if(habitacion.get(i).num_habitacion == numero_hab){
              
       return habitacion.get(i).getCap_maxima();
          }
     }
      return 0;
 }
  
  public boolean alquilar_habitacion(int num_habit,Persona responable){
       for (int i = 0; i < habitacion.size(); i++) {
          if(habitacion.get(i).num_habitacion==num_habit&&habitacion.get(i).getResponsable()==null){
      habitacion.get(i).addResponsable(responable);
      return true;
          }
      
  }
       return false;
}
  
  public void cambiar_presio_Habitacion(int numero_hab,double nuevoPresio){
      
       for (int i = 0; i < habitacion.size(); i++) {
          if(habitacion.get(i).num_habitacion==numero_hab){
      habitacion.get(i).setPrecio_alquiler(nuevoPresio);
  }
       }
  }
  
  public void modificarNumero_habitacion(int numero_hab ,int nuevo){
     
       for (int i = 0; i < habitacion.size(); i++) {
          if(habitacion.get(i).getNum_habitacion()==numero_hab){
                 habitacion.get(i).setNum_habitacion(nuevo);
             }
       }
      
  }
  
  public void modificar_temporada(int numero_hab ,String nuevo){
       for (int i = 0; i < habitacion.size(); i++) {
          if(habitacion.get(i).num_habitacion==numero_hab){
      habitacion.get(i).setTemporada(nuevo);
  }
       }
      
  }
  
    public void modificar_cantidad_huespedes(int numero_hab ,int nuevo){
       for (int i = 0; i < habitacion.size(); i++) {
          if(habitacion.get(i).num_habitacion==numero_hab){
      habitacion.get(i).setCap_maxima(nuevo);
  }
       }
      
  }
  
  public String habitacionDispo(int piso){
      String rta ="";
  
    for (int i = 0; i < habitacion.size(); i++) {
          if(habitacion.get(i).piso==piso&&habitacion.get(i).responsable==null){  
      rta += habitacion.get(i).num_habitacion+" - ";
  }
    }
          return rta;
}
  
  public boolean darSalida(int numero_hab){
      
      for (int i = 0; i < habitacion.size(); i++) {
          if(habitacion.get(i).num_habitacion==numero_hab){
         habitacion.get(i).estadoFabrica();
            }
       }
      return false;
  }

    public ArrayList<Habitacion> getHabitacion() {
        return habitacion;
    }


}
