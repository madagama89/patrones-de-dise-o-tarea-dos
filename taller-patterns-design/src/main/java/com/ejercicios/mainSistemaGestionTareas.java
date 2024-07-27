package main.java.com.ejercicios;

import main.java.com.ejercicios.sistemaGestionTareas.Command;
import main.java.com.ejercicios.sistemaGestionTareas.CommandInvoker;
import main.java.com.ejercicios.sistemaGestionTareas.CompleteTaskCommand;
import main.java.com.ejercicios.sistemaGestionTareas.CreateTaskCommand;
import main.java.com.ejercicios.sistemaGestionTareas.EditTaskCommand;
import main.java.com.ejercicios.sistemaGestionTareas.Task;
import main.java.com.ejercicios.sistemaGestionTareas.TaskManager;

public class mainSistemaGestionTareas {

    public static void main(String[] args) {
        
        TaskManager taskManager = new TaskManager();
        CommandInvoker commandInvoker = new CommandInvoker();

        Task task1 = new Task("Task 1");
        Command createTask1 = new CreateTaskCommand(task1, taskManager);
        commandInvoker.executeCommand(createTask1);

        Task task2 = new Task("Task 2");
        Command createTask2 = new CreateTaskCommand(task2, taskManager);
        commandInvoker.executeCommand(createTask2);

        Task updatedTask1 = new Task("Updated Task 1");
        Command editTask1 = new EditTaskCommand(task1, updatedTask1, taskManager);
        commandInvoker.executeCommand(editTask1);

        Command completeTask1 = new CompleteTaskCommand(updatedTask1, taskManager);
        commandInvoker.executeCommand(completeTask1);

        // Imprimir tareas actuales
        System.out.println("Tareas actuales:");
        for (Task task : taskManager.getTasks()) {
            System.out.println(task.getName() + " - Completed: " + task.isCompleted());
        }

        // Deshacer la última acción
        commandInvoker.undoCommand();

        // Imprimir tareas después de deshacer
        System.out.println("Tareas después de deshacer la última acción:");
        for (Task task : taskManager.getTasks()) {
            System.out.println(task.getName() + " - Completed: " + task.isCompleted());
        }
    }

}
