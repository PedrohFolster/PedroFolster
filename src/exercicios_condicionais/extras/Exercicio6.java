package exercicios_condicionais.extras;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int confirmcoes = 0;

        System.out.println("Responda as seguintes perguntas abaixo.");

        System.out.println("1 - Você já trabalhou com a vitima? Responda (s/n)");
        String resposta1 = scan.nextLine();

        System.out.println("2 - Você telefonou para vítima? Responda (s/n)");
        String resposta2 = scan.nextLine();

        System.out.println("3 - Você mora próxima a vítima? Responda (s/n)");
        String resposta3 = scan.nextLine();

        System.out.println("4 - Você devia dinheiro a vítima? Responda (s/n)");
        String resposta4 = scan.nextLine();

        System.out.println("5 - Você esteve no local do crime? Responda (s/n)");
        String resposta5 = scan.nextLine();

        if (resposta1.equals("s")) {
            confirmcoes++;
        }
        if (resposta2.equals("s")) {
            confirmcoes++;
        }
        if (resposta3.equals("s")) {
            confirmcoes++;
        }
        if (resposta4.equals("s")) {
            confirmcoes++;
        }
        if (resposta5.equals("s")) {
            confirmcoes++;
        }

        System.out.println("Classificação.");

        if (confirmcoes == 0 || confirmcoes == 1) {
            System.out.println("Você foi considerado inocente!");
        } else if (confirmcoes == 2) {
            System.out.println("Você foi considerado suspeito!");
        } else if (confirmcoes >= 3 && confirmcoes <= 4) {
            System.out.println("Você foi considerado cúmplice!");
        } else {
            System.out.println("Você foi considerado culpado!");
        }
    }
}
