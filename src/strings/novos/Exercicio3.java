package strings.novos;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String texto;

        System.out.print("Informe um texto para verificar quantas palavras tem: ");
        texto = scan.nextLine();

        System.out.println("O texto tem: " + palavrasTexto(texto) + " palavras!");
    }

    public static int palavrasTexto(String texto) {
        texto.replace(".", " ");

        String [] palavras = texto.split(" ");

        return palavras.length;
    }
}
