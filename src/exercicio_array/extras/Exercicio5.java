package exercicio_array.extras;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] medalhas = new int[10];
        int medalhasMaior = Integer.MIN_VALUE;
        String [] nomePais = new String[10];
        String paisVencedor = null;
        int counter = 0;

        for (int i = 0; i < medalhas.length; i++) {
            System.out.print("Informe o nome do " + (i + 1) + "° país: ");
            nomePais[i] = scan.nextLine();

            System.out.print("Informe a quantidade de medalhas que o " + nomePais[i] + " ganhou: ");
            medalhas[i] = scan.nextInt();

            scan.nextLine();
            System.out.println();

            if (medalhasMaior < medalhas[i]) {
                medalhasMaior = medalhas[i];
                paisVencedor = nomePais[i];
            }
        }

        System.out.println();
        System.out.println("O país que ganhou mais medalhas foi o " + paisVencedor + " com " + medalhasMaior + " medalhas!");
    }
}
