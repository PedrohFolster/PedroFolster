package treinoProva;

import java.util.Scanner;

public class ColarFaculdade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] notas = new double[3];
        double totalNotas = 0;
        int escolha;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe sua " + (i + 1) + "° nota: ");
            notas[i] = scan.nextDouble();

            totalNotas += notas[i];
        }

        System.out.println();
        System.out.println("Agora escolha qual das opções abaixo você deseja obter: \n" +
                "1 - Média Aritmética\n" +
                "2 - Média Ponderada");

        escolha = scan.nextInt();
        System.out.println();

        if (escolha == 1) {
            System.out.println("Sua média aritmética é: " + mediaAritmetica(notas));
        } else if (escolha == 2) {
            System.out.println("Sua média ponderada é: " + mediaPonderada(notas));
        } else {
            System.out.println("Erro! Digite um valor válido!");
        }
    }

    public static double mediaPonderada(double[] notas) {
        double nota1 = notas[0];
        double nota2 = notas[1];
        double nota3 = notas[2];

        return (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10;
    }

    public static double mediaAritmetica(double[] notas) {
        double totalNotas = 0;
        for (double nota : notas) {
            totalNotas += nota;
        }

        return totalNotas / notas.length;
    }
}
