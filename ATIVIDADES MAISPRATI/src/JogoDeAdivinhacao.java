import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroEscolhido = random.nextInt(50) + 1;
        int palpite;

        System.out.println("Adivinhe o número entre 1 e 50.");

        do {
            System.out.print("Digite o seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite != numeroEscolhido) {
                System.out.println("O número está errado.");
            } else {
                System.out.println("Parabéns! Você acertou!");
            }
        } while (palpite != numeroEscolhido);

        scanner.close();
    }
}
