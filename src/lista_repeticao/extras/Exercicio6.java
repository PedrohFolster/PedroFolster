package lista_repeticao.extras;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valorReceita;
        double valorDespesa;

        System.out.print("Informe o valor das receitas da empresa no mês a ser comparado: ");
        valorReceita = scan.nextDouble();

        System.out.print("Informe o valor das despesas no mês a ser comparado: ");
        valorDespesa = scan.nextDouble();

        double valorTotal = valorReceita - valorDespesa;

        if (valorTotal < 0) {
            System.out.println("A empresa ficou no prejuízo esse mês!");
        } else if (valorTotal > 0) {
            System.out.println("Tivemos um resultado positivo esse mês!");
        }
    }
}
