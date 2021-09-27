interface Calculation{
    public void sum();
    public void average();
}

class SubClass1{

    // create a Reference
    private Calculation mInterface;  
    
    //// Intialize interface obj
    public SubClass1(Calculation cal){
        this.mInterface=cal; 
    }

    // access interface methods inside subclass
    void calculate(){
        mInterface.sum(); 
        mInterface.average();
    }
}

public class InterfaceEx2 implements Calculation{
    private static InterfaceEx2 obj1;
    public static void main(String[] args) {
        obj1 = new InterfaceEx2(); 
        //Insatnce of subclass with main class obj as a parameter
        SubClass1 obj = new SubClass1(obj1); 
        obj.calculate();
        obj1.sum();
        obj1.average();

    }

    @Override
    public void sum() {
        System.out.println("Sum of numbers");
    }

    @Override
    public void average() {
        System.out.println("avg of numbers");
    }
}

// output:
// Sum of numbers
// avg of numbers
// Sum of numbers
// avg of numbers
