# Desarrollo del taller #3

## PRACTICA 4: Programación en lenguaje de máquina

### Mult.asm (example of an arithmetic task): 
#### Inputs guardados en R0 y R1 (RAM[0] y RAM[1]). Computar el producto de R0 * R1 y guardar el resultado en R2 (RAM[2]). Asuma que R0 ≥ 0, R1 ≥ 0, y R0 * R1 < 32768. El código no debe cambiar los valores de R0 y R1.

### Fill.asm (example of an input/output task): 
#### Correr un loop infinito que escucha al teclado. Cuando cualquier tecla es presionada, el programa escribe "negro" en cada pixel volviendo la pantalla negra. ]Si ninguna tecla es pulsada, el programa blanquea la pantalla escribiendo "blanco" en cada pixel. Debe elegirse el orden en el que la pantalla hará la transición de tal manera que presionar la tecla por bastante tiempo sea lo que resulte en la pantalla completamente negra o blanca.

## PRACTICA 5: Arquitectura de computadores

### Memory

Para construir la memoria necesitamos de varios chips creados anteriormente, entre ellos: DMux4way, Or, RAM16K, Screen, Keyboard y un Mux4Way16. El demultiplexor se utiliza para determinar qué carga se activa según el selector, ya luego en los modulos de RAM16K y Screen se controlan los chips con la carga y dirección adecuada según correspona, despues se optiene la salida del teclado y por ultimo en el multiplexor elige entre las salidas de RAM16k, Screen y Keyboard dependiendo de la dirección.

### CPU
### Computer

Para el computer hicimos uso de 2 chips creados previamente que son Memory y CPU, y aparte tambien usamos el chip ya proporcionado ROM32K.

## PREGUNTAS ADICIONALES:

1. ¿Por qué el lenguaje de máquina es importante para definir la arquitectura computacional?

- **Interacción directa con el hardware:** El lenguaje de máquina es el único lenguaje que el procesador puede entender directamente. Define las instrucciones básicas como operaciones aritméticas, movimientos de datos, control de flujo, etc. Por lo tanto, es esencial para interactuar directamente con el hardware.

- **Control de bajo nivel:** El lenguaje de máquina proporciona un nivel de control muy bajo, lo cual permite diseñar sistemas eficientes y optimizados para ejecutar programas específicos.

- **Base para lenguajes de programación de alto nivel:** Los lenguajes de programación de alto nivel se traducen eventualmente a lenguaje de máquina para que la computadora pueda ejecutarlos. Por lo mismo es que comprender cómo funcionan las instrucciones a nivel de máquina es esencial para los diseñadores de lenguajes y compiladores.

- **Diseño de arquitectura de CPU:** El lenguaje de máquina influye directamente en el diseño de la arquitectura de la CPU. Las decisiones sobre el conjunto de instrucciones, la longitud de las palabras, los modos de direccionamiento, entre otros aspectos, están influenciadas por el lenguaje de máquina que se implementará.


2. ¿Qué diferencia ven entre arquitectura computacional, arquitectura de software y arquitectura del sistema? Justifique su respuesta.

- **Arquitectura Computacional**:
   - Se refiere al diseño y la estructura de los componentes físicos de una computadora.
   - Incluye aspectos como el conjunto de instrucciones de la CPU, el diseño de la jerarquía de memoria, el esquema de interconexión entre los componentes, entre otros.
   - La arquitectura computacional se centra en cómo los componentes de hardware interactúan entre sí para ejecutar programas y procesar datos.

- **Arquitectura de Software**:
   - Se refiere al diseño y la estructura de los componentes de software de un sistema informático, como aplicaciones, sistemas operativos, etc.
   - Incluye aspectos como el diseño de la estructura del **software**, la división en módulos, los patrones de diseño utilizados, la gestión de datos, la interacción con el usuario, entre otros.
   - La arquitectura de software se centra en cómo los diferentes componentes de software se organizan y comunican entre sí para lograr los objetivos funcionales y no funcionales del sistema propuesto.

- **Arquitectura del Sistema**:
   - Se refiere al diseño y la estructura del sistema informático en su conjunto, incluyendo tanto hardware como de software.
   - Se centra en la integración de hardware y software para formar un sistema funcional, satisfaciendo así los requisitos del usuario y del sistema.
   - Se preocupa por la interoperabilidad y la eficiencia global del sistema.

Teniendo en cuenta lo anterior podemos concluuir que la diferencia principal radica en el nivel de abstracción y enfoque. La arquitectura computacional se centra en el hardware, la arquitectura de software se centra en el software, mientras que la arquitectura del sistema abarca la integración y el funcionamiento global del sistema informático.

### Bonus
3. ¿La arquitectura computacional o la arquitectura del sistema no tiene en cuenta igualmente la arquitectura de software? Justifique su respuesta.

- Ambas tienen en cuenta la arquitectura del sistema consideran la arquitectura de software, pero desde diferentes perspectivas y a diferentes niveles de detalle:

  - **Arquitectura Computacional:**
     - Si bien la arquitectura computacional se centra principalmente en el diseño y la estructura de los componentes físicos de una computadora, también influye en el desarrollo de software. Cosas como el conjunto de instrucciones de la CPU y la organización de la memoria afectan directamente en el cómo se desarrollan y ejecutan los programas.
     - Los diseñadores de arquitectura computacional deben tener en cuenta los requisitos de rendimiento, la eficiencia energética y otros aspectos que impactarán directamente en la ejecución del software. Además, deben proporcionar las interfaces y la funcionalidad necesaria para que el software pueda interactuar **eficientemente** con el hardware.

  - **Arquitectura del Sistema:**
     - La arquitectura del sistema abarca tanto hardware como software de un sistema. Por lo tanto, si se considera la arquitectura de software de manera más directa que la arquitectura computacional.
     - La arquitectura del sistema se preocupa por la integración de los diferentes componentes de software con el hardware subyacente, la comunicación entre ellos y la gestión de recursos compartidos. Esto implica decisiones de diseño relacionadas con la interfaz entre el software y el hardware, la escalabilidad del sistema, la tolerancia a fallos, entre otros aspectos.
