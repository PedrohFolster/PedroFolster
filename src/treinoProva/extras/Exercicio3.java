package treinoProva.extras;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double distancia, tempo, totalTempo = 0, totalDistancia = 0, distanciaProxima;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Informe a distancia da " + i + "° prova em metros: ");
            distancia = scan.nextDouble();

            System.out.print("Informe o tempo de conclusão da " + i + "° prova em minutos: ");
            tempo = scan.nextDouble();

            totalDistancia += distancia;
            totalTempo += tempo;
        }

        double velocidadeMedia = totalDistancia / (totalTempo * 60);
        System.out.println("Você teve uma média de " + velocidadeMedia + " metros por segundo (m/s).");

        System.out.print("Informe a distancia da sua próxima prova: ");
        distanciaProxima = scan.nextDouble();

        double conclusao = (distanciaProxima / velocidadeMedia) / 60;
        System.out.println("Com base nas informações fornecidas, você terminará sua próxima prova em: " + conclusao + " minuto(s)!");
    }
}
