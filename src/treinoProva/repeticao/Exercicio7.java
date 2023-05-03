package treinoProva.repeticao;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidadeMercadorias;
        double valorMercadoria;
        double valorTotalMercadorias = 0;

        System.out.print("Informe a quantidade de mercadorias em estoque: ");
        quantidadeMercadorias = scan.nextInt();

        for (int i = 1; i <= quantidadeMercadorias; i++) {
            System.out.print("Informe o valor da " + i + "° mercadoria: ");
            valorMercadoria = scan.nextDouble();

            valorTotalMercadorias += valorMercadoria;
        }
        System.out.println("Você tem " + quantidadeMercadorias + " mercadorias em estoque!");
        System.out.println("O valor total em estoque é de: R$ " + valorTotalMercadorias);
        System.out.println("A média de valor das mercadorias é de: R$ " + (valorTotalMercadorias / quantidadeMercadorias));
    }
}
