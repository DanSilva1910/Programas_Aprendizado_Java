import java.util.Scanner;

public class DadosVendas {

    public static void main(String[] args) {
        double valor = 0;
        double largest = 0;
        double media = 0;
        double smaller = 0;
        double j = 0;

        Scanner sc = new Scanner(System.in);

        for (int counter = 1; counter <= 10; counter++) {

            System.out.println("Imprima o valor de Vendas: ");
            valor = sc.nextDouble();

            if (counter == 1) {

                largest = valor;
                smaller = valor;
            }

            j += valor;

            if (largest < valor) {
                largest = valor;
            }

            if (smaller > valor) {
                smaller = valor;
            }

        }

        media = j / 10;

        System.out.printf(
                "\nO maior valo em vendas é: $%.2f\nO menor valor em vendas é: $%.2f\nA média por vendedor é: $%.2f\n.",
                largest, smaller, media);

        sc.close();

    }

}
