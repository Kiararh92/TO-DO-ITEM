import java.util.ArrayList;

/**
 * This class represents the List of To-Do Items as a whole.
 *
 * @author Kiara
 * @verison 1.0
 */
public class List {
    public ArrayList<Task> ToDoList;

    public List(ArrayList<Task> ToDoList){
        this.ToDoList = ToDoList;
    }

    public void addTask( Task task) {
        ToDoList.add(task);
    }

    public ArrayList<Task> getTasks(){
        return ToDoList;
    }
}
