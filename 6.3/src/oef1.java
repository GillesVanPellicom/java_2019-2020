import java.util.Scanner;

public class oef1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String naam = null;
        while (naam.contentEquals(null)) {
            System.out.println("ful in ton naame");
            naam = scanner.nextLine();
        }
        System.out.println(naam);
    }
}
