import java.util.Scanner;

public class oef6 {
    public static void main(String[] args) {
        Scanner bank = new Scanner(System.in);
        System.out.println("Saldo?");
        double sald = bank.nextDouble();
        System.out.println("Amount?");
        double am = bank.nextDouble();
        double newsald = sald - am;
        if (sald < am) {
            System.out.println("No lol.");
        } else {
            System.out.println("No problemo! U saldo is: " + newsald);
        }
    }
}
