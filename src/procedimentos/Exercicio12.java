package procedimentos;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int escolha;
        String novamente;
        double[] numero = new double[2];

        do {
            for (int i = 0; i < numero.length; i++) {
                System.out.print("Informe o " + (i + 1) + "° número: ");
                numero[i] = scan.nextDouble();
            }

            System.out.println();

            System.out.println("Informe o tipo de operação a ser feita: \n" +
                    "1 - Adição \n" +
                    "2 - Subtração \n" +
                    "3 - Multiplicação \n" +
                    "4 - Divisão");
            escolha = scan.nextInt();

            if (escolha == 1) {
                System.out.println("A adição dos números informados acima foi de: " + realizarAdicao(numero));
            } else if (escolha == 2) {
                System.out.println("A subtração dos números informados acima foi de: " + realizarSubtracao(numero));
            } else if (escolha == 3) {
                System.out.println("A multiplicação dos números informados acima foi de: " + realizarMultiplicacao(numero));
            } else if (escolha == 4) {
                System.out.println("A divisão dos números informados acima foi de: " + realizarDivisao(numero));
            }

            System.out.println();
            System.out.println("Você deseja realizar uma nova operação? \n" +
                    "S - Sim, desejo realizar uma nova operação.\n" +
                    "N - Não, desejo finalizar o código");
            novamente = scan.next();

            if (novamente.equalsIgnoreCase("N")) {
                System.out.println("Você encerrou o código!");
            }

        } while (novamente.equalsIgnoreCase("S"));
    }

    private static double realizarDivisao(double[] numero) {
        System.out.println();
            if (numero[1] <= 0) {
                System.out.println("Erro, você deve informar um número maior que Zero.");
                return 0;
            } else {
                return numero[0] / numero[1];
            }
    }

    private static double realizarMultiplicacao(double[] numero) {
        System.out.println();
        return numero[0] * numero[1];
    }

    private static double realizarSubtracao(double[] numero) {
        System.out.println();
        return numero[0] - numero[1];
    }

    private static double realizarAdicao(double[] numero) {
        System.out.println();
        return numero[0] + numero[1];
    }

}
