package exercicio_array;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[10];
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        int posicaoMaior = -1, posicaoMenor = -1;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            int numero = scan.nextInt();

            if (numero < 0) {
                System.out.println("Número inválido. Digite apenas números positivos.");
                i--;
                continue;
            }

            numeros[i] = numero;

            if (numero > maior) {
                maior = numero;
                posicaoMaior = i;
            }

            if (numero < menor) {
                menor = numero;
                posicaoMenor = i;
            }
        }

        System.out.println("Maior número: " + maior + ", posição: " + posicaoMaior);
        System.out.println("Menor número: " + menor + ", posição: " + posicaoMenor);
    }
}
