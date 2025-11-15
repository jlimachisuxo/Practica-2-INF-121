import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String nombre;
    private List<Doctor> doctores;

    public Hospital(String nombre){
        this.nombre = nombre;
        this.doctores = new ArrayList<>();
    }

    // Permite asignar doctores a hospitales
    public void agregarDoctor(Doctor doc){
        this.doctores.add(doc);
        System.out.println(" - " + doc.toString() + " asignado al " + this.nombre);
    }

    // Permite mostrar los doctores de cada hospital
    public void mostrarDoctores(){
        System.out.println("=== Doctores del " + this.nombre + " ===");
        if (doctores.isEmpty()) {
            System.out.println("No hay doctores asuganados.");
        } else{
            for(Doctor d : doctores){
                System.out.println(d);
            }
        }
        System.out.println("");
    }
}
