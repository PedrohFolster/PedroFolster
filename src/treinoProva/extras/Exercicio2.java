package treinoProva.extras;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;
        double altura, mediaIdade, menorAltura = Double.POSITIVE_INFINITY, totalIdade = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println();
            System.out.print("Informe a idade do " + i + "° jogador: ");
            idade = scan.nextInt();

            System.out.print("Informe a altura do " + i + "° jogador: ");
            altura = scan.nextDouble();

            totalIdade += idade;

            if (menorAltura > altura) {
                menorAltura = altura;
            }
        }
        mediaIdade = totalIdade / 5;

        System.out.println();
        System.out.println("A média das idades dos jogadores foram de: " + mediaIdade);
        System.out.println("A menor altura foi de: " + menorAltura);
    }
}
