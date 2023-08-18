
// package Recursion;
import java.util.*;

public class Print1toN {
    static void printNo(int n) {
        if (n == 1) {
            System.out.println("1");
            return;
        }
        printNo(n - 1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 5;
        printNo(x);
    }
}
