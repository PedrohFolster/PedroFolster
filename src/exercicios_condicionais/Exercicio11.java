package exercicios_condicionais;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;

        System.out.println("Insira a sua primeira nota: ");
        nota1 = scan.nextDouble();

        System.out.println("Insira a sua segunda nota: ");
        nota2 = scan.nextDouble();

        System.out.println("Insira a sua terceira nota: ");
        nota3 = scan.nextDouble();

        double mediaDasNotas = (nota1 + nota2 + nota3) / 3;

        double mediaDeAproveitamento = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaDasNotas) / 7;

        if (mediaDeAproveitamento >= 9) {
            System.out.println("Você recebeu o conceito A por estar com a média igual ou acima de 9.");
        }
        if (mediaDeAproveitamento >= 7.5) {
            if (mediaDeAproveitamento < 9)
                System.out.println("Você está dentro do conceito B por estar com a média igual ou acima de 7.5");
        }
        if (mediaDeAproveitamento >= 6) {
            if (mediaDeAproveitamento < 7.5)
                System.out.println("Você está dentro do conceito C por estar com a média igual ou acima de 6");
        }
        if (mediaDeAproveitamento < 6) {
                System.out.println("Você está dentro do conceito D por estar com a média menor do que 6");
        }
    }
}
