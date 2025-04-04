import java.util.Scanner;

public class CalculadoraDeMedias {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        // Chama a função que calcula a média da turma
        double media = calculaMediaDaTurma(alunos, scan);

        // Exibe a média da turma
        System.out.printf("Média da turma: %.1f\n", media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;

        // Loop para coletar as notas dos alunos
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        // Calcula e retorna a média
        return soma / alunos.length;
    }
}