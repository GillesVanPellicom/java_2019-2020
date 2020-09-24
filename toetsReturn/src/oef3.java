import java.util.Scanner;

public class oef3 {
    public static int bereken(int leeftijd) {
        return (leeftijd - 7) * 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leeftijd, uitkomst;
        leeftijd = 0;
        uitkomst = 0;
        System.out.println("geef je leeftijd in: ");
        leeftijd = scanner.nextInt();
        uitkomst = bereken(leeftijd);
        System.out.println("volgens plato zou de ideale leeftijd van je man " + uitkomst + " moeten zijn");
    }

}
