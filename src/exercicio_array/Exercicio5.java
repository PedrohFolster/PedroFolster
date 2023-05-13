package exercicio_array;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double [] notas = new double[10];

        double mediaNotas = 0;
        int counter = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe a " + (i + 1) + "° nota: ");
            notas[i] = scan.nextInt();

            mediaNotas += notas[i];
        }

        double totalNotas = mediaNotas / 10;

        for (int i = 0; i < 10; i++) {
            if (notas[i] > totalNotas) {
                counter++;
            }
        }


        System.out.println("A média das notas é: " + totalNotas);
        System.out.println(counter + " aluno(s) tiraram acima da média da turma!");
    }
}
