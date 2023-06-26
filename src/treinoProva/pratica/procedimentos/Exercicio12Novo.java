package treinoProva.pratica.procedimentos;

import java.util.Scanner;

public class Exercicio12Novo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;

        System.out.print("Informe seu nome: ");
        nome = scan.nextLine();

        String [] separar = nome.split(" ");

        System.out.print(separar[separar.length - 1].toUpperCase() + ". ");

        for (int i = 0; i < separar.length - 1; i++) {
            System.out.print(separar[i]);
            System.out.print(" ");
        }

        System.out.println(separar[separar.length - 2] + ".");

    }
}
