import java.util.Scanner;

public class NameAndYears {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;
        String name;

        while(true) {
            System.out.println("\nNome: ");
            name = scan.next();

            System.out.println("\nIdade: ");
            idade = scan.nextInt();

            System.out.println("\nO nome definido foi: " + name + "\nSua idade é: " + idade + "\n");
        }
    }
}
