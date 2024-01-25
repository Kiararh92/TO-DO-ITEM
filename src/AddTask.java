import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 * This class represents the add feature of the program.
 *
 * Course: Software Development II
 * Professor: Professor Walauskis
 *
 * @author Kiara
 * @version 1.0
 *
 */
public class AddTask {

    private final List list;

    private final TaskNumber generator;

    public AddTask(List list, TaskNumber generator){
        this.list = list;
        this.generator = generator;
    }

    public void addTask(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add an new task:");
        System.out.println("To-Do Item:");
        String subject = scanner.nextLine();
        System.out.println(subject);
        generator.assignID();
        int taskNumber = generator.getCurrentID();
        System.out.println(taskNumber);
        Task task = new Task(subject, taskNumber);
        list.addTask(task);
    }
}
