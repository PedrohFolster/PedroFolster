package treinoProva.repeticao_extras;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int contador = 0, quantidade;
        double preco, valorTotal = 0;
        String alternativa;

        do {
            System.out.print("Informe a quantidade de itens que você deseja adicionar: ");
            quantidade = scan.nextInt();
            
            for (int i = 1; i <= quantidade; i++) {
                contador++;
                System.out.print("Informe o valor do " + contador + "° item: ");
                preco = scan.nextDouble();
                
                valorTotal += preco;
            }
            System.out.println();
            System.out.println("Você deseja informar mais uma mercadoria?\n" +
                    "S - Sim, desejo informar mais uma mercadoria!\n" +
                    "N - Não, desejo finalizar!");
            alternativa = scan.next();
            
            if (alternativa.equalsIgnoreCase("N")) {
                System.out.println("Você comprou " + contador + " itens!");
                System.out.println("O valor total da compra foi de: R$ " + valorTotal);
                break;
            }
                
                
        } while (quantidade > contador || alternativa.equalsIgnoreCase("S"));

    }
}
