import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            TaskRepository repository = new TaskRepository();
            int option;
            
            do {
                System.out.println("\n==== BOARD DE TAREFAS ====");
                System.out.println("1. Adicionar nova tarefa");
                System.out.println("2. Listar todas as tarefas");
                System.out.println("3. Alterar status de uma tarefa");
                System.out.println("4. Remover uma tarefa");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                option = scanner.nextInt();
                scanner.nextLine(); // limpar buffer
                
                switch (option) {
                    case 1:
                        System.out.print("Digite o título da tarefa: ");
                        String title = scanner.nextLine();
                        repository.addTask(title);
                        System.out.println("Tarefa adicionada com sucesso.");
                        break;
                        
                    case 2:
                        System.out.println("\n--- Tarefas ---");
                        if (repository.getAllTasks().isEmpty()) {
                            System.out.println("Nenhuma tarefa cadastrada.");
                        } else {
                            for (Task task : repository.getAllTasks()) {
                                System.out.println(task);
                            }
                        }
                        break;
                        
                    case 3:
                        System.out.print("Digite o ID da tarefa para alterar o status: ");
                        int idToggle = scanner.nextInt();
                        repository.toggleTaskStatus(idToggle);
                        break;
                        
                    case 4:
                        System.out.print("Digite o ID da tarefa para remover: ");
                        int idRemove = scanner.nextInt();
                        repository.deleteTask(idRemove);
                        break;
                        
                    case 0:
                        System.out.println("Saindo do sistema...");
                        break;
                        
                    default:
                        System.out.println("Opção inválida!");
                }
            } while (option != 0);
        }
    }
}
