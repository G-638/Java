class Operation {
    int square(int n) {
        return n * n;
    }
}

// caluculate circle radius 
class Aggregation { 
    // Aggregation
    Operation op; 
    double pi = 3.14;

    double area(int radius) {
        op = new Operation();
        // code reusability (i.e. delegates the method call).
        int rsquare = op.square(radius);
        return pi * rsquare;
    }

    public static void main(String args[]) {
        Aggregation c = new Aggregation();
        double result = c.area(5);
        System.out.println(result);
    }
}

// Hint:-
// Aggregation: 
// --------------
// class Employee{  
//     int id;  
//     String name;  
//     Address address;    // "Address" is a class  ---> city, state, country, zipcode etc. 
//     ...  
//     }  