public class ExceptionHandlingEx2 {
    public static void main(String[] args) {
        int a[] = new int[2];
        try{
            System.out.println(a[1]); 
            try{
                System.out.println(a[2]);  // a[2] 
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception thrown :" + e); 
            }    
            finally{
                System.out.println("Inner finally block executed"); 
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown :" + e); // catch exception of both try blocks(Inner, Outer)
        }
        finally{
            System.out.println("Outer finally block executed"); 
        }
    }
}

//output: 
// 0
// Exception thrown :java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
// Inner finally block executed
// Outer finally block executed