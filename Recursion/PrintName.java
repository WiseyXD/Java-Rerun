public class PrintName {
    static void printName(String name, int n) {
        if (n == 0) {
            return;
        }
        System.out.println(name);
        printName(name, n - 1);
    }

    public static void main(String[] args) {
        printName("Siddharth", 5);
    }
}