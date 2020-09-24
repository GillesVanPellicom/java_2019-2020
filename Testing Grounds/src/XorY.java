import java.util.concurrent.ThreadLocalRandom;

public class XorY {
    public static void main(String[] args) {

        int random1 = ThreadLocalRandom.current().nextInt(0, 1 + 1);

        if (random1 == 1) {
            System.out.println("It's a boy! (XY 50% kans)");
        } else {
            System.out.println("It's a girl! (XX 50% kans)");
        }
    }
}
