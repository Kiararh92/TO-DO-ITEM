/**
 * This class represents the item of the To-Do Application.
 *
 * Course: Software Development II
 * Professor: Professor Walauskis
 *
 * @author Kiara Howard
 * @version 2.0
 *
 * @param subject The body of the task
 * @param taskNumber ID number of each task
 */


public class Task {

    String subject;
    int taskNumber;

    public Task(String subject, int taskNumber){
        this.subject = subject;
        this.taskNumber = taskNumber;
    }

    public String getTask() {
        return subject;
    }

    public void setTask(String subject) {
        this.subject = subject;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }
}
