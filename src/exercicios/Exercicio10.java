package exercicios;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int carrosVendidos;
        double totalVendas;
        double salarioFixo;
        double comissaoPorCarro;
        double porcentagemDasVendas = 0.05;

        System.out.println("Informe o número de carros vendidos: ");
        carrosVendidos = scan.nextInt();

        System.out.println("Informe o valor total das vendas: ");
        totalVendas = scan.nextDouble();

        System.out.println("Informe o salário fixo do vendedor: ");
        salarioFixo = scan.nextDouble();

        System.out.println("Informe a comissão por carros vendidos: ");
        comissaoPorCarro = scan.nextDouble();

        double salarioFinal = salarioFixo + (carrosVendidos + comissaoPorCarro) + (totalVendas * porcentagemDasVendas);
        System.out.println("O valor do salário é de: " + salarioFinal);

    }
}
