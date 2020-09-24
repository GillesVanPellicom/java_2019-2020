import java.util.Scanner;

public class oef4 {
    private static Scanner scanner;

    public static double vraagLengte() {
        System.out.println("geef je lengte in cm");
        return scanner.nextDouble();

    }

    public static double vraagGewicht() {
        System.out.println("geef je gewicht in kg");
        return scanner.nextDouble();
    }

    public static double berekenBMI(double gewicht, double lengte) {
        return gewicht / Math.pow(lengte, 2);
    }

    public static void gezond(double bmi) {
        System.out.println("je hebt een bmi van: " + bmi);
        if (bmi < 19) {
            System.out.println("je weegt te weinig!");
        } else if (bmi >= 19 && bmi <= 25) {
            System.out.println("je hebt een gezond gewicht");
        } else {
            System.out.println("je weegt te veel!");
        }
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        double gewicht, lengte, bmi;
        lengte = vraagLengte();
        gewicht = vraagGewicht();
        bmi = berekenBMI(gewicht, lengte);
        gezond(bmi);
    }

}
