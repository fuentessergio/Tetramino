public class Tablero {

    private Casilla[][] tableroBarcos;
    private Casilla[][] tableroDisparos;
    private int filas;
    private int columnas;

    public Casilla[][] getTableroDisparos() {
        return tableroDisparos;
    }

    public void setTableroDisparos(Casilla[][] tableroDisparos) {
        this.tableroDisparos = tableroDisparos;
    }

    public Tablero(Casilla[][] matriz, int filas, int columnas) {
        this.tableroBarcos = matriz;
        this.filas = filas;
        this.columnas = columnas;
    }
    public Casilla[][] getTableroBarcos() {
        return tableroBarcos;
    }

    public void setTableroBarcos(Casilla[][] tableroBarcos) {
        this.tableroBarcos = tableroBarcos;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }


    public Tablero() {
        tableroBarcos = new Casilla[10][10];
        tableroDisparos = new Casilla[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tableroBarcos[i][j] = new Casilla();
                tableroBarcos[i][j].setColumna(j);
                tableroBarcos[i][j].setFila(i);


                tableroDisparos[i][j] = new Casilla();
                tableroDisparos[i][j].setColumna(j);
                tableroDisparos[i][j].setFila(i);

            }
        }
    }

    public void imprimirTableroDisparos() {
        System.out.println("Disparos");
        System.out.println("\"   A  B  C   D  E  F  G   H  I  J\"");

        for (int i = 0; i < tableroDisparos.length; i++) {
            for (int j = 0; j < tableroDisparos.length; j++) {

                tableroDisparos[i][j].setOculto(true);


            }
        }
        for (int i = 0; i < tableroDisparos.length; i++) {
            System.out.print((i) + "  ");
            for (int j = 0; j < tableroDisparos.length; j++) {
                tableroDisparos[i][j].setOculto(true);
                System.out.print(tableroDisparos[i][j].getEstado() + " ");

            }
            System.out.println();
        }
    }
    public void imprimirTableroBarcos(){
        System.out.println("Barcos");
        System.out.println("   A  B  C   D  E  F  G   H  I  J");
        for (int i = 0; i < tableroDisparos.length; i++) {
            for (int j = 0; j < tableroDisparos.length; j++) {

                tableroDisparos[i][j].setOculto(false);


            }
        }
        for (int i = 0; i < tableroBarcos.length; i++) {
            System.out.print((i) + "  ");
            for (int j = 0; j < tableroBarcos.length; j++) {
                System.out.print(tableroBarcos[i][j].getEstado() + " ");

            }
            System.out.println();
        }
    }
    public void inicializarBarcos(Tetramino barco){
        tableroBarcos[barco.getX1()][barco.getY1()].setTetramino(true);
        tableroBarcos[barco.getX2()][barco.getY2()].setTetramino(true);
        tableroBarcos[barco.getX3()][barco.getY3()].setTetramino(true);
        tableroBarcos[barco.getX4()][barco.getY4()].setTetramino(true);



    }
}
