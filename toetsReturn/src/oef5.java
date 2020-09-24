import java.util.Scanner;

public class oef5 {
    private static Scanner scanner;

    public static void maakScanner() {
        scanner = new Scanner(System.in);
    }

    public static double geefSaldo() {
        System.out.println("geef het maandelijkse bedrag op ");
        return scanner.nextDouble();
    }

    public static double berekenNieuwSaldo(double saldo, double bedrag) {
        return 1.005 * saldo + bedrag;
    }

    public static void print(double saldo, int teller) {
        System.out.println("Maand" + (teller + 1) + "\t � " + saldo);
        //System.out.println("test");
    }

    public static void main(String[] args) {
        double bedrag, saldo;
        bedrag = 0;
        saldo = 0;
        oef5.maakScanner();
        bedrag = oef5.geefSaldo();
        for (int teller = 0; teller <= 3; teller++) {

            saldo = oef5.berekenNieuwSaldo(saldo, bedrag);
            oef5.print(saldo, teller);
        }


    }

}
