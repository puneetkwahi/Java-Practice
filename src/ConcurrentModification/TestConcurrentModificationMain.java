package ConcurrentModification;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestConcurrentModificationMain {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Puneet");
        nameList.add("Gaurav");
        nameList.add("Mohit");
        nameList.add("Lokesh");
        System.out.println("Original Collection " + nameList);

        System.out.println("Removing item - in enhanced for loop :");

        for (String name : nameList) {
            if (name.equals("Gaurav")) {
                nameList.remove(name);
                break;//removing this would throw ConcurrentModificationException
            }
        }
        System.out.println(nameList);
        Collections.synchronizedList(nameList);

        ListIterator listIterator = nameList.listIterator();
        for (ListIterator<String> i = listIterator; i.hasNext(); ) {
            String name = i.next();
            i.add("Papa");
        }
        System.out.println("Printing after modification - adding Papa after each item");
        ListIterator listIterator2 = nameList.listIterator(); //we can use iterator also here
        for (ListIterator<String> i2 = listIterator2; i2.hasNext(); ) {
            String name = i2.next();

        }
        System.out.println(nameList);

    }
}
