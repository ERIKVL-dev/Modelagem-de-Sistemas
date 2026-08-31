package atividade;

public class Televisao {
    private boolean ligada;
    private int volume;
    private int canal;

    public Televisao() {
        this.ligada = false;
        this.volume = 10;
        this.canal = 1;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
}
