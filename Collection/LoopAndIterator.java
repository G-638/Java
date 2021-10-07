import java.util.ArrayList;
import java.util.Iterator;

public class LoopAndIterator {

    public static void main(String[] args) {
        ArrayList<Character> al = new ArrayList<Character>();
        String name = "CIALFORNIA";
        for (int i = 0; i < name.length(); i++)
        {   
            al.add(name.charAt(i));
        }
        for(Character chr: al){
            System.out.print(chr);
        }
        
        Iterator<Character> itr = al.ite    rator();

        while(itr.hasNext()){
            itr.next();
            itr.remove();
            System.out.println(al);
        }
        System.out.println(al);
    }
}
