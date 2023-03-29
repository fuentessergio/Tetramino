
import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Math.random;


public class Juego {

    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    static  Scanner teclado = new Scanner (System.in);

    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        Tablero tablero1 = new Tablero();
        Tablero tablero2 = new Tablero();

        Tetramino barco = new Tetramino("Cuadrado");
        Tetramino barco1 = new Tetramino("Recta");
        Tetramino barco2 = new Tetramino("Ele");
        Tetramino barco3 = new Tetramino("T");
        Tetramino barco4 = new Tetramino("Z");

        Tetramino barcoP2 = new Tetramino("Cuadrado");
        Tetramino barco2P2 = new Tetramino("Recta");
        Tetramino barco3P2 = new Tetramino("Ele");
        Tetramino barco4P2 = new Tetramino("T");
        Tetramino barco5P2 = new Tetramino("Z");

        Tetramino[] barcosP1 = {barco, barco1, barco2, barco3, barco4};
        Tetramino[] barcosP2 = {barcoP2, barco2P2, barco5P2, barco3P2, barco4P2};

        tablero1.setTableroDisparos(tablero2.getTableroBarcos());
        tablero2.setTableroDisparos(tablero1.getTableroBarcos());
        jugador1.setTablero1(tablero1);
        jugador2.setTablero1(tablero2);

        jugador1.setBarcos(barcosP1);
        jugador1.colocarAleatorio(barco, barco1, barco2, barco3, barco4);
        tablero1.inicializarBarcos(barco);
        tablero1.inicializarBarcos(barco1);
        tablero1.inicializarBarcos(barco2);
        tablero1.inicializarBarcos(barco3);
        tablero1.inicializarBarcos(barco4);



        jugador2.setBarcos(barcosP2);
        jugador1.colocarAleatorio(barcoP2, barco2P2, barco3P2, barco4P2, barco5P2);
        tablero2.inicializarBarcos(barcoP2);
        tablero2.inicializarBarcos(barco2P2);
        tablero2.inicializarBarcos(barco3P2);
        tablero2.inicializarBarcos(barco4P2);
        tablero2.inicializarBarcos(barco5P2);

        tablero1.setTableroDisparos(tablero2.getTableroBarcos());
        tablero2.setTableroDisparos(tablero1.getTableroBarcos());


        System.out.println("Bienvenido, seleccione una opción:");
        System.out.println("1- 1 jugador (PvIA)");
        System.out.println("2- 2 jugadores (PvP)");
        System.out.println("3- Salir");
        String opcion = teclado.nextLine();


        switch (opcion) {


            case "1":

                System.out.println("Introduzca su nombre para jugar");
                jugador1.setNombre(teclado.nextLine());


                do {
                    int i = 0, j=0;
                    String columna;
                    System.out.println(jugador1.getNombre() + " ¿a qué columna desea disparar?");
                    boolean columnaValida = false;
                    while (!columnaValida) {
                        columna = Juego.teclado.nextLine().toUpperCase();

                        if (columna.equals("A")) {
                            i = 0;
                            columnaValida = true;
                        } else if (columna.equals("B")) {
                            i = 1;
                            columnaValida = true;
                        } else if (columna.equals("C")) {
                            i = 2;
                            columnaValida = true;
                        } else if (columna.equals("D")) {
                            i = 3;
                            columnaValida = true;
                        } else if (columna.equals("E")) {
                            i = 4;
                            columnaValida = true;
                        } else if (columna.equals("F")) {
                            i = 5;
                            columnaValida = true;
                        } else if (columna.equals("G")) {
                            i = 6;
                            columnaValida = true;
                        } else if (columna.equals("H")) {
                            i = 7;
                            columnaValida = true;
                        } else if (columna.equals("I")) {
                            i = 8;
                            columnaValida = true;
                        } else if (columna.equals("J")) {
                            i = 9;
                            columnaValida = true;
                        } else {
                            System.out.println("No es una columna válida, introduzca una valida (A-J)");
                        }
                    }
                    System.out.println("¿Y a qué fila?");
                    boolean filaValida = false;
                    while (!filaValida) {
                        j = Juego.teclado.nextInt();
                        Juego.teclado.nextLine();

                        if (j >= 0 && j <= 9) {
                            filaValida = true;
                        } else {
                            System.out.println("No es una fila válida, introduzca una valida (0-9)");
                        }
                    }
                    jugador2.recibirDisparo(j, i);
                    jugador1.recibirDisparo((int) (Math.random() * 10), (int) (Math.random() * 10));
                    jugador1.getTablero1().imprimirTableroDisparos();
                    jugador1.getTablero1().imprimirTableroBarcos();
                    System.out.println(jugador2.getBarcosNoHundidos());
                } while (jugador1.getBarcosNoHundidos() > 0 && jugador2.getBarcosNoHundidos() > 0);


                if (jugador1.getBarcosNoHundidos() > 0)
                    System.out.println("Enhorabuena " + jugador1.getNombre() + ", has ganado!");
                if (jugador2.getBarcosNoHundidos() > 0) System.out.println("Ganó la IA... ¡Más suerte la próxima!");
                break;

                case "2":
                System.out.println("Jugador 1, introduzca su nombre porfavor");
                jugador1.setNombre(teclado.nextLine());
                System.out.println("Jugador 2, introduzca su nombre porfavor");
                jugador2.setNombre(teclado.nextLine());


                    do {
                        int i = 0, j= 0;
                        String columna;

                        jugador1.getTablero1().imprimirTableroDisparos();
                        jugador1.getTablero1().imprimirTableroBarcos();

                        System.out.println(jugador1.getNombre() + " ¿a qué columna desea disparar?");
                        boolean columnaValida = false;
                        while (!columnaValida) {
                        columna = Juego.teclado.nextLine().toUpperCase();

                            if (columna.equals("A")) {
                                i = 0;
                                columnaValida = true;
                            } else if (columna.equals("B")) {
                                i = 1;
                                columnaValida = true;
                            } else if (columna.equals("C")) {
                                i = 2;
                                columnaValida = true;
                            } else if (columna.equals("D")) {
                                i = 3;
                                columnaValida = true;
                            } else if (columna.equals("E")) {
                                i = 4;
                                columnaValida = true;
                            } else if (columna.equals("F")) {
                                i = 5;
                                columnaValida = true;
                            } else if (columna.equals("G")) {
                                i = 6;
                                columnaValida = true;
                            } else if (columna.equals("H")) {
                                i = 7;
                                columnaValida = true;
                            } else if (columna.equals("I")) {
                                i = 8;
                                columnaValida = true;
                            } else if (columna.equals("J")) {
                                i = 9;
                                columnaValida = true;
                            } else {
                                System.out.println("No es una columna válida, Introduzca una valida (A-J)");
                            }
                        }
                        System.out.println("¿Y a qué fila?");
                        boolean filaValida = false;
                        while (!filaValida) {
                            j = Juego.teclado.nextInt();
                            Juego.teclado.nextLine();

                            if (j >= 0 && j <= 9) {
                                filaValida = true;
                            } else {
                                System.out.println("No es una fila válida, introduzca una valida (0-9)");
                            }
                        }
                        if (j < -1 || j > 9) {
                            System.out.println("No es una fila válida");
                        }
                        jugador2.recibirDisparo(j, i);

                        limpiarPantalla();

                        System.out.println("Su turno ha acabado, por favor " + jugador1.getNombre() + " cedale la pantalla a " + jugador2.getNombre());
                        String eleccion = "";
                        System.out.println(jugador2.getNombre() + ", pulse 1 para continuar o 2 para rendirse y salir");
                        while (!eleccion.equals("1") && !eleccion.equals("2")) {
                            eleccion = teclado.nextLine();
                            if (!eleccion.equals("1") && !eleccion.equals("2")) {
                                System.out.println("No es una opción válida, por favor pulse 1 (continuar) o 2 (salir)");
                            }
                        }
                        if (eleccion.equals("2")) {
                            System.out.println(jugador2.getNombre()+ " se rindió!");
                            System.out.println("¡Enhorabuena " + jugador1.getNombre() + "!");
                            break;}
                        eleccion="";


                        jugador2.getTablero1().imprimirTableroDisparos();
                        jugador2.getTablero1().imprimirTableroBarcos();

                        System.out.println(jugador2.getNombre() + " ¿a qué columna desea disparar?");
                        columnaValida = false;
                        while (!columnaValida) {
                            columna = Juego.teclado.nextLine().toUpperCase();

                            if (columna.equals("A")) {
                                i = 0;
                                columnaValida = true;
                            } else if (columna.equals("B")) {
                                i = 1;
                                columnaValida = true;
                            } else if (columna.equals("C")) {
                                i = 2;
                                columnaValida = true;
                            } else if (columna.equals("D")) {
                                i = 3;
                                columnaValida = true;
                            } else if (columna.equals("E")) {
                                i = 4;
                                columnaValida = true;
                            } else if (columna.equals("F")) {
                                i = 5;
                                columnaValida = true;
                            } else if (columna.equals("G")) {
                                i = 6;
                                columnaValida = true;
                            } else if (columna.equals("H")) {
                                i = 7;
                                columnaValida = true;
                            } else if (columna.equals("I")) {
                                i = 8;
                                columnaValida = true;
                            } else if (columna.equals("J")) {
                                i = 9;
                                columnaValida = true;
                            } else {
                                System.out.println("No es una columna válida, Introduzca una valida (A-J)");
                            }
                        }
                        System.out.println("¿Y a qué fila?");
                        filaValida = false;
                        while (!filaValida) {
                            j = Juego.teclado.nextInt();
                            Juego.teclado.nextLine();

                            if (j >= 0 && j <= 9) {
                                filaValida = true;
                            } else {
                                System.out.println("No es una fila válida, introduzca una valida (0-9)");
                            }
                        }
                        if (j < -1 || j > 9) {
                            System.out.println("No es una fila válida");
                        }
                        jugador1.recibirDisparo(j, i);
                        limpiarPantalla();

                        System.out.println("Su turno ha acabado, por favor " + jugador2.getNombre() + " cedale la pantalla a " + jugador1.getNombre());
                        System.out.println(jugador1.getNombre() + ", pulse 1 para continuar o 2 para rendirse y salir");
                        while (!eleccion.equals("1") && !eleccion.equals("2")) {
                            eleccion = teclado.nextLine();
                            if (!eleccion.equals("1") && !eleccion.equals("2")) {
                                System.out.println("No es una opción válida, por favor pulse 1 (continuar) o 2 (salir)");
                            }
                        }
                        if (eleccion.equals("2")) {
                            System.out.println(jugador1.getNombre()+ " se rindió!");
                            System.out.println("¡Enhorabuena " + jugador2.getNombre() + "!");
                            break;}

                    } while (jugador1.getBarcosNoHundidos() > 0 && jugador2.getBarcosNoHundidos() > 0);


                    if (jugador1.getBarcosNoHundidos() == 0)
                        System.out.println("Enhorabuena " + jugador1.getNombre() + ", has ganado!");
                    if (jugador2.getBarcosNoHundidos() == 0) System.out.println("Enhorabuena " + jugador2.getNombre() + ", has ganado!");
                    break;

            case "3":
                System.out.println("¡Adiós!");
                break;
        }
    }
}