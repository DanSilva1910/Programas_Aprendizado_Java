import java.security.SecureRandom;

public class RollDiel {
    public static void main(String[] args) {

        // o objeto randomNumber produzirá números aleatórios seguros
        SecureRandom randomNumbers = new SecureRandom();

        int[] frequency = new int[7]; // array de contadores de frequência

        // faz o loop 6.000.000 vezes
        for (int rol = 1; rol <= 6000000; rol++) {

            ++frequency[1 + randomNumbers.nextInt(6)];
        }

        System.out.printf("%s%10s%n", "face", "Frequency");

        // gera a saída do valor de cada elemento do array
        for (int face = 1; face < frequency.length; face++) {
            System.out.printf("%s%10s%n", face, frequency[face]);

        }

    }

}
