import java.util.Scanner;

public class atv04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char resposta;
        int tentativas = 0;
        boolean acertou = false;

        do {
            tentativas++;

            // Enunciado da questão
            System.out.println("\nQuestão (Matemática):");
            System.out.println("Qual é o valor de π (pi) aproximadamente?");
            System.out.println("(a) 2.14");
            System.out.println("(b) 3.14");
            System.out.println("(c) 4.13");
            System.out.println("(d) 3.41");
            System.out.println("(e) 2.71");

            System.out.print("Escolha uma alternativa: ");
            resposta = scanner.next().toLowerCase().charAt(0);

            // Estrutura switch
            switch (resposta) {
                case 'b':
                    System.out.println("Resposta correta!");
                    System.out.println("Você acertou na tentativa " + tentativas + ".");
                    acertou = true;
                    break;

                case 'a':
                case 'c':
                case 'd':
                case 'e':
                    System.out.println("Resposta incorreta.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    tentativas--; // não conta tentativa inválida
            }

        } while (!acertou && tentativas < 3);

        if (!acertou && tentativas == 3) {
            System.out.println("\nResposta incorreta nas 3 tentativas.");
        }

        scanner.close();
    }
}