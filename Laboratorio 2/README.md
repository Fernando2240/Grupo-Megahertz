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

<div align="center">
    
![image](https://github.com/Fernando2240/Grupo-Megahertz/assets/92164946/9547e42f-0abd-40b3-990a-12ceb821d898)

</div>

### Register

El chip "registro" fue hecho a partir del chip que creamos anteriormente (bit), donde utilizamos utilizamos 16 de ellos y cada uno se le asigna el mismo load y una posición determinada de la cadena "in" como tambien una salida en esa misma posicion. 

<div align="center">
    
![image](https://github.com/Fernando2240/Grupo-Megahertz/assets/92164946/246dbdf2-e96d-4c53-8785-bec7c382fa26)

</div>

### RAM8

Para constuir el chip Ram8 utilizamos los registros junto con un Dmux8way y un Mux8way16, de esta forma el demultiplexor va a dejar pasar el load a alguno de los 8 registros según indique el selector( que en este caso le llamamos la dirección o address) una vez que pasa el load este nos indica si el registro se modifica o no con la entrada "in". Luego el multiplexor deja pasar la salida del registro con la direccion que nosotros especificamos. De esta forma construimos la Ram8.

<div align="center">
    
![image](https://github.com/Fernando2240/Grupo-Megahertz/assets/92164946/0eafef54-2a87-46ea-8e87-5d4b94942ffc)

</div>

### RAM64

El proceso para construir el chip Ram64 es parecido al de la Ram8, con al diferencia que ahora en lugar de registros utilizamos Ram8. Entonces para realizar este chip necesitamos un Dmux8way, 8 Ram8 y un Mux8way16, y ahora nuestro el selector será los ultimos 3 bits de la cadena address, que son los que me van a indicar a cual de las 8 ram8 se va a dirigir el load, luego los otros 3 bits en la posicion de 0 a 2 serán los que me indican a cual registro especifico es la dirección. Así mismo, en el multiplexor los ultimos 3 bits(de la posición 3 a 5) del address me van a indicar cual salida deja pasar.

<div align="center">
    
![image](https://github.com/Fernando2240/Grupo-Megahertz/assets/92164946/b96db4f1-6363-4324-90d6-ecb367473ac2)

</div>

### RAM512

De igual forma, con la misma logica que trabajamos los chips Ram8 y Ram64, así mismo se construye la Ram512, esta vez haciendo uso de 8 ram64 y el address ahora es de tamaño 9 bits, donde los ultimos 3 ([6-8]) me indican a cual de las rams64 va a seguir el load,es decir los que se le proporcionan como selector del demultiplexor, y los primeros 6 bits del address se proporcionan a la Ram64 que corresponda.

<div align="center">
    
![image](https://github.com/Fernando2240/Grupo-Megahertz/assets/92164946/a7a5a558-147a-4cb4-b0c6-0fbf7a16239d)

</div>

### RAM4K

En este caso, se construye el chip de igual manera que como trabajamos con los anteriores reemplazando las Ram64 por Ram512 y de igual forma que el chip anterior los 3 primeros bits del address son los que se introducen en el selector y los otros 9 bits del address van para la ram512 especifica.

<div align="center">
    
![image](https://github.com/Fernando2240/Grupo-Megahertz/assets/92164946/6a429f94-0df2-4d83-88c8-630f963c6c4c)

</div>

### RAM16K

Este chip cambia un poco en la construcción comparandolo como realizamos los otros chips de ram, pero de igual manera hacemos uso del chip anterior, el multiplexor y el demultiplexor. Para este chip utilizamos Dmux4way y Mux4way16 ya que ahora solo tenemos 4 Ram4k que son las que componen a la Ram16k. De esta manera nuestro selecctor tanto del Dmux4way y del Mux4way, ahora solo toma en cuenta los ultimos 2 bits del address, y los otros 12 bits a la Ram4k.

<div align="center">
    
![image](https://github.com/Fernando2240/Grupo-Megahertz/assets/92164946/48e4b4a6-ae5e-4d0b-a897-616e40ccb359)

</div>

### PC

<div align="center">
    
![image](https://github.com/Fernando2240/Grupo-Megahertz/assets/92164946/56bd71d7-7c87-4ccc-8707-9d81c4077ae7)

</div>

## PREGUNTAS ADICIONALES:
1. ¿Cuál es el objetivo de cada uno de esos proyectos con sus palabras y describa que debe hacer para desarrollarlo?
2. Explique las principales diferencias entre la lógica aritmética y la lógica secuencial.
3. ¿Qué tipo de unidades aritmético lógicas existen?
