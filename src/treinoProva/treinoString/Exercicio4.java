package treinoProva.treinoString;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String numbers = "A234567890";

        boolean contemOutrosCaracteres = false;

        for (int i = 0; i < numbers.length(); i++) {
            char c = numbers.charAt(i);
            if (!Character.isDigit(c)) {
                contemOutrosCaracteres = true;
                break;
            }
        }

        if (contemOutrosCaracteres) {
            System.out.println("A string contém outros caracteres além de dígitos numéricos.");
        } else {
            System.out.println("A string contém apenas dígitos numéricos.");
        }
    }
}
