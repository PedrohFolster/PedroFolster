package exemplos;

import java.util.Arrays;
import java.util.Scanner;

public class array3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] inserirValor = {12,22,33,41,57,66,75};
        int numeroEscolhido;

        System.out.println("O tamanho do array é de: " + inserirValor.length);
        System.out.print("Insira um número para buscar os valores do array " + Arrays.toString(inserirValor) + ": ");
        numeroEscolhido = scan.nextInt();

        System.out.println("O número escolhido foi: " + inserirValor[numeroEscolhido - 1]);

    }
}
