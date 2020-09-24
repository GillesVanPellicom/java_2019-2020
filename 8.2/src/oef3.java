
public class oef3 {
    public static void main(String[] args) {
        double[] p = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        double[] q = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        double tot = 0;
        for (int i = 0; i < 20; i++) {
            tot = tot + (q[i] * p[i]);
        }
        System.out.println(tot);
    }
}
