package lista_repeticao.extras;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double quantidadeChuva;
        double mediaPorDia;

        System.out.print("Qual foi a quantidade de chuva em milímetros (mm) na semana: ");
        quantidadeChuva = scan.nextDouble();

        mediaPorDia = quantidadeChuva / 7;

        if (mediaPorDia < 30) {
            System.out.println("Seca!");
        } else if (mediaPorDia >= 30 && mediaPorDia <= 70) {
            System.out.println("Normal!");
        } else if (mediaPorDia > 70) {
            System.out.println("Chuvosa!");
        }
    }
}
