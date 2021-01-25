# Simulador-Reproductor
El siguiente proyecto implementa una interfaz que contiene tres (3) elementos independientes. Un reloj fijo que actualiza su hora por segundo, un cronometro que al iniciarse (start) comienza a incrementar en números enteros y con una frecuencia de a segundo y un simulador de reproductor de música con acciones de play, pause y stop, el cual reproduce la playlist adjuntada en el proyecto.

La interfaz posee las siguientes elementos:

    •	Reloj fijo con la hora local (Argentina en este caso).

    •	Un cronometro con acciones de star, puase y reset.

    •	Simulador de Reporductor con acciones de play, pause y stop.

Se posee una clase llamada “HoraRunnable” la cual implementa la interfaz “Runnable” y se encarga de fijar la hora local (Argentina, en este caso) y actualizar la misma por segundo, haciendo uso del formato de hora, minutos y segundos aplicando la clase “DecimalFormat”.

Una segunda clase llamada “CronometroRunnable” la cual implementa la interfaz “Runnable” y se encarga a partir de un bucle “while” de sumar +1 con una frecuencia de a segundo (“Thread.sleep(1000)”) y actualizar el cronometro en la interfaz usando un formato de cuatro (4) dígitos.  A su vez posee los métodos comenzar, pausar y resetear (setea el valor cero (0) al contador) que condicionan el bucle.

La clase llamada “ReproductorRunnable” implementa la interfaz “Runnable” que a partir del Drive “JLayer” (Dependecia del POM) se aplican sus métodos haciendo uso de un “InputStream” con la ruta de la playlist a reproducir. Todo esto dentro el método “run” del “Thread”.

Por último, en la interfaz se encuentra el resto de la lógica que invoca los métodos de las clases pertinentes a excepción de los métodos deprecados “resume()”, “suspend()” y “stop()” los cuales complementan la lógica de  la clase “ReproductorRunnable” con el justificativo de que para este caso son funcionales.

Heryk Rangel
