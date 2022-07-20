import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class TestArryVsLinked {


    //ArrayList
    // Research
    //LinkedList
    //add , delete
    static ArrayList<Integer> myArray = new ArrayList<>();
    static LinkedList<Integer> myLink = new LinkedList<>();
    //elements 10^7 : big number
    static long n = (long) 1E7;

    public static void main(String[] args) {

        //time
        long mils = System.currentTimeMillis();
        System.out.println("Before Insertion = " + mils);
        for (int i = 0; i < n; i++) {
            myArray.add(i);
            myLink.add(i);
        }
        System.out.println("Needed time Insertion ArrayList= " + (System.currentTimeMillis() - mils));


        long m = System.currentTimeMillis();
        System.out.println("Before Insertion = " + m);

        for (int i = 0; i < n; i++) {
            myLink.add(i);
        }
        System.out.println("Needed time Insertion LinkedList= " + (System.currentTimeMillis() - m));

        //get
        m = System.currentTimeMillis();
        myArray.get((int)n/2);
        System.out.println("Get time Array= " + (System.currentTimeMillis()-m));

        m = System.currentTimeMillis();
        myLink.get((int)n/2);
        System.out.println("Get time Link= " + (System.currentTimeMillis()-m));



    }
}