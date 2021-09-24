class First{
    public void DisplayFirst(){
        System.out.println("Display First Method");   
    }
}
interface InterfaceB 
{
    public void show();
}
interface InterfaceC 
{
    public void show();
}
public class HybridInheritance extends First implements InterfaceB,InterfaceC {
    public void show(){
        System.out.println("Display show() method");
    }
    public void DisplayHybrid(){
        System.out.println("Display Hybrid method");
    }
    public static void main(String[] args) {
        HybridInheritance obj = new HybridInheritance();
        obj.DisplayFirst();
        obj.show();
        obj.DisplayHybrid();
    }
}

//output: 
// Display First Method
// Display show() method
// Display Hybrid method
