
public class oef4 {
    public static void main(String[] args) {
        int am = 105;
        if (am > 100) {
            double prs1 = ((am - 100) * 0.03) + 5;
            System.out.println(prs1);
        } else {
            System.out.println(am * 0.05);
        }
    }
}
