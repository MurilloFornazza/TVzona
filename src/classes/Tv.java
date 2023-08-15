package classes;

import java.util.Random;

public class Tv {

    public boolean ligado;
    public double canal, volume;

    public Tv(boolean ligado, double canal, double volume) {
        this.ligado = ligado;
        this.canal = canal;
        this.volume = volume;
    }

    public boolean ligarTv(){
        this.ligado = true;

        return ligado;
    }

    public boolean desligarTv(){
        this.ligado = false;

        return ligado;
    }

    public double mudarVolume(double mudarVolume){
        this.volume = 25;

        volume = volume + mudarVolume;

        return volume;

    }

    public double trocarCanal(double canalTroca){
        this.canal = canalTroca;

        return canal;

    }

}
