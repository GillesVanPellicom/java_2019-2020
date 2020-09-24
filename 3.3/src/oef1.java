import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class oef1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner punten = new Scanner(new File("punten.txt"));
        String aard = punten.next();
        double aardDW1 = punten.nextDouble();
        double aardDW2 = punten.nextDouble();
        double aardGem = (aardDW1 + aardDW2) / 2;

        String gsch = punten.next();
        double gschDW1 = punten.nextDouble();
        double gschDW2 = punten.nextDouble();
        double gschGem = (gschDW1 + gschDW2) / 2;

        System.out.println(aard);
        System.out.println("DW1: " + aardDW1);
        System.out.println("DW2: " + aardDW2);
        System.out.println("gem: " + aardGem);

        System.out.println(gsch);
        System.out.println("DW1: " + gschDW1);
        System.out.println("DW2: " + gschDW2);
        System.out.println("Gem: " + gschGem);

    }
}
