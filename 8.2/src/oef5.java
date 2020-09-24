
public class oef5 {
    public static void main(String[] args) {
        int[] q = {12, 12, 83, 28, 29, 94, 18, 49, 28, 40, 28, 40};
        int[] p = {12, 12, 83, 28, 29, 94, 18, 49, 28, 40, 28, 40};
        int gelijk = 0;
        for (int i = 0; i < q.length; i++) {
            if (q[i] != p[i]) {
                gelijk++;
            }
        }
        if (gelijk > 0) {
            System.out.println("Niet identiek");
        } else {
            System.out.println("identiek");
        }
    }
}
