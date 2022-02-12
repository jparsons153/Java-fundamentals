package labs_examples.datastructures.linkedlist.labs;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
    public static LinkedList<String> makeList(){

        // create a LinkedList of type String
        LinkedList<String> myList = new LinkedList<String>();

        // add three elements to the LinkedList
        myList.add("This");
        myList.add("is");
        myList.add("a Linkedlist");

        // pop one element off the LinkedList
        System.out.print(myList.pop() + " ");

        // return LinkedList

        Iterator i = myList.iterator();
        while(i.hasNext()){
            System.out.print(i.next());
        }
        return myList;
    }
}
