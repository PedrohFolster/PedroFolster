package exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a idade em anos: ");
        int anos = scan.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = scan.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = scan.nextInt();

        int idadeEmDias = anos * 365 + meses * 30 + dias;
        System.out.println("A idade em dias é: " + idadeEmDias + " dias");

    }
}