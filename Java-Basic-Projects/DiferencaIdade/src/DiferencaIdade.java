import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = input.nextLine();
        
        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = input.nextInt();
        input.nextLine(); // Limpar buffer
        
        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = input.nextLine();
        
        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = input.nextInt();
        
        int diferenca = Math.abs(idade1 - idade2);
        
        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + diferenca + " anos.");
        
        input.close();
    }
}
