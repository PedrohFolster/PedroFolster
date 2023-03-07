import java.util.Scanner;

public class NameAndYears {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int Idade;
        String Name;

        while(true) {
            System.out.println("\nNome: ");
            Name = scan.next();

            System.out.println("\nIdade: ");
            Idade = scan.nextInt();

            System.out.println("\nO nome definido foi: " + Name + "\nSua idade é: " + Idade + "\n");
        }
    }
}
