import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class oef1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner oef1 = new Scanner(new File("oef1.txt"));
        double getal = oef1.nextInt();
        System.out.println(getal);
    }
}
