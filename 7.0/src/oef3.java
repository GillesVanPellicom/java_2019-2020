import java.util.Scanner;

public class oef3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef de lengte van de 1ste zijde (niet onder 0 of boven 10)");
        int x = scanner.nextInt();
        System.out.println("Geef de lengte van de 2de zijde (niet onder 0 of boven 10)");
        int y = scanner.nextInt();
        int mem1 = 0;
        if (x > 10 && !(x > 0) && y >= 10 && !(y > 0)) {
            System.out.println("Lees de opdracht aandachtiger...");
        } else {
            for (int i = 0; x > i; i++) {
                System.out.println("");
                for (int u = 0; y > u; u++) {
                    System.out.print("*");
                }
            }
        }
    }
}
