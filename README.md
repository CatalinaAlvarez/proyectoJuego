# proyectoJuego
Este proyecto permite la presentación de un juego de preguntas. Al ejecutarlo, la persona debe registrar sus datos: nombre, apellido y documento. 
Posteriormente será presentada la primera pregunta, la cual es aleatoria dentro de la categoría/nivel 1, que cuenta con 5 preguntas dentro de ella. 
Después de responder la pregunta, si es incorrecta terminará el juego, si es correcta podrá elegir si continuar o retirarse con el dinero que tiene hasta el momento. 
El juego cuenta con 5 niveles y 5 preguntas. Cuando completa 5 preguntas correctas, el juego termina y muestra el acumulado. 

Este proyecto fue creado con Netbeans y puede abrirse con este mismo programa. Los datos de los participantes están alojados en el archivo txt guardarDatos.txt.
Este archivo txt aloja documento, nombre, apellido, nivel alcanzado o categoría y premio ganado. 
Es necesario que para correr el programa se ingrese el documento para que el programa corra. 

Actualización para SOFKA 26/09/21 1:55 pm: El proyecto actualmente ante una salida forzada (por perdida), retorna el acumulado del premio, sin embargo, esta función no debería retornar de tal manera. Teniendo en cuenta el deadline del proyecto, me abstengo de la modificación del proyectoJuego que fue subido el 25/09/21 alrededor de las 11pm. Realizo dicha aclaración unicamente en el README como reconocimiento del error y brindando la solución de este. 
Para el cambio debe ser agregado:

en la línea 174 se debe cambiar la linea por: premioJugador.setPremio(0);
Se debe agregar una nueva línea posterior a ello, en la linea 175 y colocar: final1.campoAcumulado.setText("0");

Con dichas modificaciones el programa correría con los requerimentos pertinentes.  
