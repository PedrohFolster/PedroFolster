package lista_repeticao;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int mercadoriasEmEstoque;
        double precoMercadorias;
        double valorTotal = 0;

        System.out.print("Informe a quantidade de mercadorias que você tem em estoque: ");
        mercadoriasEmEstoque = scan.nextInt();

        for (int i = 1; i <= mercadoriasEmEstoque; i++) {
            System.out.print("Digite o preço da " + i + "º mercadoria:");
            precoMercadorias = scan.nextDouble();

            valorTotal += precoMercadorias;
        }

        double mediaValorMercadoria = valorTotal / mercadoriasEmEstoque;

        System.out.println("Você possuí " + mercadoriasEmEstoque + " mercadorias em estoque!");
        System.out.println("Valor total em estoque é de: " + valorTotal);
        System.out.println("Média dos valores em estoque: " + mediaValorMercadoria);
    }
}
