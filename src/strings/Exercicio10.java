package strings;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        String[] extenso = {"ZERO", "UM", "DOIS", "TRÊS", "QUATRO", "CINCO", "SEIS", "SETE", "OITO", "NOVE"};

        System.out.print("Informe um número: ");
        numero = scan.nextInt();

        String numeroString = String.valueOf(numero);

        for (int i = 0; i < numeroString.length(); i++) {
            int digito = numeroString.charAt(i) - '0';
            System.out.print(extenso[digito]);

            if (i < numeroString.length() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
}
