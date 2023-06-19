package strings;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String frase, palavra;

        System.out.print("Informe uma frase: ");
        frase = scan.nextLine();

        System.out.print("Agora informe uma palvra para obter a quantidade de vezes que a mesma apareceu na frase: ");
        palavra = scan.nextLine();

        System.out.println("A palavra [" + palavra + "] apareceu " + vezesAparecidas(frase, palavra) + " vezes na frase.");
    }

    private static int vezesAparecidas(String frase, String palavra) {

        int counter = 0;
        int index = frase.indexOf(palavra);

        if (index == 0) {
            return 0;
        }

        while (index != -1) {
            counter++;

            index = frase.indexOf(palavra, index + palavra.length());
        }

        return counter;
    }
}
