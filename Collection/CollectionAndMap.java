import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionAndMap { 
    public static void main(String[] args) {
        // list
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();
        Vector<Integer> v = new Vector<>();

        // set
        HashSet<Integer> hs = new HashSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        // Map
        HashMap<Integer,Integer> hm = new HashMap<>();
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
        Hashtable<Integer, Integer> ht = new Hashtable<>();

        Scanner in = new Scanner(System.in);

        

        for (int i = 1; i <= 5; i++) {
            int value = in.nextInt();
            al.add(value);
            ll.add(value);
            v.add(value);
            hs.add(value);
            lhs.add(value);
            ts.add(value);
            hm.put(i,value);
            tm.put(i,value);
            lhm.put(i, value);
            ht.put(i, value);
        }
        in.close();
        System.out.println(al);
        System.out.println(ll);
        System.out.println(v);
        System.out.println(hs);
        System.out.println(lhs);
        System.out.println(ts);
        System.out.println(hm);
        System.out.println(tm);
        System.out.println(lhm);
        System.out.println(ht);
    }
}

//output:
// [1, 5, 6, 2, 9]
// [1, 5, 6, 2, 9]
// [1, 5, 6, 2, 9]
// [1, 2, 5, 6, 9]
// [1, 5, 6, 2, 9]
// [1, 2, 5, 6, 9]
// {1=1, 2=5, 3=6, 4=2, 5=9}
// {1=1, 2=5, 3=6, 4=2, 5=9}
// {1=1, 2=5, 3=6, 4=2, 5=9}

// class Noed{
//     Strin gosm;
// }