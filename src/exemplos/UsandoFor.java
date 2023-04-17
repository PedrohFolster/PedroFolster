package exemplos;

import java.util.Scanner;

public class UsandoFor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String name = scan.nextLine();

        for (int i = 1; i <= 10; i++) {
            System.out.println("O " + name + " é um(a) otário(a) !!!!");

        }
    }
}
