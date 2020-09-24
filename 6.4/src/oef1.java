import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class oef1 {
    public static void main(String[] args) throws IOException {

        File file = new File("temp.txt");
        FileWriter filewriter = new FileWriter(file);
        PrintWriter printwriter = new PrintWriter(filewriter);

        int temp = -40;

        while (temp < 40) {
            double far = temp * 1.8 + 32;
            printwriter.println(temp + " | " + far);
            temp += 5;
        }
        double far2 = temp * 1.8 + 32;
        printwriter.println(temp + " | " + far2);
        printwriter.close();
    }
}
