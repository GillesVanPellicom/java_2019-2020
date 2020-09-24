import java.util.Scanner;

public class oef7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p1 = scanner.nextDouble();
        double p2 = scanner.nextDouble();
        double p3 = scanner.nextDouble();

        double mem1 = Math.max(p1, p3);
        double mem2 = Math.max(p1, p2);
        double mem3 = Math.max(p2, p3);
        double mem4 = Math.max(mem2, mem3);

        double mem5 = (mem1 + mem4) / 2;

        System.out.println("Uw gemiddelde van de 2 hoogste cijfers is: " + mem5);
    }
}
