package ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private String nombre;
    private List<Fraternidad> fraternidades;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.fraternidades = new ArrayList<>();
    }

    public String getNombre() { 
        return nombre; 
    }

    public void agregarFraternidad(Fraternidad f) { 
        this.fraternidades.add(f); 
    }

    public void mostrarFraternidades() {
        System.out.println("\n*** Facultad: " + nombre + " ***");
        if (fraternidades.isEmpty()) {
            System.out.println("  No tiene fraternidades registradas.");
        } else {
            System.out.println("Fraternidades Registradas:");
            for (Fraternidad f : fraternidades) {
                System.out.println("  - " + f.getNombre() + " (Encargado: " + (f.getEncargado() != null ? f.getEncargado().getNombreCompleto() : "No tiene encargado") + ")");
            }
        }
    }

    // Método para mostrar todos los bailarines de la facultad y su fraternidad
    public void mostrarBailarinesPorFraternidad() {
        System.out.println("\n*** Bailarines de " + nombre + " ***");
        for (Fraternidad f : fraternidades) {
            System.out.println("  > Fraternidad: " + f.getNombre());
            for (Bailarin b : f.getParticipantes()) {
                // Se utiliza el toString de Bailarin para ver todos los datos solicitados (nombre, fraternidad, facultad)
                System.out.println("    - " + b); 
            }
        }
    }
}
