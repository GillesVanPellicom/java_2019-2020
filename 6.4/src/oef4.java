
public class oef4 {
    public static void main(String[] args) {
        int jaar = 1999;
        int pop = 60000000;
        while (jaar > 0) {
            jaar = jaar - 40;
            pop = pop / 2;
            System.out.println("jr " + jaar);
            System.out.println("pop " + pop);
        }
    }
}
