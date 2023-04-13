package exercicios_condicionais.extras;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int confirmacoes = 0;

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

        if (resposta1.equalsIgnoreCase("s")) {
            confirmacoes++;
        }
        if (resposta2.equalsIgnoreCase("s")) {
            confirmacoes++;
        }
        if (resposta3.equalsIgnoreCase("s")) {
            confirmacoes++;
        }
        if (resposta4.equalsIgnoreCase("s")) {
            confirmacoes++;
        }
        if (resposta5.equalsIgnoreCase("s")) {
            confirmacoes++;
        }

        System.out.println("Classificação.");

        if (confirmacoes == 0 || confirmacoes == 1) {
            System.out.println("Você foi considerado inocente!");
        } else if (confirmacoes == 2) {
            System.out.println("Você foi considerado suspeito!");
        } else if (confirmacoes >= 3 && confirmacoes <= 4) {
            System.out.println("Você foi considerado cúmplice!");
        } else {
            System.out.println("Você foi considerado culpado!");
        }
    }
}