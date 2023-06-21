package strings.novos;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String palavra, termoInicial, termoFinal;

        System.out.print("Informe uma palavra: ");
        palavra = scan.nextLine();

        System.out.print("Informe um termo para verificar se a frase começa com o termo especificado: ");
        termoInicial = scan.nextLine();

        System.out.print("Informe um termo para verificar se a frase termina com o termo especificado: ");
        termoFinal = scan.nextLine();


        System.out.println();
        System.out.println("A palavra tem " + quantidadeCaracteres(palavra) + " caracteres");
        System.out.println("Todas as letras em maiusculo: " + apresentarMaiusculo(palavra));
        System.out.println("A palavra tem " + contarVogais(palavra) + " vogais.");


        System.out.println();
        isTermoInicial(palavra, termoInicial);
        isTermoFinal(palavra, termoFinal);
    }

    private static void isTermoFinal(String palavra, String termoFinal) {

        if (palavra.endsWith(termoFinal)) {
            System.out.println("Sim, a frase termina com o termo informado!");
        } else {
            System.out.println("Não, a frase não termina com o termo informado!");
        }
    }

    private static void isTermoInicial(String palavra, String termoInicial) {
        if (palavra.startsWith(termoInicial)) {
            System.out.println("Sim, a frase começa com o termo informado!");
        } else {
            System.out.println("Não, a frase não começa com o termo informado!");
        }
    }

    private static int contarVogais(String palavra) {

        int counter = 0;
        palavra.toLowerCase();

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                counter++;
            }
        }
        return counter;
    }

    private static String apresentarMaiusculo(String palavra) {
        return palavra.toUpperCase();
    }

    private static int quantidadeCaracteres(String palavra) {
        return palavra.length();
    }
}
