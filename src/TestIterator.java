import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class TestIterator {
    /*
    hasNext
    next
    previous
    hasPrevious
     */

    static ArrayList<Integer> myList = new ArrayList<>();
    public static void main(String[] args) {

        //fill list
        myList.add(1);
        myList.add(10);
        myList.add(11);
        myList.add(110);
        //iterator to myList
        ListIterator<Integer> iterator = myList.listIterator();
        //iteration
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Iterate in reverse");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
