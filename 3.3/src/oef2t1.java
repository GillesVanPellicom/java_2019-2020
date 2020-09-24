import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class oef2t1 {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        FileWriter filewriter = new FileWriter(file);
        PrintWriter printwriter = new PrintWriter(filewriter);
        printwriter.println("test 123");
        printwriter.close();
        Scanner scanner = new Scanner(new File("test.txt"));
        String string = scanner.next();
        int Int = scanner.nextInt();
        System.out.println(string + " " + Int);
    }
}
