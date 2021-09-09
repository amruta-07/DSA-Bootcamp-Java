package BasicJava;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                System.out.println("it is not a prime Number");
                return;
            }
            i = i + 1;
        }
        System.out.println("It is a prime Number");

    }

}
