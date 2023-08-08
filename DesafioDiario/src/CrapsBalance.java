import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsBalance {

    // o objeto randomNumber produzirá números aleatórios seguros
    private static final SecureRandom randomNumbers = new SecureRandom();

    // tipo enum com constantes que representam o estado do jogo
    private enum Status {
        CONTINUE, WON, LOST
    }

    // constantes que representam lancamnetos comuns dos dados
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {

        int myPoint = 0; // pontos se não ganhar ou perder na primeira rolagem
        Status gameStatus; // pode conter CONTINUE WON ou LOST

        double bankBalance = 1000; // caixa para as apostas

        Scanner sc = new Scanner(System.in);

        while (bankBalance > 0) {

            System.out.printf("Insira um valor para apostar, seu saldo é: $%.2f\n$", bankBalance);

            double wager = sc.nextDouble();

            while (wager > bankBalance) {

                System.out.print("Insira um valor valido para apostar $");
                wager = sc.nextDouble();
            }

            int sumOfDice = rollDice(); // primeira rolagem dos dados

            switch (sumOfDice) {

                case SEVEN: // ganha com 7 no primeiro lancamento
                case YO_LEVEN: // ganha com 11 no primeiro lancamento
                    gameStatus = Status.WON;
                    break;

                case SNAKE_EYES: // perde com 2 no primeiro lancamento
                case TREY: // perde com 3 no primeiro lancamento
                case BOX_CARS: // perde com 12 no primeiro lancamento
                    gameStatus = Status.LOST;
                    break;

                default: // não ganhou nem perdeu portanto registra a pontuacão
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice; // informa a pontuacão
                    System.out.printf("Point is %d%n", myPoint);
                    break;
            }
            // enquanto o jogo não estiver completo
            while (gameStatus == Status.CONTINUE) {

                sumOfDice = rollDice(); // lanca novamente os dados

                // determina o estado do jogo
                if (sumOfDice == myPoint) {
                    gameStatus = Status.WON;
                } else if (sumOfDice == SEVEN) {
                    gameStatus = Status.LOST;

                }

            }

            // exibe mensagem ganhou ou perdeu
            if (gameStatus == Status.WON) {

                bankBalance += wager;
                System.out.println("Player Win the new balance is: " + bankBalance);

                if (bankBalance >= 1000 && bankBalance <= 2000) {

                    System.out.println("Ah, vamos lá, dê uma chance para sua sorte");
                } else if (bankBalance > 5000) {
                    System.out.println(
                            "Você está montado na grana. Agora é hora de trocar essas fichas e embolsar o dinheiro!");
                }
            } else {
                bankBalance -= wager;

                System.out.println("Player Lose the new balance is: " + bankBalance);

                if (bankBalance == 0) {
                    System.out.println("Seu Saldo acabou compre mais fichas para continuar a diversão!!!");
                } else if (bankBalance <= 500) {

                    System.out.println("Oh, parece que você vai quebrar, hein?");
                }
            }

            // sc.close();

        }

        sc.close();
    }

    public static int rollDice() {
        int diel1 = 1 + randomNumbers.nextInt(6);
        int diel2 = 1 + randomNumbers.nextInt(6);
        int sum = diel1 + diel2;
        System.out.printf("Player rolled %d + %d = %d%n", diel1, diel2, sum);

        return sum;

    }

}
