package strings.novos;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String palavra;

        System.out.print("Informe uma palavra para obter a mesma na forma inversa: ");
        palavra = scan.nextLine();

        System.out.println("Sua palavra na forma inversa foi: " + palavraInversa(palavra));

    }

    public static String palavraInversa(String palavra) {
        StringBuilder sb = new StringBuilder(palavra);

        return sb.reverse().toString();
    }
}
