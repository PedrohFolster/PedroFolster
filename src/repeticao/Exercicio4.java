package repeticao;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = 1;
        String nome;

        System.out.print("Insira seu nome: ");
        nome = scan.nextLine();

        System.out.print("Insira um número N, esse número irá definir quantas vezes o nome definido acima irá aparecer para o usuário. Numero: ");
        number = scan.nextInt();

        System.out.println();
        for (int i = 1; i <= number; i++) {
            System.out.println(nome);
        }

    }
}