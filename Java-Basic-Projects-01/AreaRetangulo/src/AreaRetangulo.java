import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.print("Digite a base do retângulo: ");
            double base = input.nextDouble();

            System.out.print("Digite a altura do retângulo: ");
            double altura = input.nextDouble();

            double area = base * altura;

            System.out.println("A área do retângulo é: " + area);
        }
    }
}
