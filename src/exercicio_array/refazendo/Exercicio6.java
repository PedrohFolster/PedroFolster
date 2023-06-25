package exercicio_array.refazendo;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double [] temperatura = new double[12];
        double totalTemperatura = 0;
        double menorTemperatura = Double.POSITIVE_INFINITY, maiorTemperatura = Double.NEGATIVE_INFINITY;
        int counter = 0;

        for (int i = 0; i < temperatura.length; i++) {
            System.out.print("Informe a temperatura do " + (i + 1) + "° mês: ");
            temperatura[i] = scan.nextDouble();

            totalTemperatura += temperatura[i];

            if (temperatura[i] < menorTemperatura) {
                menorTemperatura = temperatura[i];
            } else if (temperatura [i] > maiorTemperatura) {
                maiorTemperatura = temperatura[i];
            }
        }
        double mediaTemperatura = totalTemperatura / temperatura.length;

        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] < mediaTemperatura) {
                counter++;
            }
        }
        System.out.println();
        System.out.println("Maior temperatura: " + maiorTemperatura + "°C");
        System.out.println("Menor temperatura: " + menorTemperatura + "°C");
        System.out.println("Média da temperatura: " + mediaTemperatura + "°C");
        System.out.println(counter + " meses ficaram abaixo da temperatura!");
    }
}
