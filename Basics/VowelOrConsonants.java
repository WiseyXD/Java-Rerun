import java.util.Scanner;

public class VowelOrConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Given String");
        String x = sc.next().toLowerCase();
        char y = x.charAt(0);
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u') {

            System.out.println("Vowel");
        } else {
            System.out.println("Consonants");
        }
    }
}