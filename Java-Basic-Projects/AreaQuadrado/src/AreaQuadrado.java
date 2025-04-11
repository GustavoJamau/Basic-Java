import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            // Solicita o valor do lado do quadrado
            System.out.print("Digite o valor do lado do quadrado: ");
            double lado = input.nextDouble();

            // Calcula a área (lado * lado)
            double area = lado * lado;

            // Exibe o resultado
            System.out.println("A área do quadrado é: " + area);
        }
    }
}
