package ejercicio8;

public class Main {
    public static void main(String[] args) {
        
        // C. Instanciación y Resolución del Cliente

        // 1. Instanciar Facultades
        Facultad ing = new Facultad("Ingenieria");
        Facultad derecho = new Facultad("Derecho y Ciencias Políticas");

        // 2. Instanciar Fraternidades
        Fraternidad caporales = new Fraternidad("Caporales San Simón", ing.getNombre());
        Fraternidad tinku = new Fraternidad("Tinku San Andrés", derecho.getNombre());
        
        ing.agregarFraternidad(caporales);
        derecho.agregarFraternidad(tinku);

        // 3. Instanciar Bailarines (5 participantes en total)
        // Bailarines para Caporales (Facultad Ing.)
        Bailarin encargadoCap = new Bailarin("Marco", "Flores", 25, "12330264LP", caporales.getNombre(), ing.getNombre(), true);
        Bailarin bailarinCap1 = new Bailarin("Sofía", "Rojas", 20, "4562364LP", caporales.getNombre(), ing.getNombre(), false);
        
        // Bailarines para Tinku (Facultad Derecho)
        Bailarin encargadoTin = new Bailarin("Luis", "Pérez", 28, "7891203LP", tinku.getNombre(), derecho.getNombre(), true);
        Bailarin bailarinTin1 = new Bailarin("Ana", "Mamani", 19, "10120361LP", tinku.getNombre(), derecho.getNombre(), false);
        
        // Participante sin fraternidad aún (para prueba de registro)
        Bailarin nuevoBailarin = new Bailarin("Carlos", "Guzmán", 22, "20212951LP", null, null, false); // null para probar la verificación

        // 4. Asignar Encargados y Registrar Participantes
        caporales.setEncargado(encargadoCap);
        tinku.setEncargado(encargadoTin);

        caporales.getParticipantes().add(encargadoCap);
        caporales.getParticipantes().add(bailarinCap1);
        tinku.getParticipantes().add(encargadoTin);
        tinku.getParticipantes().add(bailarinTin1);

        System.out.println("\n--- Prueba de Registro (Verificación de Fraternidad) ---");
        // Registro exitoso para Carlos
        caporales.registrarIntegrante(nuevoBailarin); 
        
        // Registro fallido para Sofía (ya está en Caporales San Simón)
        tinku.registrarIntegrante(bailarinCap1); 

        // 5. Mostrar la información solicitada por el cliente

        System.out.println("");
        System.out.println("=== Resultados Solicitados por el Cliente ===");
        System.out.println("=============================================");

        // Mostrar a los bailarines y a qué fraternidad y facultad pertenecen, y sus edades.
        ing.mostrarBailarinesPorFraternidad();
        derecho.mostrarBailarinesPorFraternidad();
        
        // Conocer al encargado de cada fraternidad
        caporales.mostrarInfo();
        tinku.mostrarInfo();

        System.out.println("\n--- Resumen de Facultades y Encargados ---");
        ing.mostrarFraternidades();
        derecho.mostrarFraternidades();
        System.out.println("");
    }
}
