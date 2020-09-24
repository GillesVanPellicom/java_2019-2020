
public class bubbleSortTest {
    public static void main(String[] args) {
        int[] a = {1, 4, 2, 9, 2};
        boolean sorted = false;
        int temp = 0;
        while (!sorted) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println(sorted);
    }
}
