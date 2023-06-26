package treinoProva.pratica.procedimentos;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioDecrescente {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] array = new int[10];
        int alternativa;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");
            array[i] = scan.nextInt();
        }

        System.out.println();
        System.out.print("Escolha entre as opções abaixo:\n" +
                "1 - Forma crescente\n" +
                "2 - Forma decrescente\n" +
                "" +
                "Informe a sua escolha: ");
        alternativa = scan.nextInt();

        if (alternativa == 1) {
            System.out.println("Array ordenado na forma crescente " + Arrays.toString(arrayFormaCrescente(array)));
        } else if (alternativa == 2) {
            System.out.println("Array ordenado na forma decrescente " + Arrays.toString(arrayFormaDecrescente(array)));
        } else {
            System.out.println("Você informou um número inválido!");
        }

    }

    private static int[] arrayFormaDecrescente(int[] array) {
        Arrays.sort(array);
        int [] formaDecrescente = new int[array.length];

        for (int i = 0; i < formaDecrescente.length; i++) {
            formaDecrescente[i] = array[array.length - 1 - i];
        }
        return formaDecrescente;
    }

    private static int[] arrayFormaCrescente(int[] array) {
        Arrays.sort(array);
        return array;
    }
}