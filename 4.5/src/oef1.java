
public class oef1 {
    public static void main(String[] args) {
        double bet = 380.55;
        if (bet >= 1) {
            double tip = (bet / 100) * 15;
            System.out.println("Amount is " + Math.round(tip));
        } else {
            System.out.println("Amount needs to be over 1");
        }
    }
}
