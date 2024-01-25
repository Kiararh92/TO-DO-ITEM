import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Course: Software Development II
 * Professor: Professor Walauskis
 *
 * @author Kiara
 * @version 3.0
 */

public class Menu {

    private List list;
    private DeleteTask deleteTask;
    private AddTask addTask;
    private ArrayList<Task> ToDoList;
    private ArrayList<Integer> idList;

    Scanner scanner = new Scanner(System.in);

    public Menu(ArrayList<Task> ToDoList, ArrayList<Integer> idList, List list, DeleteTask deleteTask,
                    AddTask addTask) {
        this.idList = idList;
        this.ToDoList = ToDoList;
        this.list = list;
        this.deleteTask = deleteTask;
        this.addTask = addTask;
    }

    public void toDoMenu() {

        while(true) {

            System.out.println("Menu");
            System.out.println("1. Add an item");
            System.out.println("2. Delete an item");
            System.out.println("3. View List");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addTask.addTask();
                    break;

                case 2:
                   deleteTask.removeViaTaskNumber();
                   break;

                case 3:
                    System.out.println("To-Do List:");
                    for(Task currentTask : list.getTasks()) {
                        System.out.println(currentTask.getTaskNumber() + " " + currentTask.getTask());
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;

            }
        }
    }
}
