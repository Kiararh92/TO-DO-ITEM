import java.util.ArrayList;
/**
 * Main class of the To-Do List.
 * Initializes the application and starts the main menu.
 *
 * Course: Software Development II
 * Professor: Professor Walauskis
 *
 * @author Kiara
 * @version 3.0
 */

public class Main {
    public static void main(String[] args) {

        // Initializes the application components and dependencies.
        ArrayList<Task> ToDoList = new ArrayList<>();
        ArrayList<Integer> idList = new ArrayList<>();

        List list = new List(ToDoList);
        TaskNumber generator = new TaskNumber(idList);
        DeleteTask deleteTask = new DeleteTask(list, idList);
        AddTask addTask = new AddTask(list, generator);
        ViewList viewList = new ViewList(list);

        Menu menu = new Menu(ToDoList, idList, list, deleteTask, addTask, viewList);

        // Starts the main application menu
        menu.toDoMenu();
    }
}