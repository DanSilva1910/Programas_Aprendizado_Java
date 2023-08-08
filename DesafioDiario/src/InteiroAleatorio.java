import java.security.SecureRandom;

public class InteiroAleatorio {

    public static void main(String[] args) {

        // o objeto randomNumber produzirá números aleatórios seguros
        SecureRandom randomNumbers = new SecureRandom();
        // faz o loop 20 vezes
        for (int counter = 1; counter <= 20; counter++) {
            // seleciona o inteiro aleatorio entre 1 e 6
            int face = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d ", face);

            if (counter % 5 == 0) {
                System.out.println();
            }

        }
    }

}
