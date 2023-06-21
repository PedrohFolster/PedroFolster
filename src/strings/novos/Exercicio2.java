package strings.novos;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String texto;

        System.out.print("Informe um texto: ");
        texto = scan.nextLine();

        textoEmLinhas(texto);

    }

    private static void textoEmLinhas(String texto) {

        System.out.println();
        texto.replace(".", " ");

        String [] palavras = texto.split(" ");

        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i]);
        }

    }
}
