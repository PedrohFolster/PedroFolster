package exercicios_condicionais;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1;
        double nota2;

        System.out.println("Insira a sua primeira nota: ");
        nota1 = scan.nextDouble();

        System.out.println("Insira a sua segunda nota: ");
        nota2 = scan.nextDouble();

        double totalNotas = (nota1 + nota2) / 2;

        if (totalNotas >=7) {
            System.out.println("Você foi aprovado com uma média de: " + totalNotas);
        } else {
            System.out.println("Você foi reprovado, sua média foi abaixo de 7. Sua média foi de: " + totalNotas);
        }
    }
}
