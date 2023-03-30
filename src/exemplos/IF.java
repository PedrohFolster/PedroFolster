package exemplos;

import java.util.Scanner;

public class IF {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número inteiro: ");
        numero = scan.nextInt();

        if (numero >= 0) {
            System.out.println("O número digitado é positivo!");
        } else {
            System.out.println("O valor digitado é negativo!");
        }
    }
}
