import java.util.Scanner;

class Calculation {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers:" + z);
    }

    public void Substraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers:" + z);
    }
}

class InHeritance extends Calculation {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers:" + z);
    }

    public static void main(String args[]) {
        int a = 20, b = 10;
        InHeritance demo = new InHeritance();
        demo.addition(a, b);
        demo.Substraction(a, b);
        demo.multiplication(a, b);
        Scanner obj = new Scanner(System.in);
        String name = obj.next();
        System.out.println(name);
        obj.close();
    }
}

// Types Of Inheritance: 
// 1. single( B -> A)
// 2. multilevel ( C -> B -> A)
//  3. hierachical
        // ( A <- B
        //     <- C
        //     <- D )
// 4. multiple (not support in java)  ( A        B) 
                                      //  <- C ->
// 5. hybrid  --> class A & B extends class C and another class D extends class A 
