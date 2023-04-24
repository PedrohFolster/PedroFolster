package lista_repeticao.extras;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int livros;
        String nome;
        int quantidadeEmprestado;
        int maiorEmprestado = Integer.MIN_VALUE;
        String livroMaisEmprestado = "";

        System.out.print("Informe a quantidade de livros na biblioteca: ");
        livros = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i <= livros; i++) {
            System.out.print("Informe o nome do " + i + "° livro: ");
            nome = scan.nextLine();

            System.out.print("Informe a quantidade de vezes que esse livro foi emprestado: ");
            quantidadeEmprestado = scan.nextInt();
            scan.nextLine();

            if (quantidadeEmprestado > maiorEmprestado) {
                maiorEmprestado = quantidadeEmprestado;
                livroMaisEmprestado = nome;
            }
        }
        System.out.println("\nO livro mais emprestado foi o " + livroMaisEmprestado + ".");
    }
}
