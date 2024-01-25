import java.util.ArrayList;

/**
 * This is the Main class of the To-Do Application
 *
 * Course: Software Development II
 * Professor: Professor Walauskis
 *
 * @author Kiara
 * @version 3.0
 */

public class Main {
    public static void main(String[] args) {

        ArrayList<Task> ToDoList = new ArrayList<>();
        ArrayList<Integer> idList = new ArrayList<>();

        List list = new List(ToDoList);
        TaskNumber generator = new TaskNumber(idList);
        DeleteTask deleteTask = new DeleteTask(list, idList);
        AddTask addTask = new AddTask(list, generator);


        Menu menu = new Menu(ToDoList, idList, list, deleteTask, addTask);

        menu.toDoMenu();
    }
}