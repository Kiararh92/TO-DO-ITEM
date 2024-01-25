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
 * @version 2.0
 *
 */
public class DeleteTask {


    private final List list;
    public ArrayList<Integer> idList;
    int taskID;


    public DeleteTask(List list, ArrayList<Integer> idList) {
        this.list = list;
        this.idList = idList;
    }

    public void removeViaTaskNumber() {

        Scanner scanner = new Scanner(System.in);
        boolean found = false;

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
                    idList.remove(Integer.valueOf(taskID));
                    found = true;
                    break;
                } else {
                    found = false;
                }
            }
            if(!found) {
                System.out.println("Task not found.");
            }
            break;
        }
    }
}
