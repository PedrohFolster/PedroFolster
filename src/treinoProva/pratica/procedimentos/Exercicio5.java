package treinoProva.pratica.procedimentos;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String frase, termoBuscar;
        int counter = 0;

        System.out.print("Informe uma frase: ");
        frase = scan.nextLine();

        System.out.print("Informe um termo para buscar na frase: ");
        termoBuscar = scan.nextLine();

        System.out.println();

        String [] palavras = frase.split(" ");

        for (String palavra : palavras) {
            if (palavra.equals(termoBuscar)) {
                counter++;
            }
        }
        System.out.println("O termo aparece " + counter + " vezes na frase.");
    }
}
