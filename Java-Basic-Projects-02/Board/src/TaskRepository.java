import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    private final List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public void addTask(String title) {
        Task task = new Task(nextId++, title);
        tasks.add(task);
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public void toggleTaskStatus(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.toggleStatus();
                return;
            }
        }
        System.out.println("Tarefa com ID " + id + " não encontrada.");
    }

    public void deleteTask(int id) {
        boolean removed = tasks.removeIf(task -> task.getId() == id);
        if (!removed) {
            System.out.println("Tarefa com ID " + id + " não encontrada.");
        }
    }
}
