import java.util.*;

public class EndlessInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int pOddsum = 0;
        int nsum = 0;
        int pEvensum = 0;
        System.out.println("Enter the input continously until you hit 0");
        while (true) {
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n < 0) {
                nsum += n;
            }
            if (n > 0) {
                if (n % 2 == 0) {

                    pEvensum += n;
                } else {
                    pOddsum += n;
                }
            }
        }
        System.out.println(nsum + " " + pEvensum + " " + pOddsum);
    }
}
