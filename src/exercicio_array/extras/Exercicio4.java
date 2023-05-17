package exercicio_array.extras;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double [] tempo = new double[10];
        double totalTempo = 0;
        double menorTempo = Double.POSITIVE_INFINITY;
        double maiorTempo = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < tempo.length; i++) {
            System.out.print("Informe o tempo do " + (i + 1) + "° atleta (em minutos): ");
            tempo[i] = scan.nextDouble();

            totalTempo += tempo[i];
        }

        double tempoMedio = totalTempo / tempo.length;

        for (int i = 0; i < tempo.length; i++) {
            if (tempo[i] < menorTempo) {
                menorTempo = tempo[i];
            }

            if (tempo[i] > maiorTempo) {
                maiorTempo = tempo[i];
            }
        }

        double diferencaTempo = maiorTempo - menorTempo;

        System.out.println();
        System.out.println("O tempo médio dos atletas é de: " + tempoMedio + " minuto(s)!");
        System.out.println("O menor tempo registrado foi de: " + menorTempo + " minuto(s)!");
        System.out.println("O maior tempo registrado foi de: " + maiorTempo + " minuto(s)!");
        System.out.println("A diferença entre os tempos foi de: " + diferencaTempo + " minuto(s)!");

    }
}
