package strings;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String verbo;

        System.out.print("Informe um verbo terminado em AR: ");
        verbo = scan.nextLine();

        System.out.println();

        if (verbo.endsWith("ar")) {
            String radical = verbo.substring(0, verbo.length() - 2);

            System.out.println("Conjugação no tempo presente:");
            System.out.println("Eu " + radical + "o");
            System.out.println("Tu " + radical + "as");
            System.out.println("Ele " + radical + "a");
            System.out.println("Nós " + radical + "amos");
            System.out.println("Vós " + radical + "ais");
            System.out.println("Eles " + radical + "am");
        } else {
            System.out.println("O verbo digitado não está no formato correto.");
        }
    }
}
