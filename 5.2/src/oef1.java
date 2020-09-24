import java.util.Scanner;

public class oef1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                a += 5;
                break;
            case 2:
                a += 10;
                break;
            case 3:
                a += 16;
                break;
            case 4:
                a += 34;
                break;
            default:
                a = 0;
                System.out.println(a);
        }
    }
}
