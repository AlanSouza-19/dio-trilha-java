package edu.alan.morfologiaclasses;

public class MinhaClasse {
    public static void main(String[] args) {
        String nome = "Alan";
        String sobrenome = "Correa";

        System.out.println(NomeCompleto(nome, sobrenome));
    }

    public static String NomeCompleto (String primeiroNome, String segundoNome) {
        return "O nome completo é " + primeiroNome + " " + segundoNome;
    }
}
