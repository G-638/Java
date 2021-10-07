import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("employee");
        ls.add("management");
        System.out.println(ls);
        //Iterator
        Iterator itr = ls.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            itr.remove();
        }
        System.out.println(ls);
        //LinkedList
        LinkedList<String> ll = new LinkedList<String>();   
        ll.add("Bank");
        ls.add("Employee");

        //sort list using collections
        Collections.sort(ls);
        for(String AnyBank: ls){
            System.out.println(AnyBank);
        }
        //Here, we are using lambda expression 
        ls.forEach(a->{  
            System.out.println("list:" +a);  
          });

        // Vector -- synchronized one( accessing=( searching, adding, delete and update) is not faster )
        Vector<String> vec = new Vector<String>(2);
        vec.addElement("Apple");
        vec.addElement("Orange");
        vec.addElement("banana");
        // double its capacity 4  
        System.out.println(vec.capacity());  
        System.out.println(vec.size()); 

        vec.addElement("Sapota");
        vec.addElement("grapes");;
        System.out.println(vec.size());
        //  double its capacity. 8
        System.out.println(vec.capacity()); 
    }
}
