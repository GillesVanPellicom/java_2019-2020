import java.util.Scanner;

public class oef10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String woord = scanner.next().toLowerCase();
        if (woord.substring(0, 1).contentEquals("a") || woord.substring(0, 1).contentEquals("e") || woord.substring(0, 1).contentEquals("o") || woord.substring(0, 1).contentEquals("u") || woord.substring(0, 1).contentEquals("i")) {
            System.out.println(woord + "boe");
        } else {
            String mem1 = woord.substring(0, 1);
            System.out.println(woord.substring(1, woord.length()) + mem1);
        }
    }
}
