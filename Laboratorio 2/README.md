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

### Add16

### Inc16

### ALU

## PRACTICA 3: Memoria

### **1-bit register (BIT):**

### Register
### RAM8
### RAM64
### RAM512
### RAM4K
### RAM16K
### PC

## PREGUNTAS ADICIONALES:
1. ¿Cuál es el objetivo de cada uno de esos proyectos con sus palabras y describa que debe hacer para desarrollarlo?
2. Explique las principales diferencias entre la lógica aritmética y la lógica secuencial.
3. ¿Qué tipo de unidades aritmético lógicas existen?
