package lista_repeticao;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numerosInformados;

        System.out.print("Informe a quantidade de números a serem lidos: ");
        numerosInformados = scan.nextInt();

        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;
        double soma = 0;

        for (int i = 1; i <= numerosInformados; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = scan.nextDouble();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
            soma += numero;
        }

        double media = soma / numerosInformados;

        System.out.println("Maior número lido: " + maior);
        System.out.println("Menor número lido: " + menor);
        System.out.printf("Média dos números lidos: " + media);
    }
}
