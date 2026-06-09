![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Evaluación Final Transversal – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Jose Humberto Martinez Farias
- **Sección:** desarrollo orientado a objetos
- **Carrera:** analista programador computacional
- **Sede:** online

---

## 📘 Descripción general del sistema
Llanquihue Tour es un sistema orientado a objetos desarrollado en Java que digitaliza
la gestión de personas vinculadas a una agencia de turismo ubicada en la Región de Los Lagos. 
Permite representar de forma estructurada a clientes, empleados y 
guías turísticos, eliminando el manejo manual de información y estableciendo una base sólida
para futuras expansiones del sistema.

---
## 🧱 Estructura general del proyecto

```plaintext
LlanquihueTour
└── src
    ├── app
    │   └── Main.java              → Clase principal, punto de entrada del sistema
    └── model
        ├── Direccion.java         → Clase de composición, representa una dirección física
        ├── Persona.java           → Clase base, atributos comunes de toda persona
        ├── Empleado.java          → Hereda de Persona, representa personal interno
        ├── Cliente.java           → Hereda de Persona, representa turistas o contratantes
        └── GuiaTuristico.java     → Hereda de Empleado, representa guías con especialidad
````

---



## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/usuario/repositorio-evaluacion-final.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Verifica que los archivos `.txt` estén correctamente ubicados.

4. Ejecuta el archivo `Main.java` desde el paquete `app`.

5. Sigue las instrucciones en consola o en la interfaz gráfica (si corresponde).


---

**Repositorio GitHub:** \(https://github.com/josemartinezf/LlhanquihueTour)
**Fecha de entrega:** \[08/06/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Final Transversal EFT



