import java.util.ArrayList;

/**
 * This class represents the handling of each task number.
 *
 * Course: Software Development II
 * Professor: Professor Walauskis
 *
 * @author Kiara
 * @version 1.0
 */
public class TaskNumber {
    int nextID = 101;
    int currentID = 0;
    public ArrayList<Integer> idList;

    public TaskNumber(ArrayList<Integer> idList){
        this.idList = idList;
    }

    public void assignID(){
       currentID = nextID++;
    }

    public int getCurrentID() {
        return currentID;
    }

    public void setCurrentID(int currentID) {
        this.currentID = currentID;
    }
}
