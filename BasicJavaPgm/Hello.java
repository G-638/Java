class Hello {
    int x = 5;
    static int a = 2;

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String args[]) {
        // for accessing static methods , no need to creatig objects
        myStaticMethod(); 
        int x = 5;
        System.out.println(x);
        // for accessing static variables , no need to creatig objects
        System.out.println(a); 
        Hello myObj = new Hello(); 
        myObj.myPublicMethod();
        System.out.println(myObj.x);
        myObj.x = 4;
        System.out.println(myObj.x);
    }
}

//output: 
// Static methods can be called without creating objects
// 5
// 2
// Public methods must be called by creating objects
// 5
// 4