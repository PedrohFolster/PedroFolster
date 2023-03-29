package exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o modelo do carro: ");
        String modelo = scan.nextLine();

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scan.nextDouble();

        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;

        double custoFinal = custoFabrica + (custoFabrica * percentualDistribuidor) + (custoFabrica * percentualImpostos);

        System.out.println("O modelo do carro é: " + modelo);
        System.out.println("O custo final do carro para o consumidor é: " + custoFinal);
    }
}