package duke.ui;

import duke.task.Task;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is the Ui class. It handles all the strings displayed to the user.
 */

public class Ui {

    private final Scanner in;
    private final String horizontalLine = "____________________________________________________________";

    public Ui() {
        this.in = new Scanner(System.in);
    }

    public void showWelcome() {
        System.out.println("Hello! I'm Duke\nWhat can I do for you?");

    }

    public String readCommand() {
        System.out.print("Enter command: ");
        String fullCommand = in.nextLine();
        return fullCommand;
    }

    public void find(ArrayList<Task> list) {
        System.out.println("Here are the matching tasks in your list:");
        int count = 0;
        for(Task task: list) {
            count++;
            System.out.println(count + "." + task.toString());
        }
    }

    public void done(Task task) {
        System.out.println("Nice! I've marked this task as done:");
        System.out.println("  " + task.toString());
    }

    public void showLine() {
        System.out.println(horizontalLine);
    }

    public void showError(String message) {
        System.out.println(message);
    }

    public void bye() {
        System.out.println("Bye. Hope to see you again soon!");
    }

    public void list(ArrayList<Task> list) {
        System.out.println("Here are the tasks in your list:");
        int count = 0;
        for (Task task: list) {
            count++;
            System.out.println(count + ". " + task.toString());
        }
    }

    public void addTask(Task task, int numberOfTasks) {
        System.out.println("Got it. I've added this task:");
        System.out.println("  " + task.toString());
        System.out.println("Now you have " + numberOfTasks + " tasks in the list.");
    }

    public void removeTask(Task task, int numberOfTasks) {
        System.out.println("Noted. I've removed this task:");
        System.out.println("  " + task.toString());
        System.out.println("Now you have " + numberOfTasks + " tasks in the list.");
    }

    public void showLoadingError() {
        System.out.println("There is a problem loading the file. :(");
    }
}