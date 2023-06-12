package procedimentos;

import java.util.Scanner;

public class testeee {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] numeros = new double[2];
        String escolha;
        int operacao;


        do {
            System.out.println();
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Informe o " + (i + 1) + "° número: ");
                numeros[i] = scan.nextDouble();
            }

            System.out.println();

            System.out.println("Informe a operação que você deseja realizar\n" +
                    "1 - Adição. \n" +
                    "2 - Subtração. \n" +
                    "3 - Multiplicação. \n" +
                    "4 - Divisão.");
            operacao = scan.nextInt();

            System.out.println();

            if (operacao == 1) {
                System.out.println("O valor da soma foi de: " + realizarSoma(numeros));
            } else if (operacao == 2) {
                System.out.println("O resultado da subtração foi de: " + realizarSubtracao(numeros));
            } else if (operacao == 3) {
                System.out.println("O resultado da multiplicação foi de: " + realizarMultiplicacao(numeros));
            } else if (operacao == 4) {
                System.out.println("O resultado da divisão foi de: " + realizarDivisao(numeros));
            }

            System.out.println();

            System.out.println("Você deseja realizar outro procedimento?\n" +
                    "S - Sim, desejo realizar uma operação.\n" +
                    "N - Não, desejo finalizar o código.");
            escolha = scan.next();

            if (escolha.equalsIgnoreCase("N")) {
                System.out.println();
                System.out.println("Você encerrou o código!");
            }
        } while (escolha.equalsIgnoreCase("S"));

    }

    public static double realizarDivisao(double numeros[]) {
        if (numeros[1] == 0) {
            System.out.println("Não é possível realizar essa operação, o segundo número informado deve ser diferente de Zero.");
            return 0;
        } else {
            return numeros[0] / numeros[1];
        }
    }

    public static double realizarMultiplicacao(double numeros[]) {

        return numeros[0] * numeros[1];
    }

    public static double realizarSubtracao(double numeros[]) {

        return numeros[0] - numeros[1];
    }

    public static double realizarSoma(double numeros[]) {

        return numeros[0] + numeros[1];
    }
}
