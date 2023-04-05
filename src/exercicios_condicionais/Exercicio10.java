package exercicios_condicionais;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name;
        int quantidadeAdquirida;
        double precoUnitario;

        System.out.println("Informe o nome do produto!");
        name = scan.nextLine();

        System.out.println("Informe a quantidade adquirida do produto: ");
        quantidadeAdquirida = scan.nextInt();

        System.out.println("Informe o preço unitário do produto: ");
        precoUnitario = scan.nextDouble();

        double valorDaQuantidade = quantidadeAdquirida * precoUnitario;
        double valor = valorDaQuantidade;
        if (quantidadeAdquirida <= 5) {
            System.out.println("Você ganhou um desconto de 2% por estar comprando " + quantidadeAdquirida + " quantidades do produto.");
            valor *= 0.02;
            System.out.println("Você está pagando R$ " + (valorDaQuantidade - valor) + " reais!");
        }
        if (quantidadeAdquirida > 5 && quantidadeAdquirida <= 10) {
            System.out.println("Você ganhou um desconto de 3% por estar comprando " + quantidadeAdquirida + " quantidades do produto.");
            valor *= 0.03;
            System.out.println("Você está pagando R$ " + (valorDaQuantidade - valor) + " reais!");
        }
        if (quantidadeAdquirida > 10) {
            System.out.println("Você ganhou um desconto de 5% por estar comprando " + quantidadeAdquirida + " quantidades do produto.");
            valor *= 0.05;
            System.out.println("Você está pagando R$ " + (valorDaQuantidade - valor) + " reais!");
        }
    }
}
