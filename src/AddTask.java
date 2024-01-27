import java.util.Scanner;
/**
 * This class represents the add feature.
 *
 * @author Kiara
 * @version 3.0
 */
public class AddTask {

    private final List list;

    private final TaskNumber generator;

    /**
     * Add a new task.
     *
     * @param list List object that contains the task objects
     * @param generator An ArrayList of taskNumbers
     */
    public AddTask(List list, TaskNumber generator){
        this.list = list;
        this.generator = generator;
    }

    /**
     * Creates a new task via user-input.
     * Assigns a task number for that specific task.
     */
    public void addTask(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add an new task:");
        String subject = scanner.nextLine();
        generator.assignID();
        int taskNumber = generator.getCurrentID();
        Task task = new Task(subject, taskNumber);
        list.addTask(task);
    }
}
