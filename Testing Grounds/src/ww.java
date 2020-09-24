import java.util.Scanner;

public class ww {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("voer ww in...");
        String ww = scanner.nextLine();
        String check = "test";
        if (ww.equals(check)) {
            System.out.println("good password");
        } else {
            System.out.println("shitslecht wachtwoord");
        }
    }
}
