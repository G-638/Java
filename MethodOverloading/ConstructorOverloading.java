class Ab {
    int a, b;

    public Ab(){}

    public Ab(int a){
        this.a = a;
        System.out.println(a);
    }

    public Ab(int a, int b) {
        this.a = a;
        this.b = b;
        // here + act as concat operation
        System.out.println("" + a + " " + b); 
        // here + act as addition operation
        System.out.println(a+b); 
        // using format specifier to display
        System.out.printf("%d %d\n", a, b); 
    }

}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Ab obj = new Ab();
        Ab obj1 = new Ab(5);
        Ab obj2 = new Ab(5, 10);
    }
}


// output :
// 5
// 5 10
// 15
// 5 10