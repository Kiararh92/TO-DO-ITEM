import java.util.ArrayList;

/**
 * This class represents the handling of each task number.
 *
 * Course: Software Development II
 * Professor: Professor Walauskis
 *
 * @author Kiara
 * @version 2.0
 *
 *
 */
public class TaskNumber {
    int nextID = 101;
    int currentID = 0;
    public ArrayList<Integer> idList;

    boolean found;

    public TaskNumber(ArrayList<Integer> idList){
        this.idList = idList;
    }

    public void assignID(){
        nextID = 101;
        while(found) {
            found = false;
            while (idList.contains(nextID)) {
                found = true;
                nextID++;
                if (!found) {
                    break;
                }
            }
        }
            if(!found) {
                idList.add(nextID);
                currentID = nextID;
                found = true;
            }
    }

//    public void assignID(){
//       currentID = nextID++;
//    }

    public int getCurrentID() {
        return currentID;
    }

    public void setCurrentID(int currentID) {
        this.currentID = currentID;
    }
}
