package BasicJava;

import java.util.Scanner;

public class FindFactor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                System.out.println(i);
            }
            i = i + 1;
        }

    }

}
