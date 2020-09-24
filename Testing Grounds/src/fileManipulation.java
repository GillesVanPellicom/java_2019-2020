import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class fileManipulation {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("ahoi");
        printWriter.close();

    }
}
