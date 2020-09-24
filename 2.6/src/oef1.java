import java.util.Scanner;

public class oef1 {
    public static void main(String[] args) {
        System.out.println("Please enter one word from the following sentence:");
        System.out.println("Ik heb me goed geamuseerd");
        Scanner one = new Scanner(System.in);
        String woord = one.next();
        String woord1 = woord.toLowerCase();
        String start = "ik heb me goed geamuseerd";
        String mem1 = start.substring(0, start.indexOf(woord1));
        String mem2 = start.substring(start.indexOf(woord1) + woord.length());
        System.out.println("You have selected: " + woord1);
        System.out.println("Please enter a word to replace '" + woord1 + "'");
        Scanner two = new Scanner(System.in);
        String woord3 = two.next();
        System.out.println("You have selected:" + woord3);
        String woord4 = woord3.toLowerCase();
        System.out.println(mem1 + woord4 + mem2);


    }
}
