
public class oef5 {
    public static void main(String[] args) {
        int jaar = 2006;
        double pop = 6500000000L;
        while (pop < 10000000000L) {
            jaar = jaar + 1;
            double ppr = pop / 100 * 1.2;
            pop = pop * ppr;
            System.out.println("jaar: " + jaar + " | pop: " + pop + " ppr" + ppr);
        }
    }
}
