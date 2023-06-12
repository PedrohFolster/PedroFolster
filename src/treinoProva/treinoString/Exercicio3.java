package treinoProva.treinoString;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = "Pedro Henrique Folster dos Santos";
        int counter = 0;

        String str = name.toLowerCase();

        for (int i = 0; i < name.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                counter++;
            }
        }

        System.out.println("Na sua string, você tem " + counter + " vogais.");
    }
}
