# DOSW_ParcialT1_JuanBogota

Parcial primer tercio DOSW-2026-1
Juan Daniel Bogotá Fuentes

 ---

## 1. Diagrama de contexto:
![DiagramaContexto](/DOSW-ParcialT1/docs/uml/DiagramaContexto.png)

---
## 2. Identificando 2 patrones de diseño que puedan aplicarse al caso de estudio, especificando por cada uno:

*a. Nombre de los patrones*

Factory Method y Chain of Responsibility

*b. Tipo de patrón (creacional, estructural o de comportamiento).*

Los tipos de patrones son creacionales y de comportamiento.

*c. Justificación de la decisión.*

1. Factory Method

     Escogí este patrón porque ayuda para crear cada actividad de una forma correcta, en este caso solo tenemos 3 actividades, pero si la universidad desea aumentarlas no hay problema, así respetamos el principio O de SOLID y generamos un código manejable, además evitamos llenar el programa de news, es decir, no creamos instancias cada que se quiera crear una actividad, se puede hacer la reutilización de código mediente el poliformismo.

2. Chain of Responsibility

    Escogí este patrón porque ayuda para mantener la responsabilidad de cada clase, además el sistema me parece como una cadena de secuencias, por ejemplo, primero se consumen los datos del usuario, después se crea el evento dependiendo del usuario, después se registra la inscripción y se verifica que aun tenga cupos, etc. Siento que es el que mejor se ajusta, tambien los estudiantes no deberian poder crear actividades.

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

1. ![DiagramaCaso1](/DOSW-ParcialT1/docs/uml/DiagramaCaso1.png)
2. ![DiagramaCaso2](/DOSW-ParcialT1/docs/uml/DiagramaCaso2.png)
