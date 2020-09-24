import java.util.Locale;
import java.util.Scanner;

public class SCANNNER {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        test.useLocale(new Locale("n1", "BE"));
        int woord = test.nextInt();
        System.out.println(woord);


    }
}
