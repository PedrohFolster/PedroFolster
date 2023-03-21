package exercicios;

import java.util.Scanner;

public class Feira {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double quiloMaca;
        double precoMaca;
        double quiloLaranja;
        double precoLaranja;

        System.out.println("Quantidade de quilos de Maça: ");
        quiloMaca = scan.nextDouble();

        System.out.println("Valor do preço do quilo da maça: ");
        precoMaca = scan.nextDouble();

        System.out.println("Quantidade de quilos de Laranja: ");
        quiloLaranja = scan.nextDouble();

        System.out.println("Valor do preço do quilo da laranja: ");
        precoLaranja = scan.nextDouble();

        System.out.println("Quilos de maça: " + quiloMaca);
        System.out.println("Preço da maça: " + precoMaca);
        System.out.println("Quilos de laranja: " + quiloLaranja);
        System.out.println("Preço da laranja: " + precoLaranja);

        double totalLaranja = (quiloLaranja * precoLaranja);
        double totalMaca = (quiloMaca * precoMaca);

        System.out.println("Valor total gasto na feira: R$ " + (totalLaranja + totalMaca));

//        System.out.println("Java foi a feira e comprou 1kg de maça de maça a 7,25 reais o quilo e 3 quilos de laranja a 5,5 reais, o quilo.");
//        System.out.println("O valor total gasto na feira foi de: " + (maca + laranja) + ".");
    }
}