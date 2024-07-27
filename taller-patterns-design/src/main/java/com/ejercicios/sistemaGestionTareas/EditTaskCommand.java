package main.java.com.ejercicios.sistemaGestionTareas;

public class EditTaskCommand implements Command {
   
    private Task oldTask;
    private Task newTask;
    private TaskManager taskManager;

    public EditTaskCommand(Task oldTask, Task newTask, TaskManager taskManager) {
        this.oldTask = oldTask;
        this.newTask = newTask;
        this.taskManager = taskManager;
    }

    @Override
    public void execute() {
        taskManager.updateTask(oldTask, newTask);
    }

    @Override
    public void undo() {
        taskManager.updateTask(newTask, oldTask);
    }
}

