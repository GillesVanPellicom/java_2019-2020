import java.util.Scanner;

public class oef9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double uurloon = scanner.nextDouble();
        double werkuur = scanner.nextDouble();
        if (werkuur < 40) {
            double onder = (uurloon * werkuur) * 7;
            System.out.println("Werkloon== " + onder);
        } else {
            double boven = ((uurloon * 1.5) * werkuur) * 7;
            System.out.println("Werkloon= " + boven);
        }
    }
}
