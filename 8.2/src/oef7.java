import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class oef7 {
    public static void main(String[] args) throws IOException {
        int[] a = {1, 28, 49, 28, 49, 27, 50, 14, 50, 9};
        File file = new File("oef8.txt");
        FileWriter filewriter = new FileWriter(file);
        PrintWriter printer = new PrintWriter(filewriter);
        Arrays.sort(a);
        for (int i = 0; i < a.length - 1; ) {
            printer.print(a[i]);
        }
        printer.close();
    }
}
