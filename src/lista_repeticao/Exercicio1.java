package lista_repeticao;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1, num2;

        System.out.print("Informe o primeiro número: ");
        num1 = scan.nextInt();

        System.out.print("Agore informe o segundo número: ");
        num2 = scan.nextInt();

        while (num2 == 0) {
            System.out.print("Número inválido! Insira um número diferente de zero: ");
            num2 = scan.nextInt();
        }

        double resultado = num1 / num2;

        System.out.println("A dívisão de " + num1 + " por " + num2 + " foi de " + resultado);
    }
}

