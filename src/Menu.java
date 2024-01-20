import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Course: Software Development II
 * Professor: Professor Walauskis
 *
 * @author Kiara
 * @version 1.0
 */

public class Menu {

    private List list;

    private ArrayList<Item> ToDoList;

    Scanner scanner = new Scanner(System.in);

    public Menu(List list, ArrayList<Item> ToDoList) {
        this.list = list;
        this.ToDoList = ToDoList;
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
                    System.out.println("Add an new item.");
                    boolean addAnother;
                    //while (true) {
                    scanner.nextLine();
                    System.out.println("To-Do Item:");
                    String subject = scanner.nextLine();
                    System.out.println(subject);

                    Item item = new Item(subject);
                    list.addItem(item);

                    //}
                    break;

                case 2:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;

            }
        }
    }
}
