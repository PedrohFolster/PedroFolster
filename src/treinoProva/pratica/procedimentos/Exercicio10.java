package treinoProva.pratica.procedimentos;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] numeroPorExtenso = {"ZERO", "UM", "DOIS", "TRÊS", "QUATRO", "CINCO", "SEIS", "SETE", "OITO", "NOVE"};
        int numero;

        System.out.print("Informe um número para obter o mesmo por extenso: ");
        numero = scan.nextInt();

        String numeroString = String.valueOf(numero);

        for (int i = 0; i < numeroString.length(); i++) {
            int digito = numeroString.charAt(i) - '0';
            System.out.print(numeroPorExtenso[digito]);

            if (i < numeroString.length() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

    }
}
