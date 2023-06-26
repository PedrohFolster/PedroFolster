package treinoProva.pratica.procedimentos;

import java.util.Scanner;

public class teste1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String frase, palavraBuscar;
        int counter = 0;

        System.out.print("Informe uma frase: ");
        frase = scan.nextLine();

        System.out.print("Informe uma palavra para buscar e verificar se a mesma está no texto: ");
        palavraBuscar = scan.nextLine();

        String [] palavras = frase.split(" ");

        for (String palavra : palavras) {
            if (palavra.equals(palavraBuscar)) {
                counter++;
            }
        }
        System.out.println();
        System.out.println("A palavra aparece " + counter + " vezes na frase!");
    }
}
