Programaci�n 
1�DAM
README.
Autores, Pedro Ba�eres y Sergio Fuentes.
La version de JAVA utilizada es java version "19.0.1" 2022-10-18.
Se ha realizado el programa en Intellij Idea Community Edition 2022.2.3.
El programa trata de un juego que combina los elementos de 'Hundir La Flota' y del 'Tetrix', donde los barcos que tenemos que hundir son figuras del tetrix. Tenemos 2 tableros uno de barcos (jugador) y otro de disparos, est�n conectados con los tableros de la maquina ya que tu tablero disparos es el tablero barcos de la IA.
Los tableros est�n formados por casillas las cuales nos permiten indicar el estado de �stas, es decir, si una casilla esta ocupada por un tetramino, si al disparar en ella hay agua o si el tetramino ha sido disparado.
No hemos conseguido colocar los tetraminos manualmente por teclado, hemos utlizado coordenadas para los tetraminos y asi poder conseguir que �stos se coloquen en el tablero. La soluci�n ha sido colocar los barcos, dando diferentes opciones y generar un numero aleatorio que escoja una de las opciones cosiguiendo que los barcos no se coloquen en la misma posici�n en cada partida y se produzca variedad.
Los tetraminos tienen vida, por lo que si recibem un disparo se le restara uno a la vida siendo la de �stos de 4. Cuando un tetramino llega su vida a 0, se le resta un barco al jugador correspondiente. Y el rival esta m�s cerca de ganar.
La partida termina cuando uno de los 2 jugadores se queda sin barcos, el resultado es un ganador. En nuestro caso hay 2 opciones la opci�n de jugar contra la IA o la opcion de jugar contra otro jugador.