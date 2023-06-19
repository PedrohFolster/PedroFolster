package strings;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scan.nextLine();

        int comprimento = palavra.length();

        for (int i = 1; i <= comprimento; i++) {
            System.out.println(palavra.substring(0, i));
        }

        for (int i = comprimento - 1; i > 0; i--) {
            System.out.println(palavra.substring(0, i));
        }
    }
}
