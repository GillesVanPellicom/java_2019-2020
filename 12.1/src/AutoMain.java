import java.util.Scanner;

public class AutoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Auto auto = new Auto();
        auto.setMerk("Citro�n");
        auto.setModel("C4");
        auto.setSnelheid(12);
        auto.setSchakel(2);

        Auto auto2 = new Auto();

        System.out.println("Het model van auto 2 is niet ok eh. Chancheer het please");
        auto2.setModel(scanner.next());

        System.out.println("Merk   Model   Snelheid   schakel");
        System.out.println(
                auto.getMerk() + "\t" + auto.getModel() + "\t" + auto.getSnelheid() + "\t" + auto.getSchakel());
        System.out.println(
                auto2.getMerk() + "\t" + auto2.getModel() + "\t" + auto2.getSnelheid() + "\t" + auto2.getSchakel());
    }
}
