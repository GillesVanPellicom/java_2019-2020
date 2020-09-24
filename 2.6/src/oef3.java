import java.util.Scanner;

public class oef3 {
    public static void main(String[] args) {
        Scanner komma = new Scanner(System.in);
        String komma1 = komma.next();
        int komma2 = komma1.indexOf(".");
        String mem1 = komma1.substring(0, komma2);
        String mem2 = komma1.substring(komma2 + 1, komma1.length());
        System.out.println(mem1.length() + " / " + mem2.length());

    }
} 