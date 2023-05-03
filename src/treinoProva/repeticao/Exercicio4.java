package treinoProva.repeticao;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int valorTotal = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Insira o " + i + "° número: ");
            numero = scan.nextInt();

            valorTotal += numero;
        }
        double media = valorTotal / 10;
        System.out.println("A média dos valores foi de: " + media);
    }
}
