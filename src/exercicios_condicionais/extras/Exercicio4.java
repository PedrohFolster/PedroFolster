package exercicios_condicionais.extras;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double altura;
        String sexo;
        int escolha;

        System.out.println("Escolha entre uma das opções abaixo:\n" +
                            "1 - Homem\n" +
                            "2 - Mulher");
        escolha = scan.nextInt();

        switch (escolha) {
            case 1: {
                System.out.print("Insira sua altura em metros: ");
                altura = scan.nextDouble();

                double pesoIdeal = ((62.1 * altura) - 44.7);
                System.out.println("O seu peso ideial seria de: " + pesoIdeal);
                break;
            }
            case 2: {
                System.out.print("Insira sua altura em metros: ");
                altura = scan.nextDouble();

                double pesoIdeal = ((72.7 * altura) - 58);
                System.out.println("O seu peso ideial seria de: " + pesoIdeal);
                break;
            }
        }
    }
}
