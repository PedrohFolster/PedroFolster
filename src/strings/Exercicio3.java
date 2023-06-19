package strings;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String texto;

        System.out.print("Informe um texto para obter a quantidade de palarvas: ");
        texto = scan.nextLine();

        System.out.println();
        System.out.println("A quantidade de palavras contidas no texto é de: " + palavrasContidas(texto));
    }

    public static int palavrasContidas(String texto) {

        if (texto == null || texto.length() == 0) {
            return 0;
        }

        String[] palavras = texto.trim().split(" ");
        return palavras.length;
    }
}
