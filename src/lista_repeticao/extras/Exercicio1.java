package lista_repeticao.extras;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidadeProdutos = 0;
        double precoMercadorias;
        double valorTotal = 0;
        int contador = 0;
        String alternativa;


        do {
            System.out.print("Informe a quantidade de produtos que você deseja comprar: ");
            quantidadeProdutos = scan.nextInt();
            scan.nextLine();

            for (int i = 1; i <= quantidadeProdutos; i++) {
                contador++;
                System.out.print("Digite o preço do " + contador + "º produto:");
                precoMercadorias = scan.nextDouble();

                valorTotal += precoMercadorias;
            }

            System.out.println("Você deseja adicionar mais algum produto?\n" +
                    "S - Sim, desejo adicionar um produto." +
                    "\nN - Não, não irei adicionar mais nenhum produto.");

            alternativa = scan.next();

            if (alternativa.equalsIgnoreCase("N")) {
                double mediaValorMercadoria = valorTotal / quantidadeProdutos;

                System.out.println("Você comprou " + contador + " produtos!");
                System.out.println("Valor total comprado foi de: " + valorTotal);
                System.out.println("Média dos valores comprados foi de: " + mediaValorMercadoria);
                break;
            }
        } while (quantidadeProdutos > contador || alternativa.equalsIgnoreCase("S"));
    }
}
