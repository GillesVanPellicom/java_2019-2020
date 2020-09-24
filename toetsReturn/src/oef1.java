import java.util.Scanner;

public class oef1 {
    public static double berekening(double hoogte, double straal) {
        return (Math.pow(straal, 2) + straal * hoogte) * 6.283;
    }

    public static void main(String[] args) {
        double straal, hoogte, uitkomst;
        Scanner scanner = new Scanner(System.in);
        straal = 0;
        hoogte = 0;
        System.out.println("geef de hoogte van uw tinnen beker in (in cm)");
        hoogte = scanner.nextDouble();
        System.out.println("geef de straal van uw tinnen beker in (in cm)");
        straal = scanner.nextDouble();
        uitkomst = berekening(hoogte, straal);
        System.out.println("Voor je tinnen beker heb je " + uitkomst + " cm� tin nodig");

    }
}
