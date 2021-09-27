import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionSet {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();
        hset.add("Apple");
        hset.add("Orange");
        hset.add("banana");
        hset.add("Apple");
        System.out.println(hset); // remove duplicate elements. 

        // Creating a List of HashSet elements
        ArrayList<String> list = new ArrayList<String>(hset);
        System.out.println(list);

        // delete hashset
        hset.clear();
        System.out.println(hset);

        // LinkedHashSet of String Type
        LinkedHashSet<String> lhset = new LinkedHashSet<String>();
        lhset.add("A");
        lhset.add("B");

        System.out.println(lhset);

        //TreeSet
        TreeSet<String> tset = new TreeSet<String>();
        tset.add("employee");
        tset.add("employeer");
        System.out.println(tset);   
    } 
}

//Hints: 

// 1. HashSet doesn’t maintain any kind of order of its elements.
// 2. TreeSet sorts the elements in ascending order.
// 3. LinkedHashSet maintains the insertion order. 
//    Elements gets sorted in the same sequence in which they have been added to the Set.