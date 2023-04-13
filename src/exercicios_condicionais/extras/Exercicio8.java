package exercicios_condicionais.extras;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double leituraAtual, leituraAnterior, consumo, valorConsumo, taxaMinima = 35.00, taxaEsgoto = 35.00;
        String tipoConta;

        System.out.print("Informe a leitura atual do medidor (em m³): ");
        leituraAtual = scan.nextDouble();

        System.out.print("Informe a leitura anterior do medidor (em m³): ");
        leituraAnterior = scan.nextDouble();

        consumo = leituraAtual - leituraAnterior;

        System.out.print("Informe o tipo de conta (residencial/predial): ");
        tipoConta = scan.next();

        if (tipoConta.equals("residencial")) {
            if (consumo <= 10) {
                valorConsumo = consumo * 1.00;
            } else if (consumo <= 25) {
                valorConsumo = 10 * 1.00 + (consumo - 10) * 2.50;
            } else {
                valorConsumo = 10 * 1.00 + 15 * 2.50 + (consumo - 25) * 4.25;
            }
        } else {
            if (consumo <= 10) {
                valorConsumo = consumo * 1.30;
            } else if (consumo <= 25) {
                valorConsumo = 10 * 1.30 + (consumo - 10) * 2.90;
            } else {
                valorConsumo = 10 * 1.30 + 15 * 2.90 + (consumo - 25) * 4.50;
            }
        }

        double valorTotal = valorConsumo + taxaMinima + taxaEsgoto;

        System.out.println("\nConsumo: " + consumo + " m³");
        System.out.println("Valor do consumo: R$ " + valorConsumo);
        System.out.println("Taxa mínima: R$ " + taxaMinima);
        System.out.println("Taxa de coleta de esgoto: R$ " + taxaEsgoto);
        System.out.println("Valor total da conta: R$ " + valorTotal);
    }

}
