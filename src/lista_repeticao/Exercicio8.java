package lista_repeticao;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int mercadoriasEmEstoque = 0;
        double precoMercadorias;
        double valorTotal = 0;
        int contador = 0;
        String alternativa;

        System.out.print("Informe a quantidade de mercadorias que você tem em estoque: ");
        mercadoriasEmEstoque = scan.nextInt();
        scan.nextLine();

        do {
            for (int i = 1; i <= mercadoriasEmEstoque; i++) {
                System.out.print("Digite o preço da " + i + "º mercadoria:");
                precoMercadorias = scan.nextDouble();

                valorTotal += precoMercadorias;
            }

            System.out.println("Você deseja adicionar mais algum produto?\n" +
                    "S - Sim, desejo adicionar um produto." +
                    "\nN - Não, não irei adicionar mais nenhum produto.");

            alternativa = scan.next();

            if (alternativa.equalsIgnoreCase("N")) {
                System.out.println("Você teve " + mercadoriasEmEstoque + " mercadorias!");
                double mediaValorMercadoria = valorTotal / mercadoriasEmEstoque;

                System.out.println("Você possuí " + mercadoriasEmEstoque + " mercadorias em estoque!");
                System.out.println("Valor total em estoque é de: " + valorTotal);
                System.out.println("Média dos valores em estoque: " + mediaValorMercadoria);
                break;
            }

            double mediaValorMercadoria = valorTotal / mercadoriasEmEstoque;

            System.out.println("Você possuí " + mercadoriasEmEstoque + " mercadorias em estoque!");
            System.out.println("Valor total em estoque é de: " + valorTotal);
            System.out.println("Média dos valores em estoque: " + mediaValorMercadoria);
            contador++;

        } while (mercadoriasEmEstoque > contador);

    }
}
