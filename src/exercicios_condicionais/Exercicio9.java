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
            case 1:
                System.out.println("Você escolheu a categoria Maça.\n" +
                        "Quantos quilos de maça você deseja comprar? ");
                kgMaca = scan.nextInt();

                double precoMaca = (kgMaca > 5) ? 1.5 : 1.8;
                double valorTotalMaca = precoMaca * kgMaca;
                if (kgMaca > 5 && kgMaca <= 8) {
                    System.out.println("Você está comprando " + kgMaca + "Kg por isso estará recebendo um desconto.");

                }
                if (kgMaca > 8 || valorTotalMaca > 25.0) {
                    valorTotalMaca *= 0.9;
                    System.out.println("Você está comprando mais de 8Kg de Morango ou então comprando acima de R$ 25,00, por isso estará recebendo um desconto de 10%.");
                }
                System.out.println("O valor total da sua compra foi de: " + valorTotalMaca);
                break;
            case 2:
                System.out.println("Você escolheu a categoria Morango.\n" + "Quantos quilos de morango você deseja comprar? ");
                kgMorango = scan.nextInt();
                double precoMorango = (kgMorango > 5) ? 2.2 : 2.5;
                double valorTotalMorango = precoMorango * kgMorango;
                if (kgMorango > 5 && kgMorango <= 8) {
                    System.out.println("Você está comprando " + kgMorango + "Kg por isso estará recebendo um desconto.");
                }
                if (kgMorango > 8 || valorTotalMorango > 25.0) {
                    valorTotalMorango *= 0.9;
                    System.out.println("Você está comprando mais de 8Kg de Morango ou então comprando acima de R$ 25,00, por isso estará recebendo um desconto de 10%.");
                }
                System.out.println("O valor total da sua compra foi de: " + valorTotalMorango);
                break;
            case 3:
                System.out.println("Quantos quilos de Maça você deseja comprar? ");
                kgMaca = scan.nextInt();
                System.out.println("Quantos quilos de Morango você deseja comprar? ");
                kgMorango = scan.nextInt();

                int somaDosKg = kgMaca + kgMorango;
                double valorTotalAmbas = ((kgMaca > 5) ? (1.5 * kgMaca) : (1.8 * kgMaca)) + ((kgMorango > 5) ? (2.2 * kgMorango) : (2.5 * kgMorango));
                if (somaDosKg > 8 || valorTotalAmbas > 25.0) {
                    valorTotalAmbas *= 0.9;
                    System.out.println("Você recebeu um desconto de 10% por estar comprando mais de 8KG em frutas ou mais que R$ 25,00");
                    System.out.println("Valor total da compra: " + valorTotalAmbas);
                } else {
                    System.out.println("Para receber um desconto de 10%, você precisa estar comprando mais de 8KG em frutas ou mais que R$ 25,00");
                    System.out.println("Valor total da compra: " + valorTotalAmbas);
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

    }
}