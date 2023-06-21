package strings.novos;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String palavra;

        System.out.print("Informe uma palvra: ");
        palavra = scan.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.substring(0, i));
        }

        for (int i = palavra.length(); i > 0; i--) {
            System.out.println(palavra.substring(0, i));
        }
    }
}
