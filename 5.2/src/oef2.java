import java.util.Scanner;

public class oef2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("HOEVEEL HUISDIER JOE HAS?");
        int hsdr = scanner.nextInt();
        switch (hsdr) {
            case 0:
                System.out.println("aangepast 0");
                break;
            case 1:
                System.out.println("aangepast 1");
                break;
            case 2:
                System.out.println("aangepast 2");
                break;
            case 3:
                System.out.println("aangepast 3");
                break;
            default:
                System.out.println("niet aangepast");
        }
    }
}
