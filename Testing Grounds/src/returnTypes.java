import java.util.Scanner;

public class returnTypes {
    private static int a;
    private static int b;

    public static void main(String[] args) {
        Scanner scanner = maakScanner();
        int som = bereken(35, 2);
        System.out.println(som);
    }

    public static int bereken(int a, int b) {
        return a + b;
    }

    public static Scanner maakScanner() {
        return new Scanner(System.in);
    }
}
