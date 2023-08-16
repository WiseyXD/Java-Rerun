
import java.util.Scanner;

public class Factorial {

    static int findFactorial(int x) {
        int sum = 1;
        for (int i = x; i > 0; i--) {
            sum = sum * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int x = sc.nextInt();
        System.out.println(findFactorial(x));
    }

}
