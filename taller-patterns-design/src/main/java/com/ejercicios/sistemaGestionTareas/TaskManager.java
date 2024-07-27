package main.java.com.ejercicios.sistemaGestionTareas;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void updateTask(Task oldTask, Task newTask) {
        int index = tasks.indexOf(oldTask);
        if (index != -1) {
            tasks.set(index, newTask);
        }
    }

    public void completeTask(Task task) {
        task.setCompleted(true);
    }

    public void uncompleteTask(Task task) {
        task.setCompleted(false);
    }

    public List<Task> getTasks() {
        return tasks;
    }
}

