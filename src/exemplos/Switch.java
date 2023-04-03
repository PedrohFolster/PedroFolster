package exemplos;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int opcao;

        System.out.println("Escolha entre uma das opções abaixo: ");
        System.out.println("1 - Aulas da Semana.");
        System.out.println("2 - Professores");

        opcao = scan.nextInt();
        switch (opcao) {
            case 1: {
                System.out.println("Segunda-feira: Introdução a programação.\n" +
                        "Terça-feira: Engenharia de requisitos.\n" +
                        "Quarta-feira: Introdução a programação.\n" +
                        "Quinta-feira: Modelagem de dados.\n" +
                        "Sexta-fira: Aulas quinzenais, Introdução a computação / Fundamentos da pesquisa.");
                break;
            }
            case 2: {
                System.out.println("Introdução a programação - Adriano;\n" +
                        "Engenharia de Requisitos - Myag;\n" +
                        "Modelagem de dados - André;\n" +
                        "Introdução a computação - Thayse;\n" +
                        "Fundamentos da pesquisa - Myag.");
                break;
            }
            default: {
                System.out.println("Opção não encontrada!");
            }

        }
    }
}
