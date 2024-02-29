# Desarrollo del taller #1

## PRACTIVA 2: Aritmética booleana

### HalfAdder

Para la suma de dos bits, primero se compara la tabla de verdad de un xor con las salidas que una suma da teniendo en cuanta que sólo puede dar 1 en las ocasiones en las que hay un 0 1 o un 1 0 como entradas para A y B según corresponde, ya que la tabla de xor nos genera ese tipo de salidas lógicas, es utilizado para este procedimiento conectado a las entradas de A y B.
Por otro lado, para el proceso de generación del carry se encuentra que logra hacerse con un AND, de la misma manera, sabiendo que sólo existe cuando las entradas A y B son ambas 1.
<div align="center">
    
  ![New Project (1)](https://github.com/Fernando2240/Grupo-Megahertz/assets/73613484/ec9ee1e5-cc15-42f0-b21e-610648b72dc8)
 
 Teniendo en cuenta ambas entradas ahora conectadas tanto al AND como al EXOR obtenemos que:
 
  ![New Project (2)](https://github.com/Fernando2240/Grupo-Megahertz/assets/73613484/b593ef58-4570-4e94-b3f1-73d2e7eda680)
</div>

Teniendo en cuenta esto, implementamos el código: 
![image](https://github.com/Fernando2240/Grupo-Megahertz/assets/125404992/79f9ae99-22d8-4815-aad3-2645cd620e69)

### FullAdder

El FullAdder es un circuito lógico que realiza la suma de tres bits: A, B, y un bit de acarreo de entrada (C). Su objetivo principal es calcular la suma de esos tres bits y generar dos salidas: la suma (sum) y un bit de acarreo de salida (carry-out). Para construir un chip FullAddres dividimos el proceso en dos partes, en la primera se realiza la suma del bit A y B mediante un HalfAdder dejando el resultado sum1 y un bit de acarreo c1. Posteriormente se realiza con otro HalfAddre la suma de sum1 y el bit C para obtener el resultado final de la suma, mientras que para el carry se pasan los dos acarreos anteriores por una compuerta OR.
<div align="center">
    
![Captura de pantalla 2024-02-29 141900](https://github.com/Fernando2240/Grupo-Megahertz/assets/92164946/804d3d4e-547a-46a5-b3f3-d820e4115b2e)
    
</div>

### Add16

El chip Add16 utiliza una estructura en cadena de Full Adders y un Half Adder para realizar la suma de dos números de 16 bits. Cada Full Adder calcula un bit de la suma y pasa el acarreo al siguiente nivel, logrando así la suma completa de los 16 bits. Este diseño es escalable y puede extenderse para sumar números de longitudes mayores.

<div align="center">
    
![image](https://github.com/Fernando2240/Grupo-Megahertz/assets/92164946/82498c0c-84b8-49b0-bc52-d4dc5a74b095)

    
</div>

### Inc16

el chip Inc16 es un incrementador que suma 1 al número de entrada de 16 bits utilizando una cadena de Half Adders. Cada Half Adder se encarga de sumar 1 a un bit específico y pasa el acarreo al siguiente nivel para propagar el incremento a través de todos los bits.

<div align="center">
    
![image](https://github.com/Fernando2240/Grupo-Megahertz/assets/92164946/b812ae13-f6d0-4867-b4cf-e52d129c9e0c)


</div>

### ALU

## PRACTICA 3: Memoria

### **1-bit register (BIT):**

Para construir este chip hacemos uso de de un multiplexor y un flip flop tipo dff, donde el selector del multiplexor es el load y las entradas son: la entrada directa y la salida del flip flop, de esta forma tenemos el mismo funcionamiento que el chip "bit" que cuando el load es igual a 1 su entrada carga el valor de la entrada y su salida es la entrada cargada anteriormente. 


### Register

El chip "registro" fue hecho a partir del chip que creamos anteriormente (bit), donde utilizamos utilizamos 16 de ellos y cada uno se le asigna el mismo load y una posición determinada de la cadena "in" como tambien una salida en esa misma posicion. 

### RAM8

Para constuir el chip Ram8 utilizamos los registros junto con un Dmux8way y un Mux8way, de esta forma el demultiplexor va a dejar pasar el load a alguno de los 8 registros según indique el selector( que en este caso le llamamos la dirección o address) una vez que pasa el load este nos indica si el registro se modifica o no con la entrada "in". Luego el multiplexor deja pasar la salida del registro con la direccion que nosotros especificamos. De esta forma construimos la Ram8.

### RAM64

El proceso para construir el chip Ram64 es parecido al de la Ram8, con al diferencia que ahora en lugar de registros utilizamos Ram8. Entonces para realizar este chip necesitamos un Dmux8way, 8 Ram8 y un Mux

### RAM512
### RAM4K
### RAM16K
### PC

## PREGUNTAS ADICIONALES:
1. ¿Cuál es el objetivo de cada uno de esos proyectos con sus palabras y describa que debe hacer para desarrollarlo?
2. Explique las principales diferencias entre la lógica aritmética y la lógica secuencial.
3. ¿Qué tipo de unidades aritmético lógicas existen?
