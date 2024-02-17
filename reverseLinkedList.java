import java.util.LinkedList;
import java.util.Iterator;
public class reverseLinkedList {
    // Reverse the order of the elements in a LinkedList using algorithm
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("LinkedList: " + linkedList);
        Iterator it = linkedList.descendingIterator();
        System.out.println("Reversed LinkedList: " + linkedList);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}