public class Casilla {
    private int fila;
    private int columna;
    private String alias;
    private String estado;

    public boolean getOculto() {
        return oculto;
    }

    public void setOculto(boolean oculto) {
        this.oculto = oculto;
    }

    public boolean isDisparo() {
        return disparo;
    }

    public boolean oculto=false;
    public boolean disparo = false;

    public Casilla() {

    }
    public Casilla(int fila, int columna, String alias, String estado) {
        this.fila = fila;
        this.columna = columna;
        this.alias = alias;
        this.estado = estado;
    }

    public boolean getTetramino() {
        return Tetramino;
    }

    public void setTetramino(boolean tetramino) {
        Tetramino = tetramino;
    }

    private boolean Tetramino=false;

    public boolean getDisparo() {
        return disparo;
    }

    public void setDisparo(boolean disparo) {
        this.disparo = disparo;
    }


    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }


    public String getEstado() {
            if (Tetramino == false & disparo == true) {
                return "\uD83D\uDCA6";
            } else if (Tetramino == true & disparo == true) {
                return "❌";}
            else if ((Tetramino == true & disparo == false & oculto == false))
            { return "\uD83D\uDFEB";


            } else return "\uD83D\uDD35";

        }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
