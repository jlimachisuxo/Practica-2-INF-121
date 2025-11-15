package ejercicio10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciación de objetos
        Speaker s_ana = new Speaker("Ana", "Gomez", 35, 2365842, "IA");
        Speaker s_luis = new Speaker("Luis", "Perez", 45, 9876543, "Backend");
        Speaker s_maria = new Speaker("Maria", "Lopez", 28, 1122334, "Frontend");

        Participante p_carlos = new Participante("Carlos", "Rios", 22, 9123695, 1);
        Participante p_elena = new Participante("Elena", "Diaz", 30, 974521, 2);
        Participante p_juan = new Participante("Juan", "Vega", 25, 2136471, 3);
        Participante p_david = new Participante("David", "Gonzales ", 23, 12365478, 4);
        
        Charla c_java = new Charla("Salon A", "Intro a Java", s_ana);
        c_java.agregarParticipante(p_carlos);
        c_java.agregarParticipante(p_carlos); // Carlos participa dos veces
        
        Charla c_python = new Charla("Salon B", "Python interfaces", s_luis);
        c_python.agregarParticipante(p_elena);
        c_python.agregarParticipante(p_juan);
        
        Charla c_sql = new Charla("Salon C", "Base de Datos", s_maria);
        c_sql.agregarParticipante(p_david);
        
        Evento miEvento = new Evento("Conferencia Tech");
        miEvento.agregarCharla(c_java); // np=2
        miEvento.agregarCharla(c_python); // np=2
        miEvento.agregarCharla(c_sql); // np=1
        
        System.out.println("");
        
        // a) Edad Promedio de Participantes
        double promedio = miEvento.calEdadPromParticipantes();

        System.out.printf("a) Edad promedio de los participantes: %.2f\n", promedio); 

        // b) Verificar si la persona está
        System.out.println("\nb) Verificación de personas:");
        System.out.println("   - Carlos Rios (Participante): " + miEvento.verificarPersonaEnCharla("Carlos", "Rios")); // true
        System.out.println("   - Ana Gomez (Speaker): " + miEvento.verificarPersonaEnCharla("Ana", "Gomez"));   // true
        System.out.println("   - Persona Inexistente: " + miEvento.verificarPersonaEnCharla("Pedro", "García"));   // false
        
        // d) Ordenar las charlas por número de participantes (antes de eliminar)
        List<Charla> ordenadasAntes = miEvento.ordenarCharlasPorParticipantes();
        System.out.println("\nd) Charlas ordenadas por NP (inicial):");
        ordenadasAntes.forEach(c -> System.out.println("   - " + c.getNombreCharla() + " (NP: " + c.getNp() + ")"));
        // Orden: Vue.js (0), Intro a Java (2), Spring Boot (2)

        // c) Eliminar charlas de Speaker
        String ciAElminar = "2365842"; // CI de Ana Gomez
        int eliminadas = miEvento.eliminarCharlasPorCI(ciAElminar);
        System.out.println("\nc) Eliminación de charlas (CI: " + ciAElminar + "):");
        System.out.println("   - Charlas eliminadas: " + eliminadas); // 1
        System.out.println("   - Charlas restantes en el evento: " + miEvento.getCharlas().size()); // 2

        // d) Ordenar las charlas por número de participantes (después de eliminar)
        List<Charla> ordenadasDespues = miEvento.ordenarCharlasPorParticipantes();
        System.out.println("\nd) Charlas ordenadas por NP (final):");
        ordenadasDespues.forEach(c -> System.out.println("   - " + c.getNombreCharla() + " (NP: " + c.getNp() + ")"));

        System.out.println("");

    }
}
