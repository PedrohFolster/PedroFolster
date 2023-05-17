package exercicio_array.extras;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] andares = new int[10];
        int totalAndares = 0;
        int counter = 0;

        for (int i = 0; i < andares.length; i++) {
            System.out.print("Insira quantos andares tem o " + (i + 1) + "° prédio: ");
            andares[i] = scan.nextInt();

            totalAndares += andares[i];

            if (andares[i] > 10) {
                counter++;
            }
        }

        System.out.println();
        System.out.println("O total da andares presente nos dez prédios é de: " + totalAndares + " andares!");
        System.out.println("Há " + counter + " prédios com mais de dez andares!");
    }
}
