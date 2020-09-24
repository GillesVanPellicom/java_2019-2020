import java.util.Scanner;

public class oef4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, fact = 1;
        int number = scanner.nextInt();
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}

