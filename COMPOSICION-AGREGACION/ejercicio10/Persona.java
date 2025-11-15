package ejercicio10;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int ci;
    
    public Persona(String nombre, String apellido, int edad, int ci) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ci = ci;
    }

    public String getNombre() { 
        return nombre; 
    }
    public String getApellido() { 
        return apellido; 
    }
    public int getEdad() { 
        return edad; 
    }
    public int getCi() { 
        return ci; 
    }
}
