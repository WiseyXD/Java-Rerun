import java.util.*;

public class Armstrong {
    static boolean isArmstrong(int num) {
        double digits = (int) (Math.log10(num)) + 1;
        double sum = 0;
        boolean ans = false;
        int originalNum = num;
        for (int i = 0; i < digits; i++) {
            double pickLast = num % 10;
            sum = sum + Math.pow(pickLast, digits);
            num = num / 10;
        }
        if (sum == originalNum) {
            ans = true;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer");
        int x = sc.nextInt();
        System.out.println(isArmstrong(x));

    }
}
