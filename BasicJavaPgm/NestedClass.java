class OuterClass {
  int x = 10;
  // class have protected access.
  protected class InnerClass {  
    int y = 5;
  }
}

public class NestedClass {

  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInnerClass = myOuter.new InnerClass();
    System.out.println( myInnerClass.y + myOuter.x);
  }
}

//output: 
// 15