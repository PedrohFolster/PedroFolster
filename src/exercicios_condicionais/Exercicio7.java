package exercicios_condicionais;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double precoLitrosGasolina = 6.9;
        double precoLitrosAlcool = 6.2;
        String combustivel;

        System.out.println("Qual combustível você deseja colocar em seu veículo? \n" +
                        "G - Gasolina\n" +
                        "A - Alcool");

        combustivel = scan.nextLine();

        switch (combustivel) {
            case "G": {
                System.out.println("Você escolheu colocar Gasolina!");
                System.out.println("Quantos litros de gasolina você deseja colocar? ");
               double litrosGasolina = scan.nextDouble();
                if (litrosGasolina > 20) {
                    double maiorDe20L = (precoLitrosGasolina * litrosGasolina) * (0.94);
                    System.out.println("Você irá ganhar um desconto de 6% por colocar mais de 20L de Galosina.");
                    System.out.println("Você irá pagar " + maiorDe20L + " reais.");
                } else {
                    double menorDe20L = (precoLitrosGasolina * litrosGasolina) * (0.96);
                    System.out.println("Você irá ganhar um desconto de 4%.");
                    System.out.println("Você irá pagar " + menorDe20L + " reais.");
                    break;
                }
            }
            case "A": {
                System.out.println("Você escolheu colocar Alcool!");
                System.out.println("Quantos litros de alcool você deseja colocar? ");
                double litrosAlcool = scan.nextDouble();

                if (litrosAlcool > 20) {
                    double maiorDe20L = (precoLitrosAlcool * litrosAlcool) * (0.95);
                    System.out.println("Você irá ganhar um desconto de 5% por colocar mais de 20L de Alcool.");
                    System.out.println("Você irá pagar " + maiorDe20L + " reais.");
                } else {
                    double menorDe20L = (precoLitrosAlcool * litrosAlcool) * (0.97);
                    System.out.println("Você irá ganhar um desconto de 3%.");
                    System.out.println("Você irá pagar " + menorDe20L + " reais.");
                    break;
                }
            }
            default: {
                System.out.println("Opção não existe!");
            }
        }
    }
}
