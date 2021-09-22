class Parent {
    void show(){
        System.out.println("Parent class");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("Sub class");
    }
}

public class MethodOverrideEx1 {
    public static void main(String[] args) {
        Parent obj =new Child();
        obj.show();
        obj = new Parent();
        obj.show();
    }
}
