package lista_repeticao;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int par = 0;

        System.out.println("Insira 10 números abaixo para descobrir quantos são pares!");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Insira o " + i + "º número: ");
            numero = scan.nextInt();
            System.out.println();
            System.out.println(i + "º número: " + numero);
            if (numero % 2 == 0)
                par++;
        }
        System.out.println("Você tem " + par + " números pares!");
    }
}

