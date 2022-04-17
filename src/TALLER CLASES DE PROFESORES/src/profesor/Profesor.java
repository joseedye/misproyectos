package profesor;

import java.util.Date;

public abstract class  Profesor extends Persona {
int codigo=0;
Date fechaDeEntrada;

    public Profesor(String nombre, String apellido, String edad) {
        super(nombre, apellido, edad);
    }
  
abstract public float importeNomina();
}
