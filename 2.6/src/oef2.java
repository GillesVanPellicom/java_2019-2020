import java.util.Scanner;

public class oef2 {
    public static void main(String[] args) {
        String qbf = "THE QUICK BROWN FOX JUMPED OVER A LAZY DOG";
        Scanner letter = new Scanner(System.in);
        String letter1 = letter.next();
        String letter2 = letter1.toUpperCase();
        int output = qbf.indexOf(letter2);
        System.out.println(output);

    }
}
