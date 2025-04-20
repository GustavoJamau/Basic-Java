import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // Solicitando altura
            System.out.print("Digite sua altura (em metros): ");
            String alturaStr = input.next().replace(",", ".");
            double altura = Double.parseDouble(alturaStr);

            // Solicitando peso
            System.out.print("Digite seu peso (em kg): ");
            String pesoStr = input.next().replace(",", ".");
            double peso = Double.parseDouble(pesoStr);

            // Cálculo do IMC
            double imc = peso / (altura * altura);

            // Exibindo o resultado do IMC
            System.out.printf("Seu IMC é: %.2f\n", imc);

            // Classificação do IMC
            if (imc <= 18.5) {
                System.out.println("Abaixo do peso");
            } else if (imc <= 24.9) {
                System.out.println("Peso ideal");
            } else if (imc <= 29.9) {
                System.out.println("Levemente acima do peso");
            } else if (imc <= 34.9) {
                System.out.println("Obesidade Grau I");
            } else if (imc <= 39.9) {
                System.out.println("Obesidade Grau II (Severa)");
            } else {
                System.out.println("Obesidade III (Mórbida)");
            }
        }
    }
}
