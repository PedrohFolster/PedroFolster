package procedimentos;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        int anos = receberIdade();

        System.out.println("Você tem " + anos + " anos.");
    }

    public static int receberIdade() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = scan.nextInt();

        System.out.println();

        if (idade < 10) {
            System.out.println("Você está na categoria mirim!");
        } else if (idade >= 10 && idade <= 14) {
            System.out.println("Você está na categoria infantil!");
        } else if (idade >= 15 && idade <= 19) {
            System.out.println("Você está na categoria juvenil!");
        } else if (idade > 19) {
            System.out.println("Você está na categoria adulto!");
        }

        return idade;
    }
}
