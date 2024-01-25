/**
 * This class represents a task with a specific subject and id number.
 *
 * Course: Software Development II
 * Professor: Professor Walauskis
 * @author Kiara Howard
 * @version 3.0
 *
 */


public class Task {

    String subject;
    int taskNumber;

    /**
     * Creates a task with the specific subject and task number.
     *
     * @param subject The body of the task
     * @param taskNumber ID number of each task
     */
    public Task(String subject, int taskNumber){
        this.subject = subject;
        this.taskNumber = taskNumber;
    }

    /**
     * Retrieves the subject of the task.
     *
     * @return the subject of the task.
     */
    public String getTask() {
        return subject;
    }

    /**
     * Sets the subject of the task.
     *
     * @param subject New subject of the task.
     */
    public void setTask(String subject) {
        this.subject = subject;
    }

    /**
     * Retrieves the taskNumber of the task.
     *
     * @return The unique ID number for the task
     */

    public int getTaskNumber() {
        return taskNumber;
    }

    /**
     * Sets the taskNumber of the task
     *
     * @param taskNumber sets new unique ID number for the task.
     */
    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }
}
