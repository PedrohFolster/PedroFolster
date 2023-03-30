package faculdadeSenac;

import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int parOuImpar;

        System.out.println("Insira um número para descobrir se o número é par ou impar: ");
        parOuImpar = scan.nextInt();

        if (parOuImpar % 2 == 0) {
            System.out.println("O número digitado é par!");
        } else {
            System.out.println("O número digitado é ímpar!");
        }

    }
}
