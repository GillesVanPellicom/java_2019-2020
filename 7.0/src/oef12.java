import java.util.Scanner;

public class oef12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("naam:");
        String naam = scanner.next();
        System.out.println("leeftijd:");
        int age = scanner.nextInt();
        System.out.println("jaarloon:");
        double ln = scanner.nextDouble();
        double tot = 0;
        for (age = age; age <= 65; age++) {
            ln = ln + (ln / 100 * 3);
            tot = tot + ln;
        }
        System.out.println(tot);
    }
}
