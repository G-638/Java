package CmdLineArg;
public class CmdLineArg {
    public static void main(String args[]) {
        String name = System.getProperty("username");
        String age = System.getProperty("age");

        if (name != null && age != null) {
            System.out.println(name);
            System.out.println(Integer.parseInt(age));
        }

    }
}

// Output:
// javac CmdLineArg.java && java -Dusername=sathish -Dage=21 CmdLineArg