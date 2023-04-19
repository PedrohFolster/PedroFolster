package lista_repeticao;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor inteiro entre 1 e 10: ");
        int valor = scan.nextInt();

        while (valor < 1 || valor > 10) {
            System.out.print("Valor inválido. Digite novamente: ");
            valor = scan.nextInt();
        }

        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println(valor + " X " + i + " = " + (valor * i));
        }
    }
}