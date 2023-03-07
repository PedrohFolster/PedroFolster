import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Numero;

        while(true) {
            System.out.println("\nNúmero:");
            Numero = scan.nextInt();

            System.out.println("Tabuada de " + Numero + ":");

            for (int i = 0; i <= 10; i = i + 1) {
                System.out.println(Numero + " X " + i + " = " + (Numero * i));
            }
        }
    }
}
