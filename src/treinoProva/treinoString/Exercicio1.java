package treinoProva.treinoString;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = "Pedro Henrique Folster";

        System.out.println("A sua string tem " + contarCaracteres(name) + " caracteres!");

    }

    public static int contarCaracteres(String name) {
        return name.length();
    }
}
