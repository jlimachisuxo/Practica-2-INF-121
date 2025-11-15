public class Aplicacion {
    public static void main(String[] args) {
        // Creación de objetos Doctor
        System.out.println("--- Creacion de doctores ---");
        Doctor doc1 = new Doctor("Dr. Garcia", "Cardiología");
        Doctor doc2 = new Doctor("Dra. Loza", "Pediatría");
        Doctor doc3 = new Doctor("Dra. Molina", "Cirugía");
        System.out.println(doc1);
        System.out.println(doc2);
        System.out.println(doc3);
        System.out.println("");

        // Creación de objetos Hospital
        Hospital h1 = new Hospital("Hospital del Norte");
        Hospital h2 = new Hospital("Hospital Arcoiris");


        System.out.println("--- Asignando doctores ---");
        h1.agregarDoctor(doc1);
        h1.agregarDoctor(doc2);

        h2.agregarDoctor(doc3);
        h2.agregarDoctor(doc1);

        System.out.println("");
        h1.mostrarDoctores();
        h2.mostrarDoctores();
    }
}
