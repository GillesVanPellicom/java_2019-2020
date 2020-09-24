import java.util.Scanner;

public class oef9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double get = 1;
        if (n > 30) {
            System.out.println("Voer een beter getal in...");
        }
        String np = scanner.next();
        if (np.contentEquals("S") || np.contentEquals("P")) {
            System.out.println("Good jobberino");
        } else {
            System.out.println("S of P. Mind the caps.");
        }
        if (np.contentEquals("S")) {
            for (int i = 0; i < n; i++) {
                get = get + i;
            }
            System.out.println(get);
        } else {

        }
    }
}
