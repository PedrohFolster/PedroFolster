package exercicios_condicionais;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int codigo = 54321;
        int usuario = 12345;
        int informeUsuario;
        int senha;

        System.out.print("Insira o seu usuário: ");
        informeUsuario = scan.nextInt();

        System.out.print("Informe sua senha: ");
        senha = scan.nextInt();

        if (usuario == informeUsuario && senha == codigo) {
            System.out.println("\nUsuario correto!");
            System.out.println("Senha correta!");

        } else if (usuario == informeUsuario && senha != codigo) {
            System.out.println("Senha incorreta, verifique suas credenciais!");
        } else {
            System.out.println("Suas credenciais estão incorretas!");
        }
    }
}
