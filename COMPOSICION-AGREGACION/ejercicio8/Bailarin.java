package ejercicio8;

public class Bailarin extends Persona {
    private String fraternidad;
    private String facultad;
    private boolean esEncargado;

    public Bailarin(String nombre, String apellido, int edad, String ci, String fraternidad, String facultad, boolean esEncargado){
        super(nombre, apellido, edad, ci);
        this.fraternidad = fraternidad;
        this.facultad = facultad;
        this.esEncargado = esEncargado;
    }

    // Getters específicos de Bailarin
    public String getFraternidad() { 
        return fraternidad; 
    }
    public String getFacultad() { 
        return facultad; 
    }
    public boolean esEncargado() { 
        return esEncargado; 
    }
    
    // Método para cambiar la fraternidad (usado en el registro si no tiene una)
    public void setFraternidad(String fraternidad) { 
        this.fraternidad = fraternidad; 
    }
    public void setFacultad(String facultad) { 
        this.facultad = facultad; 
    }

    @Override
    public String toString() {
        String rol = esEncargado ? " (Encargado)" : "";
        return super.toString() + rol + ", Fraternidad: " + fraternidad + ", Facultad: " + facultad;
    }
}
