package strings.novos;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String frase, palavraquantidade;

        System.out.print("Informe uma frase: ");
        frase = scan.nextLine();

        System.out.print("Informe uma palavra para verificar quantas vezes a mesma aparece na frase: ");
        palavraquantidade = scan.nextLine();

        System.out.println("A frase digitada é: " + frase);
        System.out.println("A palavra buscada é: " + palavraquantidade);

        System.out.println("A " + palavraquantidade + " aparece " + verificarQuantidade(frase, palavraquantidade) + " vezes na frase!");
    }

    public static int verificarQuantidade(String frase, String palavraquantidade) {

        int counter = 0;

        String [] palavras = frase.split(" ");

        for (String palavra : palavras) {
            if (palavra.equals(palavraquantidade)) {
                counter++;
            }
        }
        return counter;
    }
}
