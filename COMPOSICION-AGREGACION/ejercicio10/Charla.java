package ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class Charla {
    private String lugar;
    private String nombreCharla;
    private Speaker speaker;
    private int np;
    private List<Participante> participantes;

    public Charla(String lugar, String nombreCharla, Speaker speaker) {
        this.lugar = lugar;
        this.nombreCharla = nombreCharla;
        this.speaker = speaker;
        this.participantes = new ArrayList<>();
        this.np = 0;
    }

    public String getNombreCharla() { 
        return nombreCharla; 
    }
    public Speaker getSpeaker() { 
        return speaker; 
    }
    public int getNp() { 
        return np; 
    }
    public List<Participante> getParticipantes() { 
        return participantes; 
    }

    public boolean agregarParticipante(Participante p) {
        if (participantes.size() < 50) {
            participantes.add(p);
            this.np = participantes.size(); // Actualizar np
            return true;
        }
        return false;
    }

    // Método para actualizar np después de eliminar un participante, si fuera necesario
    public void actualizarNp() {
        this.np = this.participantes.size();
    }
}
