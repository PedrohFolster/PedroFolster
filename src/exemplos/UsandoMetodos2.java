package exemplos;

import java.util.Scanner;

public class UsandoMetodos2 {

    public static void main(String[] args) {

        String nome = lerNome();
        System.out.println("Nome: " + nome);
        System.out.println();

        String sobrenome = lerSobrenome();
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println();

        System.out.println("Nome e sobrenome: " + nome + " " + sobrenome);
    }

    public static String lerSobrenome() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe seu sobrenome: ");
        return scan.nextLine();
    }

    public static String lerNome() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe seu primeiro nome: ");
        return scan.nextLine();
    }
}
