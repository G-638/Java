import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionMap {
    public static void main(String[] args) {
        //HasMap
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(2, "raj");
        hmap.put(5, "raja");
        hmap.put(12, "ramu");
        System.out.println(hmap);
        Set set = hmap.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry mEntry = (Map.Entry)itr.next();
            System.out.println("HashMap" + ' ' + mEntry.getKey());
            System.out.println("HashMap" + ' ' +mEntry.getValue());
        }

        //TreeMap
        TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
        tmap.put(2, "raj");
        tmap.put(5, "raja");
        tmap.put(12, "ramu");
        System.out.println(tmap);
        Set tset = tmap.entrySet();
        Iterator titr = tset.iterator();
        while(titr.hasNext()){
            Map.Entry mEntry = (Map.Entry)titr.next();
            System.out.println("TreeMap" + ' ' + mEntry.getKey());
            System.out.println("TreeMap" + ' ' + mEntry.getValue());
        }
        // LinkedHasMap
        LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();
        lhmap.put(2, "raj");
        lhmap.put(5, "raja");
        lhmap.put(12, "ramu");
        System.out.println(lhmap);
        Set lhset = lhmap.entrySet();
        Iterator lhitr = lhset.iterator();
        while(lhitr.hasNext()){
            Map.Entry mEntry = (Map.Entry)lhitr.next();
            System.out.println("LinkedhashMap" + ' ' + mEntry.getKey());
            System.out.println("LinkedHashMap" + ' ' + mEntry.getValue());
        }
    }
}


//Hints:

//Map - key,value pair

// HashMap  - > doesn’t maintain any order.
// TreeMap  -> sort the entries in ascending order of keys.
// LinkedHashMap ->  maintains the insertion order.