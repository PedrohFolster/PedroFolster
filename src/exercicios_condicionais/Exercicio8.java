package exercicios_condicionais;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int codigo = 54321;
        int usuario = 12345;
        int informeUsuario;
        int senha;

        System.out.println("Insira o seu usuário: ");
        informeUsuario = scan.nextInt();

        System.out.println("Informe sua senha: ");
        senha = scan.nextInt();

        if (usuario == informeUsuario && senha == codigo) {
            System.out.println("Usuario correto!");
            System.out.println("Senha correta!");
        } else {
            System.out.println("Suas credenciais estão incorretas!");
        }
    }
}
