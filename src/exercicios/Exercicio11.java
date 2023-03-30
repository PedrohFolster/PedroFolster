package exercicios;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;

        System.out.println("Informe a primeira nota: ");
        nota1 = scan.nextDouble();

        System.out.println("Informe a segunda nota: ");
        nota2 = scan.nextDouble();

        System.out.println("Informe a terceira nota: ");
        nota3 = scan.nextDouble();

        double mediaDasNotas = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
        System.out.println("A média do aluno é: " + mediaDasNotas);
    }
}
