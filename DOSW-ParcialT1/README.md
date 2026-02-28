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
