public class Doctor {

    private String nombre;
    private String especialidad;

    public Doctor(String nombre, String especialidad){
        this.nombre = nombre;
        this.especialidad = especialidad;
        
    }

    @Override
    public String toString(){
        return "Doctor: [nombre=" + nombre + ", especialidad=" + especialidad + "]";
    }
    
}