package exercicio_array;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int meses = 12;
        double [] temperaturas = new double[meses];
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;
        double totalTemperatura = 0;
        int counter = 0;


        for (int i = 0; i < meses; i++) {
            System.out.print("Informe a temperatura do " + (i + 1) + "° mês: ");
            temperaturas[i] = scan.nextDouble();

            totalTemperatura += temperaturas[i];

            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }
        }

        double mediaTemperatura = totalTemperatura / meses;

        for (int i = 0; i < meses; i++) {
            if (temperaturas[i] < mediaTemperatura) {
                counter++;
            }
        }

        System.out.println("Menor temperatura: " + menor + "°.");
        System.out.println("Maior temperatura: " + maior + "°.");
        System.out.println("Média temperatura: " + mediaTemperatura + "°.");
        System.out.println(counter + " meses ficaram abaixo da média de temperatura.");

    }
}
