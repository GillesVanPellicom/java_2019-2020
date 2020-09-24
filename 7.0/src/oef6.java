
public class oef6 {
    public static void main(String[] args) {
        int mem1 = 99;
        int mem2 = 0;
        for (int i = 1; i <= mem1; i++) {
            if (i % 2 != 0) {
                mem2 += i;
            }
        }
        System.out.println(mem2);
    }
}
