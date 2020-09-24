
public class oef3 {
    public static void main(String[] args) {
        double prijs = 19.95;
        int percent = 30;
        double korting = prijs / 100 * percent;
        double eindprijs = prijs - korting;
        System.out.println(eindprijs);


    }

}
