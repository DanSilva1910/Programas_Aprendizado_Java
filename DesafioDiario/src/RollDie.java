import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {

        // o objeto randomNumber produzirá números aleatórios seguros
        SecureRandom randomNumbers = new SecureRandom();

        int frequency1 = 0; // contagem de 1s lancados
        int frequency2 = 0; // contagem de 2s lancados
        int frequency3 = 0; // contagem de 3s lancados
        int frequency4 = 0; // contagem de 4s lancados
        int frequency5 = 0; // contagem de 5s lancados
        int frequency6 = 0; // contagem de 6s lancados

        // faz o loop 6.000.000 vezes
        for (int counter = 1; counter <= 6000000; counter++) {
            // seleciona o inteiro aleatorio entre 1 e 6
            int face = 1 + randomNumbers.nextInt(6);

            switch (face) {

                case 1:
                    ++frequency1; // incrementa o contador de frequência 1s
                    break;
                case 2:
                    ++frequency2; // incrementa o contador de frequência 2s
                    break;
                case 3:
                    ++frequency3; // incrementa o contador de frequência 3s
                    break;
                case 4:
                    ++frequency4; // incrementa o contador de frequência 4s
                    break;
                case 5:
                    ++frequency5; // incrementa o contador de frequência 5s
                    break;
                case 6:
                    ++frequency6; // incrementa o contador de frequência 6s
                    break;
            }

        }

        System.out.println("Face\tFrequency");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frequency1, frequency2, frequency3,
                frequency4, frequency5, frequency6);

    }

}
