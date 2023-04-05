package exercicios_condicionais;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int anoDeIngresso;
        int anoDeNascimento;
        String nomeDoEmpregado;

        System.out.println("Informe o seu nome: ");
        nomeDoEmpregado = scan.nextLine();

        System.out.println("Insira abaixo o ano do seu nascimento: ");
        anoDeNascimento = scan.nextInt();

        System.out.println("Insira abaixo o ano de ingresso na empresa: ");
        anoDeIngresso = scan.nextInt();

        int anosDoEmpregado = 2023 - anoDeNascimento;
        int tempoTrabalhado = 2023 - anoDeIngresso;

        if (anosDoEmpregado >= 65 || tempoTrabalhado >= 30 || anosDoEmpregado >= 60 && tempoTrabalhado >= 25) {
            System.out.println("Requerer aposentadoria!");
        } else {
            System.out.println("Não requerer aposentadoria!");
        }
    }
}
