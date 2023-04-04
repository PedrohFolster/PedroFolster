package exercicios_condicionais;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numeroEscolha;
        int kgMaca;
        int kgMorango;

        System.out.println("Escolha entre as opções abaixo: \n" +
                "1 - Maça\n" +
                "2 - Morango\n" +
                "3 - Ambas as frutas");

        numeroEscolha = scan.nextInt();

        switch (numeroEscolha) {
            case 1: {
                System.out.println("Você escolheu a categoria Maça.\n" +
                        "Quantos quilos de maça você deseja comprar? ");
                kgMaca = scan.nextInt();
                if (kgMaca > 5) {
                    if (kgMaca <= 8) {
                        System.out.println("Você está comprando " + kgMaca + "Kg por isso estará recebendo um desconto.");
                        double precoMacaAcimaDe5Kg = 1.5;
                        double valorTotal = precoMacaAcimaDe5Kg * kgMaca;
                        System.out.println("O valor total da sua compra foi de: " + valorTotal);
                    }
                }
                if (kgMaca <= 5) {
                    System.out.println("Você está comprando " + kgMaca + "Kg para ganhar o desconto, você precisa estar comprando acima de 8Kg para obter um desconto maior.");
                    double precoMacaAbaixoDe5kg = 1.8;
                    double valorTotal = precoMacaAbaixoDe5kg * kgMaca;
                    System.out.println("O valor total da sua compra foi de: " + valorTotal);
                }
                if (kgMaca > 8) {
                    System.out.println("Você está comprando " + kgMaca + "Kg por isso estará recebendo um desconto de 10%.");
                    double precoMacaAcimaDe5Kg = 1.5;
                    double valorTotal = (precoMacaAcimaDe5Kg * kgMaca);
                    double valorDesconto = (precoMacaAcimaDe5Kg * kgMaca) * (0.1);
                    System.out.println("O valor total da sua compra foi de: " + (valorTotal - valorDesconto));
                }
            }
            break;
            case 2: {
                System.out.println("Você escolheu a categoria Morango.\n" +
                        "Quantos quilos de morango você deseja comprar? ");
                kgMorango = scan.nextInt();

                if (kgMorango > 5) {
                    if (kgMorango <= 8) {
                        System.out.println("Você está comprando " + kgMorango + "Kg por isso estará recebendo um desconto.");

                        double precoMorangoAcimaDe5Kg = 2.2;
                        double valorTotalMaiorQue5Kg = precoMorangoAcimaDe5Kg * kgMorango;
                        System.out.println("O valor total da sua compra foi de: " + valorTotalMaiorQue5Kg);
                    }
                }
                if (kgMorango > 8) {
                    System.out.println("Você está comprando " + kgMorango + "Kg por isso estará recebendo um desconto de 10%.");
                    double precoMorangoAcimaDe5Kg = 2.2;
                    double valorTotal = (precoMorangoAcimaDe5Kg * kgMorango);
                    double valorDesconto = (precoMorangoAcimaDe5Kg * kgMorango) * (0.1);
                    System.out.println("O valor total da sua compra foi de: " + (valorTotal - valorDesconto));
                }
                if (kgMorango <= 5) {
                    System.out.println("Você está comprando " + kgMorango + "Kg para ganhar o desconto, você precisa estar comprando acima de 8Kg para obter um desconto maior.");
                    double precoMorangoAbaixoDe5kg = 2.5;
                    double valorTotalAbaixoDe5Kg = precoMorangoAbaixoDe5kg * kgMorango;
                    System.out.println("O valor total da sua compra foi de: " + valorTotalAbaixoDe5Kg);
                }
            }
            break;
            case 3: {
                System.out.println("Quantos quilos de Maça você deseja comprar? ");
                kgMaca = scan.nextInt();

                System.out.println("Quantos quilos de Morango você deseja comprar? ");
                kgMorango = scan.nextInt();

                int somaDosKg = kgMaca + kgMorango;

                if (somaDosKg > 8) {
                    double precoMorangoAcimaDe5Kg = 2.2;
                    double precoMacaAbaixoDe5kg = 1.8;
                    double precoMacaAcimaDe5Kg = 1.5;
                    double precoMorangoAbaixoDe5kg = 2.5;
                    System.out.println("Você recebeu um desconto de 10% por estar comprando mais de 8KG em frutas.");
                    System.out.println("Você está comprando um total de " + somaDosKg + "kg de frutas. " + "Desses " + somaDosKg + "kg, " + kgMaca + "kg são de maça e " + kgMorango + "kg de morango.");
                    System.out.println("O valor total gasto foi de: ");
                }
                if (kgMaca > 5) {
                    if (somaDosKg <= 8) {
                        System.out.println("Você está comprando o Kg da maça por R$ 1.50");
                        double precoMacaAcimaDe5Kg = 1.5;
                        double valorTotal = (precoMacaAcimaDe5Kg * kgMaca);
                        double valorDesconto = (precoMacaAcimaDe5Kg * kgMaca) * (0.1);
                        System.out.println("O valor total da sua compra foi de: " + (valorTotal - valorDesconto));
                    }
                } else {
                    double precoMacaAbaixoDe5kg = 1.8;
                    System.out.println("Você está comprando o Kg da maça por R$ " + precoMacaAbaixoDe5kg + ".");
                    System.out.println("Valor total pago por " + kgMaca + " foi de R$ " + precoMacaAbaixoDe5kg * kgMaca);
                }
            }
        }
    }
}
