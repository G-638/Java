class Parent{
    public String method() {
        System.out.println("Inside the method()");  
        throw new ArithmeticException("throwing ArithmeticException");  
    }
}

public class ExceptionHandlingEx3 {
    public static void main(String[] args) {
        try{
            Parent obj = new Parent();
            obj.method();
        }catch(ArithmeticException e){
            e.printStackTrace();  
        }
        finally{    
            System.out.println("Something went wrong");
        }
    }
}

//Output: 
    // Inside the method()
    // java.lang.ArithmeticException: throwing ArithmeticException
    // 	at Parent.method(ExceptionHandlingEx3.java:4)
    // 	at ExceptionHandlingEx3.main(ExceptionHandlingEx3.java:12)
    // Something went wrong