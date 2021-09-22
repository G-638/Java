class ExampleClass{

    public void add(){
        System.out.println("Sum of numbers are");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}


public class MethodOverloadEx1 {
    public static void main(String[] args) {
        ExampleClass obj = new ExampleClass();
        obj.add();
        obj.add(3,4);
        obj.add(5,10);
    }    
}
