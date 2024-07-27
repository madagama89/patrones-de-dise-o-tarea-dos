package main.java.com.ejercicios.sistemaGestionTareas;

public class CompleteTaskCommand implements Command {
    
    private Task task;
    private TaskManager taskManager;

    public CompleteTaskCommand(Task task, TaskManager taskManager) {
        this.task = task;
        this.taskManager = taskManager;
    }

    @Override
    public void execute() {
        taskManager.completeTask(task);
    }

    @Override
    public void undo() {
        taskManager.uncompleteTask(task);
    }
}

