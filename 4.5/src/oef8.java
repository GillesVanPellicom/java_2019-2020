import java.util.Scanner;

public class oef8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hoeveel kg appels wilt u?");
        double hoev = scanner.nextDouble();
        double prs = Math.round(hoev * 1.65);
        System.out.println("U moet " + prs + " betalen voor " + hoev + " kg appelen. Betalen in briefjes AUB");
        double bet = scanner.nextInt();
        if (bet < prs) {
            double tekort = prs - bet;
            System.out.println("U komt " + tekort + " tekort.");
        } else {
            double genoeg = bet - prs;
            System.out.println("Bedankt voor u aankoop! U krijgt " + genoeg + " terug.");
        }

    }
}
