package exerciciosArrays;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double [] numeros = new double[6];
        double somaValores = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");
            numeros[i] = scan.nextDouble();

            somaValores += numeros[i];
        }
        double mediaValores = somaValores / numeros.length;

        System.out.println();
        System.out.println("A média dos valores é de: " + mediaValores);
    }
}