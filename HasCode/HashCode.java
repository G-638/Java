import java.util.HashMap;

import javax.management.MBeanInfo;
import javax.print.DocFlavor.STRING;

public class HashCode {
    public static void main(String[] args) {
        String m1 = "100";
        String m2 = "sathish";      
        System.out.println(m1.hashCode());    
        System.out.println(m2.hashCode());
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"sathish");
        map.put(2,"gokul");
        map.put(3,"Thangavel");
        if(!map.isEmpty()){
            System.out.println("User1"+ ' ' + map.get(1));
            System.out.println("User2"+ ' ' + map.get(2));
            System.out.println("User3"+ ' ' + map.get(3));
        }
        System.out.println(map.size());

    }
}
