package strings;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String texto, palavraProcurada, palavraTroca;

        System.out.print("Informe o texto: ");
        texto = scan.nextLine();

        System.out.print("Informe a palavra a ser procurada: ");
        palavraProcurada = scan.nextLine();

        System.out.print("Informe a palavra a ser trocada: ");
        palavraTroca = scan.nextLine();

        // Contagem das ocorrências de troca
        int ocorrenciasTroca = 0;

        // Substituição das ocorrências da palavra
        String novoTexto = texto.replace(palavraProcurada, palavraTroca);

        // Verificação se ocorreram trocas
        if (!novoTexto.equals(texto)) {
            ocorrenciasTroca = contarOcorrenciasTroca(texto, palavraProcurada, palavraTroca);
        }

        System.out.println("Texto original: " + texto);
        System.out.println("Novo texto: " + novoTexto);
        System.out.println("Ocorrências de troca: " + ocorrenciasTroca);
    }

    private static int contarOcorrenciasTroca(String texto, String palavraProcurada, String palavraTroca) {
        int ocorrencias = 0;
        int index = texto.indexOf(palavraProcurada);
        while (index != -1) {
            ocorrencias++;
            index = texto.indexOf(palavraProcurada, index + 1);
        }
        return ocorrencias;
    }
}
