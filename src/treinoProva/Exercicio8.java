package treinoProva;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidadeMercadorias;
        double valorMercadoria;
        double valorTotalMercadorias = 0;
        int contador = 0;
        String alternativa;

        do {
            System.out.print("Insira quantas mercadorias você possuí em estoque: ");
            quantidadeMercadorias = scan.nextInt();

            for (int i = 1; i <= quantidadeMercadorias; i++) {
                contador++;
                System.out.print("Digite o preço da " + contador + "º mercadoria:");
                valorMercadoria = scan.nextDouble();

                valorTotalMercadorias += valorMercadoria;
            }

            System.out.println("Você deseja informar mais uma mercadoria?\n" +
                    "S - Sim, desejo informar mais uma mercadoria!\n" +
                    "N - Não, desejo finalizar!");
            alternativa = scan.next();

            if (alternativa.equalsIgnoreCase("N")) {
                System.out.println("Você tem " + contador + " mercadorias em estoque!");
                System.out.println("O valor total em estoque é de: R$ " + valorTotalMercadorias);
                System.out.println("A média de valor das mercadorias é de: R$ " + (valorTotalMercadorias / quantidadeMercadorias));
                break;
            }

        } while (quantidadeMercadorias > contador || alternativa.equalsIgnoreCase("S"));

    }
}
