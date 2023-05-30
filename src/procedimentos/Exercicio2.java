package procedimentos;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double pontos = receberPontos();

        if (pontos <= 60) {
            System.out.println("Você tirou Insatisfatório!");
        } else if (pontos <= 75) {
            System.out.println("Você tirou Satisfatório");
        } else if (pontos <= 90) {
            System.out.println("Você tirou Bom");
        } else {
            System.out.println("Você tirou Ótimo");
        }
    }

    public static double receberPontos() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a sua pontuação na prova: ");
        return scan.nextDouble();
    }
}
