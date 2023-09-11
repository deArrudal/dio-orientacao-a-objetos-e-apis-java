package main.list.operators;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description) {
        taskList.add(new Task(description));
    }

    public void removeTask(String description) {
        List<Task> removeTaskList = new ArrayList<>();

        if (!taskList.isEmpty()) {
            for (Task task : taskList) {
                if (task.getDescription().equalsIgnoreCase(description)) {
                    removeTaskList.add(task);
                }
            }

            taskList.removeAll(removeTaskList);

        } else {
            System.out.println("Empty list");
        }
    }

    public int countTask() {
        return taskList.size();
    }

    public void showDescriptionTask() {
        if (!taskList.isEmpty()) {
            System.out.println(taskList);
        } else {
            System.out.println("Empty list");
        }
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        taskList.addTask("Buy milk");
        taskList.addTask("Study for the test");
        taskList.addTask("Do cardio");
        taskList.addTask("Buy magazines");

        System.out.println(taskList.countTask());

        taskList.showDescriptionTask();

        taskList.removeTask("Work");

        System.out.println(taskList.countTask());

        taskList.showDescriptionTask();

        taskList.removeTask("Buy magazines");

        System.out.println(taskList.countTask());

        taskList.showDescriptionTask();
    }
}