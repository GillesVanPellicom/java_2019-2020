import java.util.Scanner;

public class oef13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("GET ME YOUR TAXABLE INCOME. NOW!");
        double inc = scanner.nextDouble();
        double tax = 0;
        if (inc <= 20000) {
            tax = 0.2 * inc;
        } else {
            if (inc <= 5000) {
                tax = 400 + 0.25 * (inc - 20000);
            } else {
                tax = 1150 + 0.035 * (inc - 50000);
            }
        }
        System.out.println(tax);
    }
}
