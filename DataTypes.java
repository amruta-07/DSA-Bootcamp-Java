//package BasicJava;

public class DataTypes {
    public static void main(String[] args) {
        // int a = 23;
        // int b = 65;
        // int c = a+ b;
        // System.out.println(c);
        // System.out.println("Hello");
        // System.out.println("Amruta");
        // System.out.println("Your a Coder");

        // int a = 10;
        // short s = 42;
        // double d = 4.2;
        // float f = 3.3f;
        // char c = 'a';
        // boolean b = true;
        // byte k = 40;
        // long l = 20;

        int a = 23; // size of int is 4 Byte
        long b = a; // size of long is 8 Byte
        System.out.println(b);
        char c = 'a'; // ASCII Value of 'a' is 97
        int d = c;
        System.out.println(d);

        // Type Casting

        long f = 10;
        int e = (int) f;
        System.out.println(e);

        int num = 97;
        char ch = (char) num;
        System.out.println(ch);

    }

}
