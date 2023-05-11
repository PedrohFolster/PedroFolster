package treinoProva.condicionais;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double maca = 1.3;
        double macaMais12 = 1;
        int quantidade;

        System.out.println("Informe a quantidade de maças compradas: ");
        quantidade = scan.nextInt();

        if (quantidade >= 12) {
            double totalMais12 = quantidade * macaMais12;
            System.out.println("Valor total: " + totalMais12);
        } else if (quantidade < 12) {
            double totalMenos12 = quantidade * maca;
            System.out.println("Valor total: " + totalMenos12);
        }
    }
}
