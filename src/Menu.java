import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Course: Software Development II
 * Professor: Professor Walauskis
 *
 * @author Kiara
 * @version 2.0
 */

public class Menu {

    private List list;
    private TaskNumber generator;
    private DeleteTask deleteTask;
    private ArrayList<Task> ToDoList;
    private ArrayList<Integer> idList;

    Scanner scanner = new Scanner(System.in);

    public Menu(ArrayList<Task> ToDoList, ArrayList<Integer> idList, List list, TaskNumber generator, DeleteTask deleteTask) {
        this.idList = idList;
        this.ToDoList = ToDoList;
        this.list = list;
        this.generator = generator;
        this.deleteTask = deleteTask;
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
                /*
                  Option 1
                  Add Item
                 */
                    System.out.println("Add an new task:");
                    boolean addAnother;
                    //while (true) {
                    scanner.nextLine();
                    System.out.println("To-Do Item:");
                    String subject = scanner.nextLine();
                    System.out.println(subject);
                    generator.assignID();
                    int taskNumber = generator.getCurrentID();
                    System.out.println(taskNumber);
                    Task task = new Task(subject, taskNumber);
                    list.addTask(task);

                    break;

                case 2:
                   deleteTask.removeViaTaskNumber();

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
