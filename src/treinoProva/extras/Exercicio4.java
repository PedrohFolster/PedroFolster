package treinoProva.extras;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidadeLivros, vezesEmprestado, contador = 0, maisEmprestado = Integer.MIN_VALUE;
        String nomeLivro, livroMaisEmprestado = "", alternativa;

        do {
            System.out.print("Quantos livros você deseja adicionar? ");
            quantidadeLivros = scan.nextInt();
            scan.nextLine();

            for (int i = 1; i <= quantidadeLivros; i++) {
                contador++;
                System.out.println();
                System.out.print("Qual o nome do " + contador + "° livro? ");
                nomeLivro = scan.nextLine();

                System.out.print("Quantas vezes o " + contador + "° livro foi emprestado? ");
                vezesEmprestado = scan.nextInt();
                scan.nextLine();

                if (vezesEmprestado > maisEmprestado) {
                    maisEmprestado = vezesEmprestado;
                    livroMaisEmprestado = nomeLivro;
                }
            }
            System.out.println("Você deseja adicionar mais algum livro?\n" +
                    "S - Sim, desejo adicionar mais livros!\n" +
                    "N - Não, desejo finalizar!");
            alternativa = scan.next();

            if (alternativa.equalsIgnoreCase("N")) {
                System.out.println("O livro mais emprestado foi " + livroMaisEmprestado + ", sendo emprestado por " + maisEmprestado + " vezes!");
                break;
            }
        } while (quantidadeLivros > contador || alternativa.equalsIgnoreCase("S"));

    }
}
