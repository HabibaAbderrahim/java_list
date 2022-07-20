import java.util.Arrays;
import java.util.LinkedList;

/************Linkedlist : pointer right before and right after the element double pointer
insertion faster
GOOD in frequent adding and deletion
node:more memory since it hold data and adresses of the previous and the next elemnts************/
public class TestLinkedList {


    static LinkedList<Integer> myList = new LinkedList<>();
    public static void main(String[] args) {

        //add value
        myList.add(10);
        myList.addFirst(1);
        myList.add(7);
        myList.add(2,6);
        myList.addLast(4);

        //
        for (int e : myList){
            System.out.println(e);
        }
        System.out.println(myList.get(2));


    }
}
