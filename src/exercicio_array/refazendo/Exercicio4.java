package exercicio_array.refazendo;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] numeros = new int[10];
        int menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE;
        int posicaoMenor = -1, posicaoMaior = -1;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");
            numeros[i] = scan.nextInt();

            if (numeros[i] < 0) {
                System.out.println("Você deve informar apenas números positivos!");
            }

            if (menor > numeros[i]) {
                menor = numeros[i];
                posicaoMenor = i;
            }

            if (maior < numeros[i]) {
                maior = numeros[i];
                posicaoMaior = i;
            }
        }

        System.out.println("O menor número do array é: " + menor + " e está na posição " + posicaoMenor);
        System.out.println("O maior número do array é: " + maior + " e está na posição " + posicaoMaior);

    }
}
