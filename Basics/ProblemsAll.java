import java.util.Scanner;

public class ProblemsAll {

    // Palindrom Checker
    public static boolean isPalindrome(String x) {
        String sum = "";
        boolean ans;
        for (int i = x.length() - 1; i >= 0; i--) {
            sum = sum + x.charAt(i);
        }
        if (x.equals(sum)) {
            ans = true;

        } else {
            ans = false;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int sum = 0, a = 0, b = 1;
        // System.out.println("Enter the number");
        // int x = sc.nextInt();
        System.out.println("Enter String");
        String f1 = sc.next();
        System.out.println(isPalindrome(f1.toLowerCase()));

        // Fibonnaci Series Logic

        // System.out.print(0 + " ");
        // if (x == 0) {
        // return;
        // }
        // for (int i = 1; i <= x; i++) {
        // System.out.print(b + " ");
        // sum = a + b;
        // a = b;
        // b = sum;
        // }
    }

}
