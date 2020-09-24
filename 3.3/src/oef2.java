import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class oef2 {
    public static void main(String[] args) throws IOException {
        File file = new File("rekeningen(fb-style).txt");
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print("742-1546795-46 ");
        printWriter.print("3245.50 ");
        printWriter.print("120.00 ");
        printWriter.println("0.00");

        printWriter.print("481-5679823-75 ");
        printWriter.print("1457.00 ");
        printWriter.print("345.45 ");
        printWriter.println("453.50");

        printWriter.print("001-4875695-26 ");
        printWriter.print("2487.85 ");
        printWriter.print("143.80 ");
        printWriter.println("164.95");
        printWriter.close();

        Scanner test = new Scanner(new File("rekeningen(fb-style).txt"));
        String rek1 = test.next();
        double vs1 = test.nextDouble();
        double str1 = test.nextDouble();
        double afh1 = test.nextDouble();

        String rek2 = test.next();
        double vs2 = test.nextDouble();
        double str2 = test.nextDouble();
        double afh2 = test.nextDouble();

        String rek3 = test.next();
        double vs3 = test.nextDouble();
        double str3 = test.nextDouble();
        double afh3 = test.nextDouble();

        double tot1 = (vs1 + str1) - afh1;
        double tot2 = (vs2 + str2) - afh2;
        double tot3 = (vs3 + str3) - afh3;

        System.out.println(rek1 + " // " + vs1 + " + " + str1 + " - " + afh1 + " = " + tot1);
        System.out.println(rek2 + " // " + vs2 + " + " + str2 + " - " + afh2 + " = " + tot2);
        System.out.println(rek3 + " // " + vs3 + " + " + str3 + " - " + afh3 + " = " + tot3);

        File file2 = new File("rekeningen_NIEUW(fb-style).txt");
        FileWriter newfileWriter = new FileWriter(file2);
        PrintWriter newprintWriter = new PrintWriter(newfileWriter);
        newprintWriter.print(rek1 + " ");
        newprintWriter.println(tot1);
        newprintWriter.print(rek2 + " ");
        newprintWriter.println(tot2);
        newprintWriter.print(rek3 + " ");
        newprintWriter.println(tot3);
        newprintWriter.close();


    }
}
