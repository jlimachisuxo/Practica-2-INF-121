class Empleado:
    """Representa a un empleado con sus atributos básicos."""
    def __init__(self, nombre: str, cargo: str, sueldo: float):
        self.nombre = nombre
        self.cargo = cargo
        self.sueldo = sueldo

    def __str__(self):
        return f"Empleado(Nombre: {self.nombre}, Cargo: {self.cargo}, Sueldo: ${self.sueldo:.2f})"

class Departamento:
    def __init__(self, nombre: str, area: str):
        self.nombre = nombre
        self.area = area
        self.empleados = [] # Inicializa la lista de empleados

    def agregar_empleado(self, empleado: Empleado):
        self.empleados.append(empleado)

    # b) Agregar el metodo mostrarEmpleados()
    def mostrar_empleados(self):
        print(f"\n--- Empleados del Departamento de **{self.nombre}** ({self.area}) ---")
        if not self.empleados:
            print("No hay empleados en este departamento.")
            return
        for emp in self.empleados:
            print(f"- {emp}")
        print("-" * 50)

    # c) Implementar cambioSalario() para todos los empleados de un departamento en específico.
    def cambio_salario(self, porcentaje: float):
        print(f"\nAplicando {'aumento' if porcentaje > 0 else 'disminución'} de {abs(porcentaje)}% a los empleados de **{self.nombre}**...")
        for emp in self.empleados:
            aumento = emp.sueldo * (porcentaje / 100)
            emp.sueldo += aumento
        print("Salarios actualizados.")
        
    def __str__(self):
        return f"Departamento(Nombre: {self.nombre}, Área: {self.area}, Empleados: {len(self.empleados)})"

# -----------------------------------------------------------------------------

# PROGRAMA PRINCIPAL
# a) Instanciar 2 departamentos, uno con 5 empleados y el otro sin empleados.

print("---Instanciación de Departamentos y Empleados---")
# Crear Empleados
empleado1 = Empleado("Ana Pérez", "Jefa de Proyectos", 60000.00)
empleado2 = Empleado("Luis Gómez", "Desarrollador Senior", 55000.00)
empleado3 = Empleado("Carlos Ruiz", "Tester QA", 40000.00)
empleado4 = Empleado("Marta Soto", "Analista Funcional", 48000.00)
empleado5 = Empleado("Javier Díaz", "Soporte Técnico", 35000.00)

# 1. Departamento con 5 empleados
dpto_ventas = Departamento("Ventas & Marketing", "Comercial")
dpto_ventas.agregar_empleado(empleado1)
dpto_ventas.agregar_empleado(empleado2)
dpto_ventas.agregar_empleado(empleado3)
dpto_ventas.agregar_empleado(empleado4)
dpto_ventas.agregar_empleado(empleado5)
print(f"Departamento 1 Creado: {dpto_ventas}")

# 2. Departamento sin empleados
dpto_rrhh = Departamento("Recursos Humanos", "Administración")
print(f"Departamento 2 Creado: {dpto_rrhh}")

print("\n" + "=" * 50)

# b) Agregar el metodo mostrarEmpleados()

print("---Uso del método mostrarEmpleados()---")
dpto_ventas.mostrar_empleados()
dpto_rrhh.mostrar_empleados() 

print("\n" + "=" * 50)

# c) Implementar cambioSalario() para todos los empleados de un departamento en específico.

print("---Aumento del 10% en Ventas---")
dpto_ventas.cambio_salario(10.0)
dpto_ventas.mostrar_empleados() # Verificación del cambio de salario

print("\n" + "=" * 50)

# d) Verificar si algun empleado del departamento 1 pertenece al departamento 2.
print("---Verificación de pertenencia de empleados---")

empleados_dpto1 = set(dpto_ventas.empleados)
empleados_dpto2 = set(dpto_rrhh.empleados)

# Intersección de los conjuntos de empleados
empleados_en_ambos = empleados_dpto1.intersection(empleados_dpto2)

if empleados_en_ambos:
    print(f"**Verificación:** SÍ, hay {len(empleados_en_ambos)} empleados del Dpto. 1 que también están en el Dpto. 2 (lista de objetos, no es común en la vida real).")
    for emp in empleados_en_ambos:
        print(f"- {emp.nombre}")
else:
    print("**Verificación:** NO, ningún empleado del Dpto. 1 pertenece al Dpto. 2 actualmente.")

print("\n" + "=" * 50)

# e) Mover los empleados del departamento 1 al departamento 2

print("---Mover empleados de Dpto. 1 a Dpto. 2 y mostrar resultados---")

# Mover: Recorrer y agregar al Dpto. 2, y luego vaciar el Dpto. 1
for empleado in dpto_ventas.empleados:
    dpto_rrhh.agregar_empleado(empleado)

dpto_ventas.empleados = [] # Vaciar la lista de empleados del Dpto. 1

print("\n--- Estado de los Departamentos Después de la Transferencia ---")
print(f"Estado Final Dpto. 1 ({dpto_ventas.nombre}): {dpto_ventas}")
dpto_ventas.mostrar_empleados()

print("\n")
print(f"Estado Final Dpto. 2 ({dpto_rrhh.nombre}): {dpto_rrhh}")
dpto_rrhh.mostrar_empleados()

print("\n" + "=" * 50)