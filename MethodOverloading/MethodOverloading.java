//Method Overloading: 2 types: 1 ->  changing no. of arguments
// 2 ->    By changing the data type

//  1.changing no. of arguments
class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(11, 11, 11));
    }
}

// 2. By changing the data type

// class Adder {
//     static int add(int a, int b) {
//         return a + b;
//     }

//     static double add(double a, double b) {
//         return a + b;
//     }
// }

// class MethodOverloading {
//     public static void main(String[] args) {
//         System.out.println(Adder.add(11, 11));
//         System.out.println(Adder.add(12.3, 12.6));
//     }
// }

// Not applicable - > Method Overloading is not possible by changing the return
// type of method only

// ex :1

// class Adder {
//     static int add(int a, int b) {
//         return a + b;
//     }

//     static double add(int a, int b) {
//         return a + b;
//     }
// }

// class TestOverloading3 {
//     public static void main(String[] args) {
//         System.out.println(Adder.add(11, 11));// ambiguity
//     }
// }


// o/p: Compile time error



//  Method Overloading and Type Promotion
//  promotions: 
// 1. byte can be promoted to short, int, long, float or double.
// 2. short '' ''
// 3. char  '' ''
 

