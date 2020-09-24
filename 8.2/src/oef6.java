
public class oef6 {
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int lengte = test.length;
        int tot = 0;
        for (int i = 0; i < lengte - 1; i++) {
            if (test[i] % 2 != 0) {
                tot = tot + test[i];
            }
        }
        System.out.println(tot);
    }
}
