package ejercicio8;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String ci;

    public Persona(String nombre, String apellido, int edad,  String ci){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ci = ci;
    }

    // Getters
    public String getNombreCompleto() { 
        return nombre + " " + apellido; 
    }
    public int getEdad() { 
        return edad; 
    }
    public String getCi() { 
        return ci; 
    }

    @Override
    public String toString() {
        return "Persona [Nombre: "+ nombre + " " + apellido + ", Edad: " + edad + ", CI: " + ci + "]";
    }
}
