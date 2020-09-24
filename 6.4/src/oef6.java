import java.util.Scanner;

public class oef6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stop = 0;
        double get = 0;
        while (stop == 0) {
            double scan = scanner.nextDouble();
            if (scan != -1) {
                get += scan;
            } else {
                System.out.println("Uitkomst= " + get);
            }

        }
    }
}
