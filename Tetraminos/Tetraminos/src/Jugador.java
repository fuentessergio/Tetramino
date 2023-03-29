public class Jugador {
    private String nombre;
    private Tablero tablero1;
    private Tetramino [] barcos;
    private int barcosNoHundidos = 5;

    public Jugador(String nombre, Tablero tablero1, Tetramino[] barcos, int barcosNoHundidos) {
        this.nombre = nombre;
        this.tablero1 = tablero1;
        this.barcos = barcos;
        this.barcosNoHundidos = barcosNoHundidos;
    }
    public void colocarAleatorio(Tetramino barco, Tetramino barco1, Tetramino barco2, Tetramino barco3, Tetramino barco4){
        int i = (int) (Math.random()*6);

        if (i == 0) {
            barco.setX1(1);
            barco.setX2(2);
            barco.setX3(2);
            barco.setX4(1);
            barco.setY1(1);
            barco.setY2(2);
            barco.setY3(1);
            barco.setY4(2);

            barco1.setX1(5);
            barco1.setX2(5);
            barco1.setX3(5);
            barco1.setX4(5);
            barco1.setY1(1);
            barco1.setY2(2);
            barco1.setY3(3);
            barco1.setY4(4);

            barco2.setX1(9);
            barco2.setX2(9);
            barco2.setX3(9);
            barco2.setX4(8);
            barco2.setY1(5);
            barco2.setY2(6);
            barco2.setY3(7);
            barco2.setY4(7);

            barco3.setX1(3);
            barco3.setX2(3);
            barco3.setX3(3);
            barco3.setX4(2);
            barco3.setY1(8);
            barco3.setY2(9);
            barco3.setY3(7);
            barco3.setY4(8);

            barco4.setX1(2);
            barco4.setX2(2);
            barco4.setX3(1);
            barco4.setX4(1);
            barco4.setY1(4);
            barco4.setY2(5);
            barco4.setY3(5);
            barco4.setY4(6);

        }
        if (i == 1) {


            barco.setX1(3);
            barco.setX2(2);
            barco.setX3(2);
            barco.setX4(3);
            barco.setY1(7);
            barco.setY2(8);
            barco.setY3(7);
            barco.setY4(8);

            barco1.setX1(0);
            barco1.setX2(0);
            barco1.setX3(0);
            barco1.setX4(0);
            barco1.setY1(1);
            barco1.setY2(2);
            barco1.setY3(3);
            barco1.setY4(4);

            barco2.setX1(9);
            barco2.setX2(8);
            barco2.setX3(7);
            barco2.setX4(9);
            barco2.setY1(0);
            barco2.setY2(0);
            barco2.setY3(0);
            barco2.setY4(1);

            barco3.setX1(5);
            barco3.setX2(5);
            barco3.setX3(5);
            barco3.setX4(4);
            barco3.setY1(2);
            barco3.setY2(3);
            barco3.setY3(1);
            barco3.setY4(2);

            barco4.setX1(7);
            barco4.setX2(7);
            barco4.setX3(6);
            barco4.setX4(6);
            barco4.setY1(4);
            barco4.setY2(5);
            barco4.setY3(5);
            barco4.setY4(6);

        }
        if (i == 2) {
            barco.setX1(0);
            barco.setX2(1);
            barco.setX3(1);
            barco.setX4(0);
            barco.setY1(1);
            barco.setY2(2);
            barco.setY3(1);
            barco.setY4(2);

            barco1.setX1(9);
            barco1.setX2(8);
            barco1.setX3(7);
            barco1.setX4(9);
            barco1.setY1(9);
            barco1.setY2(9);
            barco1.setY3(9);
            barco1.setY4(9);

            barco2.setX1(9);
            barco2.setX2(9);
            barco2.setX3(9);
            barco2.setX4(8);
            barco2.setY1(5);
            barco2.setY2(6);
            barco2.setY3(7);
            barco2.setY4(7);

            barco3.setX1(3);
            barco3.setX2(3);
            barco3.setX3(3);
            barco3.setX4(2);
            barco3.setY1(8);
            barco3.setY2(9);
            barco3.setY3(7);
            barco3.setY4(8);

            barco4.setX1(2);
            barco4.setX2(2);
            barco4.setX3(1);
            barco4.setX4(1);
            barco4.setY1(4);
            barco4.setY2(5);
            barco4.setY3(5);
            barco4.setY4(6);
        }
        if (i == 3) {

            barco.setX1(1);
            barco.setX2(2);
            barco.setX3(2);
            barco.setX4(1);
            barco.setY1(1);
            barco.setY2(2);
            barco.setY3(1);
            barco.setY4(2);

            barco1.setX1(0);
            barco1.setX2(0);
            barco1.setX3(0);
            barco1.setX4(0);
            barco1.setY1(4);
            barco1.setY2(5);
            barco1.setY3(6);
            barco1.setY4(7);

            barco2.setX1(9);
            barco2.setX2(9);
            barco2.setX3(9);
            barco2.setX4(8);
            barco2.setY1(5);
            barco2.setY2(6);
            barco2.setY3(7);
            barco2.setY4(7);

            barco3.setX1(3);
            barco3.setX2(3);
            barco3.setX3(3);
            barco3.setX4(2);
            barco3.setY1(8);
            barco3.setY2(9);
            barco3.setY3(7);
            barco3.setY4(8);

            barco4.setX1(4);
            barco4.setX2(5);
            barco4.setX3(5);
            barco4.setX4(6);
            barco4.setY1(2);
            barco4.setY2(2);
            barco4.setY3(1);
            barco4.setY4(1);


        }
        if (i == 4) {

            barco.setX1(5);
            barco.setX2(6);
            barco.setX3(6);
            barco.setX4(5);
            barco.setY1(5);
            barco.setY2(6);
            barco.setY3(5);
            barco.setY4(6);

            barco1.setX1(6);
            barco1.setX2(6);
            barco1.setX3(6);
            barco1.setX4(6);
            barco1.setY1(0);
            barco1.setY2(1);
            barco1.setY3(3);
            barco1.setY4(2);

            barco2.setX1(0);
            barco2.setX2(0);
            barco2.setX3(0);
            barco2.setX4(1);
            barco2.setY1(0);
            barco2.setY2(1);
            barco2.setY3(2);
            barco2.setY4(0);

            barco3.setX1(3);
            barco3.setX2(3);
            barco3.setX3(3);
            barco3.setX4(2);
            barco3.setY1(8);
            barco3.setY2(9);
            barco3.setY3(7);
            barco3.setY4(8);

            barco4.setX1(2);
            barco4.setX2(2);
            barco4.setX3(1);
            barco4.setX4(1);
            barco4.setY1(4);
            barco4.setY2(5);
            barco4.setY3(5);
            barco4.setY4(6);

        }
        if (i == 5) {

            barco.setX1(1);
            barco.setX2(2);
            barco.setX3(2);
            barco.setX4(1);
            barco.setY1(1);
            barco.setY2(2);
            barco.setY3(1);
            barco.setY4(2);

            barco1.setX1(0);
            barco1.setX2(0);
            barco1.setX3(0);
            barco1.setX4(0);
            barco1.setY1(4);
            barco1.setY2(5);
            barco1.setY3(6);
            barco1.setY4(7);

            barco2.setX1(4);
            barco2.setX2(5);
            barco2.setX3(6);
            barco2.setX4(4);
            barco2.setY1(8);
            barco2.setY2(8);
            barco2.setY3(8);
            barco2.setY4(9);

            barco3.setX1(6);
            barco3.setX2(5);
            barco3.setX3(4);
            barco3.setX4(5);
            barco3.setY1(3);
            barco3.setY2(3);
            barco3.setY3(3);
            barco3.setY4(4);

            barco4.setX1(8);
            barco4.setX2(8);
            barco4.setX3(9);
            barco4.setX4(9);
            barco4.setY1(4);
            barco4.setY2(5);
            barco4.setY3(5);
            barco4.setY4(6);

        }
        if (i == 6) {
            barco.setX1(1);
            barco.setX2(2);
            barco.setX3(2);
            barco.setX4(1);
            barco.setY1(1);
            barco.setY2(2);
            barco.setY3(1);
            barco.setY4(2);

            barco1.setX1(5);
            barco1.setX2(5);
            barco1.setX3(5);
            barco1.setX4(5);
            barco1.setY1(1);
            barco1.setY2(2);
            barco1.setY3(3);
            barco1.setY4(4);

            barco2.setX1(9);
            barco2.setX2(9);
            barco2.setX3(9);
            barco2.setX4(8);
            barco2.setY1(5);
            barco2.setY2(6);
            barco2.setY3(7);
            barco2.setY4(7);

            barco3.setX1(3);
            barco3.setX2(3);
            barco3.setX3(3);
            barco3.setX4(2);
            barco3.setY1(8);
            barco3.setY2(9);
            barco3.setY3(7);
            barco3.setY4(8);

            barco4.setX1(2);
            barco4.setX2(2);
            barco4.setX3(1);
            barco4.setX4(1);
            barco4.setY1(4);
            barco4.setY2(5);
            barco4.setY3(5);
            barco4.setY4(6);
        }
    }
    public Jugador() {
this.barcosNoHundidos=5;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tablero getTablero1() {
        return tablero1;
    }

    public void setTablero1(Tablero tablero1) {
        this.tablero1 = tablero1;
    }

    public Tetramino[] getBarcos() {
        return barcos;
    }

    public void setBarcos(Tetramino[] barcos) {
        this.barcos = barcos;
    }

    public int getBarcosNoHundidos() {
        int i= barcosNoHundidos;
        for (int k = 0; k < barcos.length ; k++) {
            if (barcos[k].esHundido() == true){
               i = i - 1;
            }
        }
        return i;
    }

    public void setBarcosNoHundidos(int barcosNoHundidos) {
        this.barcosNoHundidos = barcosNoHundidos;
    }

    public void recibirDisparo(int i, int j) {
        tablero1.getTableroBarcos()[i][j].setDisparo(true);
            for (int k = 0; k < barcos.length; k++) {
                if (barcos[k].getX1() == i && barcos[k].getY1() == j) {
                    barcos[k].tocado();
                } else if (barcos[k].getX2() == i && barcos[k].getY2() == j) {
                    barcos[k].tocado();
                } else if (barcos[k].getX3() == i && barcos[k].getY3() == j) {
                    barcos[k].tocado();
                } else if (barcos[k].getX4() == i && barcos[k].getY4() == j) {
                    barcos[k].tocado();
                }
            }
        }
}


