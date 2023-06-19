package strings;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String palavra, termoInicial, termoFinal;

        System.out.print("Informe uma palavra: ");
        palavra = scan.nextLine();

        System.out.print("Digite um termo para verificar se a palavra COMEÇA com este termo: ");
        termoInicial = scan.nextLine();

        System.out.print("Digite um termo para verificar se a palavra TERMINA com este termo: ");
        termoFinal = scan.nextLine();

        System.out.println();

        System.out.println("A palavra contém: " + contarCaracteres(palavra) + " caracteres");
        System.out.println("A palavra com todas as letras em maiúsculo: " + apresentarUpperCase(palavra));
        System.out.println("Número de vogais da palavra: " + contarVogais(palavra));

        TermoInicial(palavra, termoInicial);
        TermoFinal(palavra, termoFinal);

    }

    private static void TermoFinal(String palavra, String termoFinal) {
        if (palavra.endsWith(termoFinal)) {
            System.out.println("A palavra termina com o termo informado!");
        } else {
            System.out.println("A palavra não termina com o termo informado!");
        }
    }

    private static void TermoInicial(String palavra, String termoInicial) {
        if (palavra.startsWith(termoInicial)) {
            System.out.println("A palavra começa com o termo informado!");
        } else {
            System.out.println("A palavra não começa com o termo informado!");
        }
    }

    private static String apresentarUpperCase(String palavra) {
        return palavra.toUpperCase();
    }

    private static int contarCaracteres(String palavra) {
        return palavra.length();
    }

    public static int contarVogais(String palavra) {
        int count = 0;
        palavra = palavra.toLowerCase();
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                count++;
            }
        }
        return count;
    }
}
