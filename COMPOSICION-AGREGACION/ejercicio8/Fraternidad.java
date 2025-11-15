package ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Fraternidad {
    private String nombre;
    private Bailarin encargado;
    private String facultadAsociada;
    private List<Bailarin> participantes;

    public Fraternidad(String nombre, String facultadAsociada) {
        this.nombre = nombre;
        this.facultadAsociada = facultadAsociada;
        this.participantes = new ArrayList<>();
        this.encargado = null;
    }

    // Getters
    public String getNombre() { 
        return nombre; 
    }
    public Bailarin getEncargado() { 
        return encargado; 
    }
    public String getFacultadAsociada() { 
        return facultadAsociada; 
    }
    public List<Bailarin> getParticipantes() { 
        return participantes; 
    }

    public void setEncargado(Bailarin encargado) {
        if (!encargado.getFraternidad().equals(this.nombre)) {
            System.out.println("Error: El encargado debe pertenecer a la fraternidad.");
            return;
        }
        if (this.encargado != null) {
            System.out.println("Cambiando encargado de " + this.nombre + ": " + this.encargado.getNombreCompleto() + " -> " + encargado.getNombreCompleto());
        } else {
             System.out.println("Estableciendo encargado de " + this.nombre + ": " + encargado.getNombreCompleto());
        }
        this.encargado = encargado;
    }

    public boolean registrarIntegrante(Bailarin nuevoBailarin) {
        // 1. Verificar si ya está en otra fraternidad (por el atributo `fraternidad` del Bailarin)
        if (nuevoBailarin.getFraternidad() != null && !nuevoBailarin.getFraternidad().isEmpty()) {
            System.out.println("❌ Error de registro: " + nuevoBailarin.getNombreCompleto() + " ya pertenece a la fraternidad: " + nuevoBailarin.getFraternidad());
            return false;
        }

        // 2. Si no tiene, se registra y se actualizan sus datos
        nuevoBailarin.setFraternidad(this.nombre);
        nuevoBailarin.setFacultad(this.facultadAsociada);
        this.participantes.add(nuevoBailarin);
        System.out.println("Registro exitoso en " + this.nombre + ": " + nuevoBailarin.getNombreCompleto());
        return true;
    }

    public void mostrarInfo() {
        String enc = (encargado != null) ? encargado.getNombreCompleto() : "No asignado";
        System.out.println("\n--- Fraternidad: " + nombre + " ---");
        System.out.println("Facultad Asociada: " + facultadAsociada);
        System.out.println("Encargado: " + enc);
        System.out.println("Total de Participantes: " + participantes.size());
        System.out.println("Detalle de Participantes:");
        for (Bailarin b : participantes) {
            System.out.println("  - " + b.getNombreCompleto() + " (Edad: " + b.getEdad() + ")");
        }
    }
}
