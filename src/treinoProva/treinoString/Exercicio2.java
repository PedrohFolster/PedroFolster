package treinoProva.treinoString;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = "Pedro Henrique Folster";

        System.out.println("Sua string na forma inversa é: " + inverterString(name));

    }

    public static String inverterString(String name) {
        StringBuilder sb = new StringBuilder(name);
        return sb.reverse().toString();
    }
}
