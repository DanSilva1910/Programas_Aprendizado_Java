import java.util.Random;
import java.util.Scanner;

public class MontyHallSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simulação do Jogo das Portas de Monty Hall");
        System.out.println("Escolha o número de simulações:");
        int numSimulations = scanner.nextInt();

        int stayWins = 0;
        int switchWins = 0;

        for (int i = 0; i < numSimulations; i++) {
            int prizeDoor = new Random().nextInt(3) + 1; // Número da porta com o prêmio (1, 2 ou 3)
            int playerChoice = new Random().nextInt(3) + 1; // Escolha inicial do jogador (1, 2 ou 3)

            int hostOpen = getHostOpen(prizeDoor, playerChoice);

            // Mudar de escolha (switch)
            int switchedChoice = getSwitchedChoice(playerChoice, hostOpen);

            // Verificar se a escolha inicial (stay) ou a escolha mudada (switch) acertou o
            // prêmio
            if (playerChoice == prizeDoor) {
                stayWins++;
            }

            if (switchedChoice == prizeDoor) {
                switchWins++;
            }
        }

        System.out.println("Resultados após " + numSimulations + " simulações:");
        System.out.println(
                "Probabilidade de acerto ao manter a escolha inicial (stay): " + (double) stayWins / numSimulations);
        System.out.println(
                "Probabilidade de acerto ao mudar a escolha (switch): " + (double) switchWins / numSimulations);

        scanner.close();
    }

    private static int getHostOpen(int prizeDoor, int playerChoice) {
        // O apresentador (host) abre uma das portas erradas que não contém o prêmio
        int hostOpen;
        do {
            hostOpen = new Random().nextInt(3) + 1;
        } while (hostOpen == prizeDoor || hostOpen == playerChoice);

        return hostOpen;

    }

    private static int getSwitchedChoice(int playerChoice, int hostOpen) {
        // O jogador muda de escolha para uma das portas restantes
        int switchedChoice;
        do {
            switchedChoice = new Random().nextInt(3) + 1;
        } while (switchedChoice == playerChoice || switchedChoice == hostOpen);

        return switchedChoice;
    }
}
