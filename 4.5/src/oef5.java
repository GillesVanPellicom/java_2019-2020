import java.util.Scanner;

public class oef5 {
    public static void main(String[] args) {
        System.out.println("Wie was de eerste wereldkampioen schaken?");
        Scanner quiz = new Scanner(System.in);
        String antw = quiz.next().toLowerCase();
        if (antw.contentEquals("steinitz")) {
            System.out.println("Correcetemento!");
        } else {
            System.out.println("EUUUH!");
        }
    }
}
