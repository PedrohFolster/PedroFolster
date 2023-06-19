package strings;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe uma frase para obter a quantidade de vogais presentes: ");
        String frase = scan.nextLine();

        System.out.println("A frase apresenta:");
        System.out.println("Vogal 'a': " + contarVogal(frase, 'a'));
        System.out.println("Vogal 'e': " + contarVogal(frase, 'e'));
        System.out.println("Vogal 'i': " + contarVogal(frase, 'i'));
        System.out.println("Vogal 'o': " + contarVogal(frase, 'o'));
        System.out.println("Vogal 'u': " + contarVogal(frase, 'u'));
    }

    public static int contarVogal(String frase, char vogal) {
        int count = 0;
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == vogal) {
                count++;
            }
        }
        return count;
    }
}
