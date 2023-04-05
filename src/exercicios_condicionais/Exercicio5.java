package exercicios_condicionais;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidadeEmEstoque;
        int quantidadeMaxima;
        int quantidadeMinima;

        System.out.println("Informe a quantidade em estoque: ");
        quantidadeEmEstoque = scan.nextInt();

        System.out.println("Insira a quantidade máxima para o produto em estoque: ");
        quantidadeMaxima = scan.nextInt();

        System.out.println("Insira a quantidade mínima para o produto em estoque: ");
        quantidadeMinima = scan.nextInt();

        double quantidadeMedia = ((quantidadeMaxima + quantidadeMinima) / 2);

        if (quantidadeEmEstoque >= quantidadeMedia) {
            System.out.println("Não é necessário efetuar a compra deste produto.");
        } else {
            System.out.println("Efetuar a compra desse produto.");
        }

    }
}
