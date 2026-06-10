# Práctica 3: Ejercicios de lógica con estructuras lineales: pilas y colas

**Nombre:** Xavier Aucay
**Fecha de entrega** 10/6/2026

## Descripción general del proyecto
Este proyecto resuelve tres problemas de algoritmos usando estructuras lineales dinamicas. Se implemento una validación de parentesis balanceados, y un ordenamiento interno de pilas y una verificación de palíndromos.

---

## Explicación de los Ejercicios

### Ejercicio 01: Validación de signos usando Stack
El algoritmo recorre la cadena caracter por caracter. Cada vez que detecta un simbolo apertura:  ((, [, {) se apila (push) en un Stack su contraparte de cierre correspondiente. Y cuando se encuentra un símbolo de cierre en la cadena, se extrae el elemento superior de la pila (pop) y verifica si coinciden de forma identica. Si la pila se vacía antes de tiempo o los caracteres no corresponden, la expresion no esta balanceada.
### Ejercicio 02: Ordenamiento de un Stack usando únicamente Stacks adicionales
Se emplea un Stack auxiliar (auxStack) ademas se extraen los elementos de la pila original uno a uno. Si el elemento extraído es menor que el que se encuentra en el tope de auxStack los elementos mayores de auxStack se regresan temporalmente a la pila original para abrir espacio. Una vez ubicado el elemento en su posición correcta en auxStack, el proceso se repite

### Ejercicio 03: Validación de palíndromo usando Queue
Se simula el comportamiento FIFO de una cola utilizando exclusivamente dos estructuras Stack. Al traspasar los elementos de una primera pila a una segunda, el orden del flujo de caracteres se invierte, como una cola, esto permite extraer la primera letra y la última letra, hasta determinar si la palabra es un palíndromo.

---

## Captura o bloque de código de cada ejercicio
![alt text](<assets/Captura de pantalla 2026-06-10 153037.png>)
![alt text](<assets/Captura de pantalla 2026-06-10 153742.png>)
![alt text](<assets/Captura de pantalla 2026-06-10 153804.png>)
![alt text](<assets/Captura de pantalla 2026-06-10 154508.png>)
