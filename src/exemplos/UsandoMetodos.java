package exemplos;

import java.util.Scanner;

public class UsandoMetodos {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int numeroA = scan.nextInt();

        System.out.print("Informe um valor: ");
        int numeroB = scan.nextInt();

        System.out.println("Soma: " + somar(numeroA, numeroB));
        System.out.println("Subtração " + subtrair(numeroA, numeroB));
        System.out.println("Multiplicação " + multiplicar(numeroA, numeroB));
        System.out.println("Divisão " + dividir(numeroA, numeroB));

    }

    public static double dividir(int numeroA, int numeroB) {
        int resultado = 0;

        if (numeroB != 0) {
            resultado = numeroA / numeroB;
        } else {
            System.out.println("Não é possível dividir um número por Zero!");
        }
        return resultado;
    }

    public static double multiplicar(int numeroA, int numeroB) {
        return numeroA * numeroB;
    }

    public static int subtrair(int numeroA, int numeroB) {
        return numeroA - numeroB;
    }

    public static int somar(int numeroA, int numeroB) {
        return numeroA + numeroB;
    }
}
