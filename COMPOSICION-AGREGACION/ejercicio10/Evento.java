package ejercicio10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.Iterator;

public class Evento {
    private String nombre;
    private int nc;
    private List<Charla> charlas;

    public Evento(String nombre) {
        this.nombre = nombre;
        this.charlas = new ArrayList<>();
        this.nc = 0;
    }

    public boolean agregarCharla(Charla c){
        if (charlas.size() < 50) {
            charlas.add(c);
            this.nc = charlas.size();
            return true;
        }
        return false;
    }

    // Getters
    public String getNombre() { 
        return nombre; 
    }
    public List<Charla> getCharlas() { 
        return charlas; 
    }

    // a) Calcula la edad promedio de los participantes en el evento.
    public double calEdadPromParticipantes(){
        int sumaEdades =0;
        int contarParticipantes = 0;

        for(Charla charla : this.charlas){
            for(Participante p : charla.getParticipantes()){
                sumaEdades += p.getEdad();
                contarParticipantes++;
            }
        }
        if (contarParticipantes == 0) {
            return 0.0;
        }

        return (double) sumaEdades / contarParticipantes;
    }

    //b) Verifica si la persona (X, Y) se encuentra en alguna charla (participante o speaker)
    public boolean verificarPersonaEnCharla(String nombre, String apellido) {
        String nom = nombre.toLowerCase();
        String ape = apellido.toLowerCase();
        
        for (Charla charla : this.charlas) {
            // 1. Verificar como Speaker
            Speaker speaker = charla.getSpeaker();
            if (speaker.getNombre().toLowerCase().equals(nom) && 
                speaker.getApellido().toLowerCase().equals(ape)) {
                return true;
            }
            
            // 2. Verificar como Participante
            for (Participante p : charla.getParticipantes()) {
                if (p.getNombre().toLowerCase().equals(nom) && 
                    p.getApellido().toLowerCase().equals(ape)) {
                    return true;
                }
            }
        }
        
        return false;
    }

    // c) Elimina todas las charlas que iba a dar el speaker con el C.I. X.
    public int eliminarCharlasPorCI(String ciSpeaker) {
        int eliminadas = 0;
        
        // Uso de Iterator para eliminar elementos de una lista mientras se itera
        Iterator<Charla> iterador = this.charlas.iterator();
        while (iterador.hasNext()) {
            Charla charla = iterador.next();
            if (String.valueOf(charla.getSpeaker().getCi()).equals(ciSpeaker)) {
                iterador.remove(); // Elimina la Charla de la lista del Evento
                eliminadas++;
            }
        }
        
        // Actualizar el contador de charlas (nc) del evento
        this.nc = this.charlas.size(); 
        
        return eliminadas;
    }

    // d) Ordena las charlas por el número de participantes (np).
    public List<Charla> ordenarCharlasPorParticipantes() {
        // Crear una copia de la lista para ordenar y retornar
        List<Charla> charlasOrdenadas = new ArrayList<>(this.charlas);
        
        // Usar Collections.sort con un Comparator para ordenar por 'np'
        Collections.sort(charlasOrdenadas, Comparator.comparingInt(Charla::getNp));
        
        return charlasOrdenadas;
    }


}
