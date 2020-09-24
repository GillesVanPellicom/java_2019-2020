import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class oef11 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner lln1s = new Scanner(new File("leerling1.txt"));
        Scanner lln2s = new Scanner(new File("leerling2.txt"));
        double[] lln1p = new double[8];
        double[] lln2p = new double[8];
        int lln1gtlln2 = 0;
        for (int i = 0; i < 8; i++) {
            lln1p[i] = lln1s.nextDouble();
            lln2p[i] = lln2s.nextDouble();
            if (lln1p[i] > lln2p[i]) {
                lln1gtlln2++;
            }
        }
        System.out.println("Leerling 1 heeft " + lln1gtlln2 + " betere toetsen dan leerling 2");

    }
}
