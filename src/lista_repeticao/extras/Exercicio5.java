package lista_repeticao.extras;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String categoriaMaisGasto = "";
        String categoriaMenosGasto = "";
        double valorGastoAlimentacao = 0;
        double valorGastoCombustivel = 0;
        double valorGastoSaude = 0;
        double maisGasto = Double.NEGATIVE_INFINITY;
        double menosGasto = Double.POSITIVE_INFINITY;

        System.out.print("Insira o valor gasto em alimentação no mês: ");
        valorGastoAlimentacao = scan.nextDouble();

        System.out.print("Insira o valor gasto em combustível no mês: ");
        valorGastoCombustivel = scan.nextDouble();

        System.out.print("Insira o valor gasto em saúde no mês: ");
        valorGastoSaude = scan.nextDouble();

        if (valorGastoAlimentacao == valorGastoCombustivel && valorGastoCombustivel == valorGastoSaude) {
            System.out.println("Os gastos foram iguais.");
        } else {
            if (valorGastoAlimentacao > maisGasto || valorGastoCombustivel > maisGasto || valorGastoSaude > maisGasto) {
                maisGasto = Math.max(valorGastoAlimentacao, Math.max(valorGastoCombustivel, valorGastoSaude));

                if (maisGasto == valorGastoAlimentacao) {
                    categoriaMaisGasto = "alimentação";
                } else if (maisGasto == valorGastoCombustivel) {
                    categoriaMaisGasto = "combustível";
                } else {
                    categoriaMaisGasto = "saúde";
                }
            }

            if (valorGastoAlimentacao < menosGasto || valorGastoCombustivel < menosGasto || valorGastoSaude < menosGasto) {
                menosGasto = Math.min(valorGastoAlimentacao, Math.min(valorGastoCombustivel, valorGastoSaude));

                if (menosGasto == valorGastoAlimentacao) {
                    categoriaMenosGasto = "alimentação";
                } else if (menosGasto == valorGastoCombustivel) {
                    categoriaMenosGasto = "combustível";
                } else {
                    categoriaMenosGasto = "saúde";
                }
            }

            double valorTotal = valorGastoAlimentacao + valorGastoCombustivel + valorGastoSaude;

            System.out.println();
            System.out.println("Valor total gasto foi de: " + valorTotal);
            System.out.println("Categoria com maior gasto: " + categoriaMaisGasto);
            System.out.println("Categoria com menor gasto: " + categoriaMenosGasto);
        }
    }
}
