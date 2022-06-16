import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList {

    //fixed size
    static int simpleArray[]= new int[5];
    //Dynamic list with initialised n
    static ArrayList<Integer> myList = new ArrayList<Integer>(5);

    public static void main(String[] args) {
        System.out.println("Simple List");
        for(int e : simpleArray){
            System.out.println(e);
        }
        System.out.println("ArrayList");
        System.out.println("Array size= " + myList.size());

        //add
        myList.add(5);
        myList.add(8);
        myList.add(7);

        for (int el : myList){
            System.out.println(el);

        }
        System.out.println("Array size= " + myList.size());

        //remove
        myList.remove(0);
        System.out.println("Array size= " + myList.size());
       //clear all value on the arry

        //set : change (index, newvalue)
        myList.set(0,6);

        for (int el : myList){
            System.out.println(el);

        }
        //initial size is 5 however we have only 2 element , this method trims the size to 2
        myList.trimToSize();
        System.out.println("Array size= " + myList.size());





    }
}
