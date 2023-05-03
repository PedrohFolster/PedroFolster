package treinoProva.repeticao;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int numero2;

        System.out.print("Informe o primeiro número: ");
        numero = scan.nextInt();

        System.out.print("Informe o segundo número: ");
        numero2 = scan.nextInt();

        while (numero2 == 0) {
            System.out.print("Valor inválido! Informe um novo número diferente de zero: ");
            numero2 = scan.nextInt();
        }
        double divisao = numero / numero2;
        System.out.println("A divisão dos números mencionados acima foi de: " + divisao);

    }
}
