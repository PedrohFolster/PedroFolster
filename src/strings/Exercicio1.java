package strings;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String palavra;

        System.out.print("Informe uma palavra para obter a mesma na forma inversa: ");
        palavra = scan.nextLine();

        System.out.println("A sua string de forma inversa é: " + stringInversa(palavra));

    }

    private static String stringInversa(String palavra) {
        StringBuilder sb = new StringBuilder(palavra);
        return sb.reverse().toString();
    }
}
