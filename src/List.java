import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * This class represents the List of To-Do Items as a whole.
 *
 * @author Kiara
 * @verison 1.0
 */
public class List {
    public ArrayList<Item> ToDoList;

    public List(ArrayList<Item> ToDoList){
        this.ToDoList = ToDoList;
    }

    public void addItem( Item item) {
        ToDoList.add(item);
    }

    public ArrayList<Item> getItems(){
        return this.ToDoList;
    }
}
