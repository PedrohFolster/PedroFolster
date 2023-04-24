package lista_repeticao.extras;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double minutos = 0;
        double distancia = 0;
        double distanciaProxima;
        double somaDistancia = 0;
        double somaMinutos = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Informe a distancia percorrida em metros da " + i + "º prova: ");
            distancia = scan.nextInt();

            somaDistancia += distancia;

            System.out.print("Informe o tempo de duração em minutos da " + i + "º prova: ");
            minutos = scan.nextDouble();

            somaMinutos += minutos;
        }
        double resultadoMedia = minutos / distancia;

        System.out.println();
        System.out.println("A média da sua velocidade nas cinco provas foi de: " + resultadoMedia + " metros por segundo (m/s).");

        System.out.print("Informe a distância da prova que você irá participar: ");
        distanciaProxima = scan.nextDouble();

        double resultadoProxima = resultadoMedia * distanciaProxima;
        System.out.println("Com base nas informações fornecidas, você irá terminar a sua próxima prova em: " + resultadoProxima + " segundos.");
    }
}
