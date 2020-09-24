import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class oef7 {
    public static void main(String[] args) throws IOException {
        File file = new File("nsl");
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("Gilles");
        printWriter.println("Bornem");
        printWriter.println("16");
        printWriter.print("Gilles ");
        printWriter.print("Bornem ");
        printWriter.println("16");
        printWriter.close();

        Scanner nnsl = new Scanner(new File("nsl"));

        String naam1 = nnsl.nextLine().trim();
        String stad1 = nnsl.nextLine().trim();
        int leeft1 = nnsl.nextInt();
        String naam2 = nnsl.next().trim();
        String stad2 = nnsl.next().trim();
        int leeft2 = nnsl.nextInt();

        if (naam1.equals(naam2)) {
            if (stad1.equals(stad2)) {
                if (leeft1 == leeft2) {
                    System.out.println("Correctemento");
                } else System.out.println("Niet correct");
            } else System.out.println("Niet correct");
        } else System.out.println("Niet correct");

    }
}
