
class Doctor:
    def __init__(self, nombre, especialidad):
        self.nombre = nombre
        self.especialidad = especialidad

    def __str__(self):
        return f"Doctor: {self.nombre} ({self.especialidad})"


class Hospital:
    def __init__(self, nombre):
        self.nombre = nombre
        self.doctores = [] 

    # asignar doctores a hospitales
    def agregar_doctor(self, doctor):
        self.doctores.append(doctor)
        print(f"-> {doctor} asignado a {self.nombre}")

    #  mostrar los doctores de cada hospital
    def mostrar_doctores(self):
        print(f"\n--- Doctores del {self.nombre} ---")
        if not self.doctores:
            print("No hay doctores asignados.")
        else:
            for doctor in self.doctores:
                print(doctor)
        print("")

# --- programa principal ---

# 1. Creación de objetos Doctor 
print("--- Creando Doctores ---")
d1= Doctor("Dr. García", "Cardiología")
d2 = Doctor("Dra. López", "Pediatría")
d3 = Doctor("Dr. Pérez", "Cirugía")
print(d1)
print(d2)
print(d2)

# 2. Creación de objetos Hospital
print("")
h_central = Hospital("Hospital Central")
h_norte = Hospital("Hospital del Norte")

# 3. Asignación de doctores a hospitales (Agregación)
print("\n--- Asignando Doctores ---")
h_central.agregar_doctor(d1)
h_central.agregar_doctor(d2)

h_norte.agregar_doctor(d1) 
h_norte.agregar_doctor(d3)

print("")
h_central.mostrar_doctores()
h_norte.mostrar_doctores()