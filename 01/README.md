# Desarrollo del taller #1

## **PRACTICA 1: LOGICA BOOLEANA**

El proposito de esta practica es comprender detalladamente el funcionamiento de las compuertas logicas. Para esto, partimos de la compuerta logica basica "NAND" y a apartir de ella construimos 
las demas compuertas logicas, pasando por las mas basicas a las mas complejas.

### **Compuerta NOT:**

![NOT](https://github.com/Fernando2240/Grupo-Megahertz/assets/73613484/71932439-030c-4adc-bf36-ae182a35f414)

Esta es la primera compuerta que se realizó a partir de la compuerta primitiva NAND. Basicamente,las dos entradas de la NAND van a ser la misma (in), por lo que si el valor de la entrada es 0, su salida será 1 y de modo 
contrario si su entrada es 1, su salida será 0. Este comportamiento es el mismo de la compuerta NOT.

### **Compuerta AND:**

![AND](https://github.com/Fernando2240/Grupo-Megahertz/assets/73613484/0c9c67f8-bc7b-4068-89cf-1d19c4c50153)

Para esta compuerta utilizamos la NAND y la NOT ya que esta ultima ya la construimos. Simplemente las entradas pasan por la compuerta NAND y despues negamos su salida, de esta forma obtenemos la compuerta AND.

### **Compuerta OR:**

En la compuerta OR sencillamente negamos las entradas de una NAND, de esta forma conseguimos el mismo funcionamiento de la compuerta OR. 

### **Compuerta OR16:**



### **Preguntas adicionales:**

1. ¿Que consideraciones importantes debe tener en cuenta para trabajar con Nand2Tetris?

Para trabajar con Nand2Tetris se debe tener en cuenta la sintaxis para utilizar su software. De igual manera hay que tener una buena comprensión de conceptos fundamentales, como en este caso, la logica booleana.

2. ¿Qué otras herramientas similares a Nand2Tetris existen? (De mínimo dos ejemplos)

Otras herrmientas similares podrian ser:

-Logisim 
-Yosys
