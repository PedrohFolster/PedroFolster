package strings.novos;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String frase;

        System.out.print("Informe uma frase para obter a quantidade de vogais presentes: ");
        frase = scan.nextLine();

        System.out.println("Vogal 'A'" + contabilizarVogal(frase, 'a'));
        System.out.println("Vogal 'E'" + contabilizarVogal(frase, 'e'));
        System.out.println("Vogal 'I'" + contabilizarVogal(frase, 'i'));
        System.out.println("Vogal 'O'" + contabilizarVogal(frase, 'o'));
        System.out.println("Vogal 'U'" + contabilizarVogal(frase, 'u'));

    }

    public static int contabilizarVogal(String frase, char vogal) {

        int counter = 0;
        frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == vogal) {
                counter++;
            }
        }
        return counter;
    }
}
