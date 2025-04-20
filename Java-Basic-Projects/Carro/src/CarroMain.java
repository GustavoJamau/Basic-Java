import java.util.Scanner;

public class CarroMain {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ligar");
            System.out.println("2. Desligar");
            System.out.println("3. Acelerar");
            System.out.println("4. Frear");
            System.out.println("5. Virar");
            System.out.println("6. Ver Velocidade");
            System.out.println("7. Trocar Marcha");
            System.out.println("8. Acelerada Forte (10km)");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> carro.ligar();
                case 2 -> carro.desligar();
                case 3 -> carro.acelerar();
                case 4 -> carro.frear();
                case 5 -> {
                    System.out.print("Virar para (esquerda/direita): ");
                    String direcao = scanner.next();
                    carro.virar(direcao);
                }
                case 6 -> carro.verificarVelocidade();
                case 7 -> {
                    System.out.print("Digite a nova marcha (0 a 6): ");
                    int marcha = scanner.nextInt();
                    carro.trocarMarcha(marcha);
                }
                case 8 -> carro.acelerarForte();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
