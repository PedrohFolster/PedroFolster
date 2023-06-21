package strings.novos;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String verbo;

        System.out.print("Informe um verbo terminado em AR: ");
        verbo = scan.nextLine();

        conjugarPresente(verbo);

    }

    private static void conjugarPresente(String verbo) {

        if (verbo.endsWith("ar")) {
            System.out.println();

            String radical = verbo.substring(0, verbo.length() - 2);

            System.out.println("Eu " + radical + "ei");
            System.out.println("Tu " + radical + "as");
            System.out.println("Nós " + radical + "amos");
            System.out.println("Vós " + radical + "ais");
            System.out.println("Eles " + radical + "am");
        } else {
            System.out.println("Você não informou um verbo terminado em 'AR'");
        }
    }
}
