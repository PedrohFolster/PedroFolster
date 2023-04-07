package exercicios_condicionais.extras;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valorSaque;

        System.out.println("Insira um valor para realizar o saque!");
        System.out.println("O saque mínimo é de R$10,00 e o saque Máximo é de R$ 1000,00");
        valorSaque = scan.nextInt();

        if (valorSaque >= 10 && valorSaque <= 1000) {
            int quantidadeNotas;

            quantidadeNotas = valorSaque / 100;
            valorSaque = valorSaque % 100;
            if (quantidadeNotas > 0) {
                System.out.println("Você recebeu " + quantidadeNotas + " notas de R$ 100,00.");
            }

            quantidadeNotas = valorSaque / 50;
            valorSaque = valorSaque % 50;
            if (quantidadeNotas > 0) {
                System.out.println("Você recebeu " + quantidadeNotas + " notas de R$ 50,00.");
            }

            quantidadeNotas = valorSaque / 10;
            valorSaque = valorSaque % 10;
            if (quantidadeNotas > 0) {
                System.out.println("Você recebeu " + quantidadeNotas + " notas de R$ 10,00.");
            }

            quantidadeNotas = valorSaque / 5;
            valorSaque = valorSaque % 5;
            if (quantidadeNotas > 0) {
                System.out.println("Você recebeu " + quantidadeNotas + " notas de R$ 5,00.");
            }

            quantidadeNotas = valorSaque / 1;
            if (quantidadeNotas > 0) {
                System.out.println("Você recebeu " + quantidadeNotas + " notas de R$ 1,00.");
            }
        } else {
            System.out.println("Valor inválido para saque!");
        }
    }
}