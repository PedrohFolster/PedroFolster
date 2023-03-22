package exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scan.nextInt();

        System.out.print("Digite o número de votos brancos: ");
        int votosBrancos = scan.nextInt();

        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = scan.nextInt();

        System.out.print("Digite o número de votos válidos: ");
        int votosValidos = scan.nextInt();

        double percentualBrancos = (double) votosBrancos / totalEleitores * 100;
        double percentualNulos = (double) votosNulos / totalEleitores * 100;
        double percentualValidos = (double) votosValidos / totalEleitores * 100;

        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");

    }
}