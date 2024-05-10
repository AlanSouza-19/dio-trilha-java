package edu.alan.metodosfuncoes;

public class App {
    public static void main(String[] args) {
        SmartTv minhaTv = new SmartTv();

        minhaTv.ligarTv();
        System.out.println("A tv está " + (minhaTv.ligada ? "ligada" : "desligada"));
        System.out.println("O canal atual é " + minhaTv.canal);
        System.out.println("O volume atual é " + minhaTv.volume);
    }
}
