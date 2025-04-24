import java.util.Scanner;

public class CalculadoraDeMedias {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            // Solicita a quantidade de alunos
            System.out.print("Quantos alunos? ");
            int quantidade = scan.nextInt();
            scan.nextLine(); // Limpa o buffer após nextInt

            // Criação dos arrays para armazenar nomes e notas
            String[] alunos = new String[quantidade];
            double[] notas = new double[quantidade];

            // Coleta os nomes dos alunos
            for (int i = 0; i < quantidade; i++) {
                System.out.printf("Nome do aluno %d: ", i + 1);
                alunos[i] = scan.nextLine();
            }

            // Coleta as notas dos alunos e calcula a soma
            double soma = 0;
            for (int i = 0; i < quantidade; i++) {
                System.out.printf("Nota de %s: ", alunos[i]);
                notas[i] = scan.nextDouble();
                soma += notas[i];
            }

            // Calcula e exibe a média da turma
            double media = soma / quantidade;
            System.out.printf("\nMédia da turma: %.1f\n", media);
        }
    }
}
