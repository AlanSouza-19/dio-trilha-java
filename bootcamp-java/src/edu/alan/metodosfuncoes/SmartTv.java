package edu.alan.metodosfuncoes;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligarTv(){
        ligada = true;
    }

    public void desligarTv(){
        ligada = false;
    }

    public void aumentatVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void mudarCanal(int numCanal){
        canal = numCanal;
    }
}
