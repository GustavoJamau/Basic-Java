import java.time.Year;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Solicita o nome do usuário
            System.out.print("Digite seu nome: ");
            String nome = input.nextLine();

            // Solicita o ano de nascimento
            System.out.print("Digite seu ano de nascimento: ");
            int anoNascimento = input.nextInt();

            // Calcula a idade
            int anoAtual = Year.now().getValue();
            int idade = anoAtual - anoNascimento;

            // Exibe a mensagem com o nome e a idade
            System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
        }
    }
}
