import java.util.Arrays;
import java.util.Scanner;

public class oef1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vul punten in");
        int[] punten = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        System.out.println("Vul namen in");
        String[] namen = {scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next()};
        Arrays.sort(punten);
        int lengte = punten.length;
        int tot = 0;
        System.out.println(namen[0] + ": Laagste=" + punten[0] + " " + namen[lengte - 1] + ": Hoogste=" + punten[lengte - 1]);
        for (int i = 0; i < lengte; i++) {
            tot = tot + punten[i];
        }
        double gem = tot / punten.length;
        System.out.println("Gemiddeld= " + gem);
    }
}

