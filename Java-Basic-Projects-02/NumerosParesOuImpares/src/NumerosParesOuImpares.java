import java.util.Scanner;

public class NumerosParesOuImpares {
    public static void main(String[] args) {
        // Criando o Scanner para entrada do usuário
        try (Scanner input = new Scanner(System.in)) {

            // Entrada do primeiro número
            System.out.print("Digite o primeiro número: ");
            int primeiro = input.nextInt();

            // Entrada do segundo número (deve ser maior que o primeiro)
            System.out.print("Digite o segundo número (maior que o primeiro): ");
            int segundo = input.nextInt();

            // Validação
            if (segundo <= primeiro) {
                System.out.println("O segundo número deve ser maior que o primeiro.");
                return;
            }

            // Escolha entre par ou ímpar
            System.out.print("Você quer ver os números (par/impar)? ");
            String escolha = input.next().toLowerCase();

            // Exibição do resultado
            System.out.println("\nNúmeros " + escolha + " no intervalo, em ordem decrescente:");

            // Laço decrescente
            for (int i = segundo; i >= primeiro; i--) {
                if (escolha.equals("par") && i % 2 == 0) {
                    System.out.println(i);
                } else if (escolha.equals("impar") && i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
