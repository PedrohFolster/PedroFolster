package treinoProva.pratica.procedimentos;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;

        System.out.print("Informe a idade do nadador: ");
        idade = scan.nextInt();

        categoriaNadador(idade);

    }

    private static void categoriaNadador(int idade) {
        if (idade <= 10) {
            System.out.println("Categoria mirim!");
        } else if (idade <= 14) {
            System.out.println("Categoria infantil!");
        } else if (idade <= 19) {
            System.out.println("Categoria juvenil!");
        } else if (idade > 19) {
            System.out.println("Categoria adulto!");
        }
    }
}
