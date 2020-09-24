import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class oef1t1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("oef1.txt"));
        int getal = scanner.nextInt();
        System.out.println(getal);
    }
}
