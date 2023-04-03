package exemplos;

import java.util.Scanner;

public class LucasAndCaruso {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nomes;

        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("1 - Lucas\n" +
                "2 - Caruso");

        nomes = scan.nextInt();
        switch (nomes) {
            case 1: {
                System.out.println("Informações sobre o Lucas: ");
                System.out.println("Nome completo: Lucas Carvalho Barreiro\n" +
                        "Idade: 19 anos.\n" +
                        "Altura: 1.87.\n" +
                        "Emprego: Jogador de Apex Legends.");
                break;
            }
            case 2: {
                System.out.println("Informações sobre o Caruso.");
                System.out.println("Nome completo: Bob o Construtor.\n" +
                        "Idade: 19 anos.\n" +
                        "Altura: 1.70.\n" +
                        "Emprego: Contrutor cívil, rouba tijolo da faculdade!");
                break;
            }
            default: {
                System.out.println("Insira um valor válido!");
                break;
            }
        }

    }
}
