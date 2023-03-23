package exercicios;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valorDeCarrosVendidos = 2500;
        int valorTotalDeVendas;
        double salarioFixo = 2000.00;
        double valorPorCarroVendido;

        System.out.println("Quantos carros você vendeu?");
        valorDeCarrosVendidos = scan.nextInt();

        System.out.println("Qual foi o seu valor total de vendas?");
        valorTotalDeVendas = scan.nextInt();

        System.out.print("Qual valor do seu salário fixo: ");
        salarioFixo = scan.nextDouble();
    }
}
