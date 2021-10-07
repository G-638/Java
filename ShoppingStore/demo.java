public class demo {
    public static void main(String[] args) {
        String a="hello", b = "hello";
        String c = new String("hello");
        String d = new String("hello");
        System.out.println(a.equals(b));
        System.out.println(c == d);

    }
}
