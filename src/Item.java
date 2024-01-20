/**
 * This class represents the item of the To-Do Application.
 *
 * Course: Software Development II
 * Professor: Professor Walauskis
 *
 * @author Kiara Howard
 * @version 1.0
 */


public class Item {

    String subject;

    public Item(String subject){
        this.subject = subject;
    }

    public String getItem() {
        return subject;
    }

    public void setItem(String subject) {
        this.subject = subject;
    }
}
