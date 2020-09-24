import java.util.Scanner;

public class oef8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String zin = scanner.nextLine();
        int mem1 = zin.length();
        int mem2 = 0;
        int mem3 = 0;
        int s = 0;
        int z = 0;
        String letter = null;
        String letter2 = null;
        for (int i = 0; i < mem1; i++) {
            letter = zin.substring(i, i + 1);
            if (letter.contentEquals("s")) {
                s++;
            } else if (letter.contentEquals("z")) {
                z++;
            }
        }
        System.out.println("s: " + s + " z: " + z);

    }
}
