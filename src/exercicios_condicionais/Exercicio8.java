package exercicios_condicionais;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int codigo = 54321;
        int usuario = 12345;
        int informeUsuario;
        int senha;

        System.out.println("informe o usuario");
        informeUsuario = scan.nextInt();

        if (informeUsuario == usuario) {
            System.out.println("usuario correta");
            System.out.println("informe a senha");
            senha = scan.nextInt();

            if (codigo == senha) {
                System.out.println("senha correta");
                System.out.println("acesso permitido");

            } else {
                System.out.println("senha incorreto");
                System.out.println("acesso negado");
            }
        } else {
            System.out.println("usuario incorreto");
            System.out.println("acesso negado");
        }


    }
}
