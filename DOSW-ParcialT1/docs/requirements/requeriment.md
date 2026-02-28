# 📄 Requerimientos del Sistema

### 1.1 Requerimiento Funcional 1

| Campo | Descripción |
|------|-------------|
| **ID** | RF-01 |
| **Nombre del requerimiento** | Creación de eventos |
| **Descripción** | *El sistema debe permitir la creación de enventos.* |
| **Precondiciones** | *Para que el sistema cumpla con este requerimiento, EventSync debe tener previamente una validación para saber quién lo quiere crear y además qué quiere crear.* |
| **Actor** | *Profesor/Administrativo* |
| **Flujo principal** | 1. El actor ingresa al sistema.<br>2. El sistema valida que tipo de usuario es.<br>3. El sistema valida que el evento que quiere crear exista y lo crea. |
| **Diagrama de caso de uso** | ![DiagramaCaso1](/DOSW-ParcialT1/docs/uml/DiagramaCaso1.png)|
| **Poscondiciones** | *Se espera como resultado el tipo de evento creado correctamente.* |


### 1.2 Requerimiento Funcional 2

| Campo | Descripción |
|------|-------------|
| **ID** | RF-02 |
| **Nombre del requerimiento** | Inscripción de asistentes |
| **Descripción** | *El sistema debe permitir la inscripción de los asistentes.* |
| **Precondiciones** | *Para que el sistema cumpla con este requerimiento, EventSync debe tener previamente una validación de cupos y de existencia del curso.* |
| **Actor** | *Estudiante/Profesor* |
| **Flujo principal** | 1. El actor ingresa al sistema. <br>2. El sistema verifica que sea el usuario correcto.<br>3. El sistema verifica cupos en el evento e inscribe al usuario o lo rechaza si está lleno. |
| **Diagrama de caso de uso** |![DiagramaCaso2](/DOSW-ParcialT1/docs/uml/DiagramaCaso2.png) |
| **Poscondiciones** | *Se espera como resultado la inscripcion del estudiante o profesor a la actividad querida o el rechazo si está lleno.* |
