package treinoProva.pratica.procedimentos;

import java.util.Scanner;

public class Exermplo10Novo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] extenso = {"ZERO", "UM", "DOIS", "TRÊS", "QUATRO", "CINCO", "SEIS", "SETE", "OITO", "NOVE"};
        int numero;

        System.out.print("Informe o número para obter o mesmo por extenso: ");
        numero = scan.nextInt();

        String numeroExtenso = String.valueOf(numero);

        for (int i = 0; i < numeroExtenso.length(); i++) {
            int digito = numeroExtenso.charAt(i) - '0';
            System.out.print(extenso[digito]);

            if (i < numeroExtenso.length() - 1) {
                System.out.print(", ");
            }
        }
    }
}
