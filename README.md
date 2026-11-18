## THE OLD ISLAND

The Old Island es un juego de supervivencia desarrollado en Java y ejecutado en consola. El jugador ha naufragado en una isla y debe conseguir recursos, gestionar sus necesidades básicas, explorar el territorio y construir una balsa para escapar.
Historia

Tras naufragar en una isla desconocida, tu objetivo es sobrevivir y conseguir los materiales necesarios para construir una balsa.

Tendrás que tomar decisiones, administrar tus recursos y tener cuidado con los peligros de la exploración. Cada turno consume comida y agua, por lo que elegir correctamente tus acciones será fundamental para sobrevivir.

## Características

- Sistema de salud y energía.
- Gestión de recursos: comida, agua, madera y cuerda.
- Exploración con eventos aleatorios.
- Recolección de comida y agua.
- Sistema de descanso y recuperación de energía.
- Construcción de una balsa como objetivo final.
- Menú interactivo por consola.
- Colores ANSI para mejorar la experiencia visual.

## Acciones disponibles

1-  Buscar comida: consigue entre 1 y 10 unidades de comida a cambio de energía.
2-  Buscar agua: consigue entre 1 y 10 unidades de agua a cambio de energía.
3-  Explorar la isla: puedes encontrar madera, cuerda o sufrir daño.
4-  Descansar: recupera 30 puntos de energía, hasta un máximo de 100.
5-  Construir una balsa: utiliza los materiales necesarios para escapar de la isla.
6-  Salir del juego: abandona la partida.

## Recursos iniciales

Al comenzar la partida dispones de:

Salud: 100 puntos.

Energía: 100 puntos.

Comida: 5 unidades.

Agua: 5 unidades.

Madera: 0 unidades.

Cuerda: 0 unidades.

## Objetivo

Tu objetivo principal es construir una balsa y escapar de la isla.

Para conseguirlo, tendrás que reunir:

4 unidades de madera.

2 unidades de cuerda.

Explora, consigue recursos y administra tus necesidades básicas para alcanzar la libertad.
Sistema de supervivencia

Al finalizar cada turno:

Se consume 1 unidad de comida.
Se consume 1 unidad de agua.
Si no tienes comida, pierdes 26 puntos de salud.
Si no tienes agua, pierdes 26 puntos de salud.

Si tu salud llega a 0, la partida termina y no habrás conseguido sobrevivir a la isla.

## Tecnologías utilizadas

Java — Lenguaje de programación.

Scanner — Lectura de datos introducidos por el jugador.

Random — Generación de eventos y recursos aleatorios.

Códigos ANSI — Colores y estilos visuales en la consola.

## Cómo ejecutar el juego

Clona el repositorio:

git clone https://github.com/JoanBernal22/The-Old-Island

Entra en la carpeta del proyecto y compila el archivo:

javac Oldisland.java

Ejecuta el juego:

java Oldisland

Se recomienda utilizar una terminal compatible con códigos ANSI para visualizar correctamente los colores.

## Estado del proyecto

Versión inicial funcional.
