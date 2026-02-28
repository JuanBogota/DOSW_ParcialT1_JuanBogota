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
