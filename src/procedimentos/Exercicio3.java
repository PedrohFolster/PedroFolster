package procedimentos;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        double[] notas = new double[3];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = scan.nextDouble();
        }

        System.out.print("Informe o tipo de cálculo (1 - Média Aritmética, 2 - Média Ponderada): ");
        int tipoCalculo = scan.nextInt();

        if (tipoCalculo == 1) {
            calcularMediaAritmetica(notas);
        } else if (tipoCalculo == 2) {
            calcularMediaPonderada(notas);
        } else {
            System.out.println("Tipo de cálculo inválido. Escolha 1 para Média Aritmética ou 2 para Média Ponderada.");
        }
    }

    public static void calcularMediaAritmetica(double[] notas) {
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;
        System.out.println("Média Aritmética: " + media);
    }

    public static void calcularMediaPonderada(double[] notas) {
        if (notas.length != 3) {
            System.out.println("É necessário ter exatamente 3 notas para o cálculo da Média Ponderada.");
            return;
        }

        double somaPonderada = (notas[0] * 5) + (notas[1] * 3) + (notas[2] * 2);
        double pesoTotal = 5 + 3 + 2;
        double media = somaPonderada / pesoTotal;

        System.out.println("Média Ponderada: " + media);
    }
}
