import java.util.Scanner;

public class oef1 {
    public static void main(String[] args) {
        Scanner scanner = maakScanner();
        System.out.println(bereken(straal(scanner), hoogte(scanner)));
    }

    public static Scanner maakScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public static double straal(Scanner scanner) {
        System.out.println("Voer een straal in (in cm)");
        return scanner.nextDouble();
    }

    public static double hoogte(Scanner scanner) {
        System.out.println("Voer een hoogte in (in cm)");
        return scanner.nextDouble();
    }

    public static double bereken(double straal, double hoogte) {
        return (Math.pow(straal, 2) + straal * hoogte) * 6.283;
    }
}
