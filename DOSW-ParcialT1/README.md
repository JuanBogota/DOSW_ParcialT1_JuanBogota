# DOSW_ParcialT1_JuanBogota

Parcial primer tercio DOSW-2026-1
Juan Daniel Bogotá Fuentes

 ---

## 1. Diagrama de contexto:
![DiagramaContexto](/DOSW-ParcialT1/docs/uml/DiagramaContexto.png)

---
## 2. Identificando 2 patrones de diseño que puedan aplicarse al caso de estudio, especificando por cada uno:

*a. Nombre de los patrones*

Factory Method y Observator

*b. Tipo de patrón (creacional, estructural o de comportamiento).*

Los tipos de patrones son creacionales y de comportamiento.

*c. Justificación de la decisión.*

1. Factory Method

     Escogí este patrón porque ayuda para crear cada actividad de una forma correcta, en este caso solo tenemos 3 actividades, pero si la universidad desea aumentarlas no hay problema, así respetamos el principio O de SOLID y generamos un código manejable, además evitamos llenar el programa de news, es decir, no creamos instancias cada que se quiera crear una actividad, se puede hacer la reutilización de código mediente el poliformismo.

2. Observator

    Escogí este patrón porque ayuda para las notificaciones, así puede notificar a los usuarios cuando el evento sea confirmado, cancelado, se modifique la fecha u hora de inicio, o si ya se llenó. Además lo uso porque asi no importa que tipo de usuario sea, sea profesor, estudiante o administrativo o si más adelante exista otro tipo de usuario.

---
## 3. Identificando 5 requerimientos del sistema y clasifíquelos en funcionales (3) y no funcionales (2). Garantiza que al menos un requerimiento funcional seleccionado utilice un patrón identificado:

### Funcionales (Responde al qué debe hacer):

    1. Debe permitir crear eventos. (Usa el patrón factory method)
    2. Debe permitir inscribir asistentes.
    3. Debe permitir notificar cambios a las personas inscritas en los eventos.

### No funcionales (Responde al cómo lo debe hacer):

    1. Validar que el correo de los profesores termine en @escuelaing.edu.co.
    2. Validar cupo para inscribir asistentes.

---
## 4. Del listado anterior, se seleccionan los 2 requerimientos funcionales más importantes del sistema y se desarrolla un diagrama de casos de uso con su respectiva historia de usuario. Garantiza que al menos un requerimiento funcional seleccionado utilice un patrón identificado.

    1. Debe permitir crear eventos. (Usa el patrón factory method)
    2. Debe permitir inscribir asistentes.

1. 
![DiagramaCaso1](/DOSW-ParcialT1/docs/uml/DiagramaCaso1.png)

2. 
![DiagramaCaso2](/DOSW-ParcialT1/docs/uml/DiagramaCaso2.png)

## 5. Especificando los 2 requerimientos funcionales seleccionados en el punto anterior.

Punto 5 en requerimientos.

## 6. Seleccionando un requerimiento asociado al patrón y realizando la descomposición de tareas asociadas: Épica - Historia de Usuario - Al menos 3 tareas.

Con el requerimiento RF-01, que está asociado al patrón factory method sería así:

### Epica : 
Creación de eventos
### Historias de usuario:

Validar que la cuenta sea permitida para crear un evento:

    COMO Desarrollador
    QUIERO verificar que la cuenta sea permitida
    PARA PODER permitir crear el evento.
### Tareas:

1. Validar que la cuenta pueda acceder al sistema y exista.
2. Validar que la cuenta sea de un profesor o administrativo, verificando que cumpla con el correo estipulado, @escuelaing.edu.co.
3. Permitir crear un evento que exista, verificando que se registre la información obligatoria.


