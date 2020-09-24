import java.util.Scanner;

public class oef11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jaar = scanner.nextInt();
        String mem1 = String.valueOf(jaar);
        String mem2 = mem1.substring((mem1.length()) - 1, mem1.length());


        if (jaar % 2 == 0) {
            if (mem2.equals("00") || jaar % 400 == 0) {
                System.out.println("it is not a schrikkeljaar eh");
            } else {
                System.out.println("It is a schrikkelyear eh.");
            }
        }

    }
}
