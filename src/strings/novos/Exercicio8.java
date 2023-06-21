package strings.novos;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String texto, buscar, trocar;

        System.out.print("Informe um texto: ");
        texto = scan.nextLine();

        System.out.print("Informe a palavra a ser buscada: ");
        buscar = scan.nextLine();

        System.out.print("Informe um termo para realizar a troca: ");
        trocar = scan.nextLine();

        System.out.println("O texto com as ocorrências trocadas: " + trocarOcorrencias(texto, trocar, buscar));
    }

    private static String trocarOcorrencias(String texto, String trocar, String buscar) {
        return texto.replace(buscar, trocar);
    }
}
