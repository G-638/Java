package CmdLineArg;
public class CmdLineArgPgm1 {
    public static void main(String args[]) {

        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }
}


//Output: 
//  javac CmdLineArgPgm1.java && java  CmdLineArgPgm1 sathish 21
