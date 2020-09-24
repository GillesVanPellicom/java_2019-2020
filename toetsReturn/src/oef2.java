import java.util.Scanner;

public class oef2 {
    public static int ideale_leeftijd(int leeftijd) {
        return leeftijd / 2 + 7;
    }

    public static void main(String[] args) {
        int leeftijd, uitkomst;
        uitkomst = 0;
        leeftijd = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("geef je leeftijd in: ");
        leeftijd = scanner.nextInt();
        uitkomst = ideale_leeftijd(leeftijd);
        System.out.println("De ideale leeftijd (volgens Plato) van je vrouw zou: " + uitkomst + " moeten zijn.");
    }
}
