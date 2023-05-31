package exercicio_array.extras;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double [] altura = new double[10];
        double totalAltura = 0;
        double mediaAltura = 0;
        int counter = 0;

        for (int i = 0; i < altura.length; i++) {
            System.out.print("Informe a altura do salto do " + (i + 1) + "° competidor: ");
            altura[i] = scan.nextDouble();

            totalAltura += altura[i];
        }

        mediaAltura = totalAltura / altura.length;

        System.out.println();

        System.out.print("Segue os saltos que ficaram abaixo da média:");

        for (int i = 0; i < altura.length; i++) {
            if (altura[i] < mediaAltura) {
                System.out.print(" (" + altura[i] + ") ");
                counter++;
            }
        }

        System.out.println();

        System.out.println("A altura média dos saltos é de: " + mediaAltura + " metro(s)!");
        System.out.println(counter + " competidores ficaram abaixo da altura média dos saltos!");
    }
}