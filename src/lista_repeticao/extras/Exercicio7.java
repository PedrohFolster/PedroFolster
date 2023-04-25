package lista_repeticao.extras;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int aeronaves;
        double distancia, combustivel, consumo, menorConsumo = Double.NEGATIVE_INFINITY;
        String modeloMaisEconomica = null;

        System.out.print("Quantas aeronaves você deseja comparar? ");
        aeronaves = scan.nextInt();

        for (int i = 1; i <= aeronaves; i++) {
            System.out.println();
            System.out.print("Qual o modelo da " + i + "º aeronave?");
            String modelo = scan.next();

            System.out.print("Quantos Km ela percorre? ");
            distancia = scan.nextDouble();

            System.out.print("Quantos litros de combustível ela gasta para percorrer esse caminho? ");
            combustivel = scan.nextDouble();

            consumo = distancia / combustivel;

            if (consumo > menorConsumo) {
                menorConsumo = consumo;
                modeloMaisEconomica = modelo;
            }
        }
        System.out.println();
        System.out.println("A aeronave mais econômica é a " + modeloMaisEconomica + ", com consumo de " + 1 / menorConsumo + " km/l.");
    }
}
