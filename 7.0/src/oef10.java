import java.util.Scanner;

public class oef10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ik ben lui, dus ik schrijf geen deftige code");
        System.out.println("Vanaf er  ��n 'geen priem' verschijnt, is het geen priemgetal");
        int get = scanner.nextInt();
        for (int i = 2; i < get; i++) {
            if (get % i != 0) {
                System.out.println("pr");
            } else {
                System.out.println("geen priem");
            }
        }
    }
}
