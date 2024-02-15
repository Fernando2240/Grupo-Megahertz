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

![OR](https://github.com/Fernando2240/Grupo-Megahertz/assets/73613484/1eae5a8c-fafd-4954-bd16-f690dcb1c070)

En la compuerta OR sencillamente negamos las entradas de una NAND, de esta forma conseguimos el mismo funcionamiento de la compuerta OR. 

### **Compuerta XOR:**

![Xor](https://github.com/Fernando2240/Grupo-Megahertz/assets/92164946/24804705-2da4-4bb4-bf67-3c26cca0383e)

La compuerta lógica XOR, también conocida como exclusiva OR, es un componente fundamental en la lógica digital y se construye mediante la combinación de compuertas lógicas Not, And, y Or. La función XOR produce un resultado verdadero (1/High) solo cuando una y solo una de las entradas es verdadera.

### **Compuerta MUX:**

![Mux](https://github.com/Fernando2240/Grupo-Megahertz/assets/92164946/ae2a8f41-4da2-4cde-8579-4ed71bdc61c4)

La compuerta lógica MUX (Multiplexor) es un dispositivo fundamental en la lógica digital que se utiliza para seleccionar una de las múltiples entradas y enrutarla hacia la salida. La operación de un MUX se controla mediante las entradas de selección, que determinan cuál de las entradas de datos se transmite a la salida.

### **Compuerta DMUX:**

![DMux](https://github.com/Fernando2240/Grupo-Megahertz/assets/92164946/4329fc92-2798-44cd-bebc-6c8f5b83a046)

El demultiplexor (DMux) es otro componente esencial en la lógica digital que realiza la función inversa del multiplexor (Mux). Un demultiplexor toma una única entrada y la enruta a una de las múltiples salidas según el estado de un selector de control.

### **Compuerta And16**

![And16](https://github.com/Fernando2240/Grupo-Megahertz/assets/92164946/e5264ef2-f8b3-4d28-91c1-d022d101f2ef)

La compuerta AND de 16 bits ha sido conformada por compuertas AND que comparan el bit n de la cadena a con el bit n de la cadena b y con el paso de las iteraciones, se comparan los bits n+1 de cada una de las cadenas respectivamente.

### **Compuerta NOT16:**

![Not16](https://github.com/Fernando2240/Grupo-Megahertz/assets/92164946/78af8d4f-cd3f-4582-8907-133ebbbc08f7)

La compuerta lógica Not16 es una compuerta Not que opera en un bus de 16 bits. Esto significa que tiene 16 entradas y 16 salidas, y realiza la operación lógica Not (inversión) en cada bit de entrada individualmente. Cada bit de la salida es la negación del bit correspondiente en la entrada de 16 bits.

### **Compuerta OR16:**

![Or16](https://github.com/Fernando2240/Grupo-Megahertz/assets/92164946/62af5991-5cf6-48af-8e13-3e8d553cbbc2)

La compuerta OR de 16 bits ha sido conformada por compuertas AND que comparan el bit n de la cadena a con el bit n de la cadena b y con el paso de las iteraciones, se comparan los bits n+1 de cada una de las cadenas respectivamente.

### **Compuerta Mux16**

![Mux16](https://github.com/Fernando2240/Grupo-Megahertz/assets/92164946/7763a12e-50ef-4832-b24f-e75bbce40c38)

Se selecciona una de las múltiples entradas y se enruta hacia la salida. La operación de un MUX se controla mediante las entradas de selección, que determinan cuál de las entradas de datos se transmite a la salida. De esta manera las entradas n de la cadena a se comparan con las entradas n de la cadena b, así conseguimos 16 salidas correspondientes a 16 entradas.

### **Compuerta Or8Way**

![Or8Way](https://github.com/Fernando2240/Grupo-Megahertz/assets/92164946/3167e0b7-9544-420f-ac0a-0141a404becd)

La compuerta OR de 8 caminos en los que las entradas son recursivas de tal manera que la salida de la primer compuerta es la entrada de la segunda, entonces la salida de la compuerta n será la entrada de la compuerta n+1.

### **Preguntas adicionales:**

1. ¿Que consideraciones importantes debe tener en cuenta para trabajar con Nand2Tetris?

Para trabajar con Nand2Tetris se debe tener en cuenta la sintaxis para utilizar su software. De igual manera hay que tener una buena comprensión de conceptos fundamentales, como en este caso, la logica booleana.

2. ¿Qué otras herramientas similares a Nand2Tetris existen? (De mínimo dos ejemplos)

Otras herramientas similares podrian ser:
- Logisim
- Yosys
