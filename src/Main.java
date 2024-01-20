import java.util.ArrayList;

import static java.awt.SystemColor.menu;

/**
 * This is the Main class of the To-Do Application
 *
 * Course: Software Development II
 * Professor: Professor Walauskis
 *
 * @author Kiara
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {

        ArrayList<Item> ToDoList = new ArrayList<>();
        List list = new List(ToDoList);


        Menu menu = new Menu(list, ToDoList);

        menu.toDoMenu();
    }
}