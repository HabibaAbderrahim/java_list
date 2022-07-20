import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

//Difference btwn list and sets
//Lists can contain duplicated value while sets contains unique elements
public class TestHashSet {

    static HashSet<Integer> mySet = new HashSet<>();
    public static void main(String[] args) {
        mySet.add(1);
        mySet.add(1);//this value will not be shown since it's duplicated
        mySet.add(0);
        mySet.add(2);

        Iterator<Integer> iterator = mySet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
