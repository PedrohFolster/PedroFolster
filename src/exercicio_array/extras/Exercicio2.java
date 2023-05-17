package exercicio_array.extras;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] casas = new double[10];
        double totalArea = 0;
        int counter = 0;

        for (int i = 0; i < casas.length; i++) {
            System.out.print("Informe a área da " + (i + 1) + "° casa (em m²): ");
            casas[i] = scan.nextDouble();
            totalArea += casas[i];
        }

        double mediaTotal = totalArea / casas.length;

        for (int i = 0; i < casas.length; i++) {
            if (casas[i] < mediaTotal) {
                counter++;
            }
        }

        System.out.println();
        System.out.println("A área total das casas é de: " + totalArea + "m²");
        System.out.println("A média das áreas é de: " + mediaTotal + "m²");
        System.out.println(counter + " casas estão abaixo da média!");

    }
}
