import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 * This class represents the delete feature.
 *
 * Course: Software Development II
 * Professor: Professor Walauskis
 *
 * @author Kiara
 * @version 1.0
 *
 * @param taskID id number of task to delete
 */
public class DeleteTask {
    private final ArrayList<Task> ToDoList;
   // private final ArrayList<List> idList;

    private final List list;
    int taskID;

    public DeleteTask(ArrayList<Task> ToDoList,List list) {
        this.ToDoList = ToDoList;
        this.list = list;
    }

    public void removeViaTaskNumber() {

        Scanner scanner = new Scanner(System.in);
        boolean found;

        while(true) {
            System.out.println("Delete an task:");
            System.out.println("Task # of task:");
            taskID = scanner.nextInt();

            Iterator<Task> iterator = list.getTasks().iterator();
            while (iterator.hasNext()) {
                Task task = iterator.next();
                if (task.getTaskNumber() == taskID) {
                    iterator.remove();
                    System.out.println("Task deleted!");
                    found = true;
                } else {
                    found = false;
                }
                if(!found) {
                    System.out.println("Task not found.");
                }
                break;
            }
            break;
        }

        for(Task task : list.getTasks()) {
            System.out.println(task.getTaskNumber() + " " + task.getTask());
        }
    }

}
