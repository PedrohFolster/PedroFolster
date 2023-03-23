package exercicios;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double pesoDaRacao;
        int gatos = 2;
        double gramasPorDia;
        int dias = 5;

        System.out.println("Insira a quantidade de ração em Kg.");
        pesoDaRacao = scan.nextDouble();

        System.out.println("Quantidade de gatos: " + gatos);

        System.out.println("Informe a quantidade de comida que cada gato come por dia: ");
        gramasPorDia = scan.nextDouble();

        System.out.println("Após 5 dias passados, a quantidade de ração que sobrou será: ");

        double pesoDaRacaoEmGrama = pesoDaRacao * 1000;

        System.out.println((gatos * gramasPorDia * dias) - pesoDaRacaoEmGrama);
    }
}
