import java.util.Scanner;

public class oef3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wrd = scanner.next();
        int ie = wrd.indexOf("e");
        int it = wrd.indexOf("t");
        if (ie >= 0 && it >= 0) {
            if (ie > it) {
                System.out.println("t is eerst");
            } else {
                System.out.println("e is eerst");
            }
        } else {
            System.out.println("Geen e en/of t");
        }
    }
}
