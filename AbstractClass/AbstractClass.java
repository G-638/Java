package AbstractClass;
abstract class A{
    abstract public void sum(int sum);
    abstract void total();
    void sample(){};
}

class B extends A{

    @Override
    public void sum(int sum) {
        System.out.println(sum); 
    }

    @Override
    void total() {
        System.out.println("Total in Abstract Class method");  
    }

    @Override
    void sample(){
        System.out.println("Sample");
    }

    void rate(){
        System.out.println("Rate");

    }

}

public class AbstractClass  {
    public static void main(String[] args) {
        B obj = new B();
        obj.sum(50);
        obj.total();
        obj.sample();
        //  A obj1 = new  A();   // cannot create Instance of abstract class 
        // only create reference of the abstract class
        A obj1 = new B() ; 
        obj1.sum(30);
        obj1.total();
        obj1.sample();
        obj.rate();
    }
}


//output:
// 50
// Total in Abstract Class method
// Sample
// 30
// Total in Abstract Class method
// Sample
// Rate
