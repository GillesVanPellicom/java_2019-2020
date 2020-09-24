import java.util.Scanner;

public class CD {
    private String titel;
    private String uitvoerder;
    private int aant;

    public CD() {
        this.titel = "Het beste van de Gers Pardoel";
        this.uitvoerder = "Gers Pardoel";
        this.aant = 12;
    }

    public static void main(String[] args) {
        CD cd = new CD();
        cd.printAll();
        cd.setAll();
        cd.printAll();

    }

    public int getAant() {
        return aant;
    }

    public void setAant(int aant) {
        this.aant = aant;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getUitvoerder() {
        return uitvoerder;
    }

    public void setUitvoerder(String uitvoerder) {
        this.uitvoerder = uitvoerder;
    }

    public void setAll() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer een nieuwe albumtitel");
        this.setTitel(scanner.nextLine());
        System.out.println("Voer een nieuwe uitvoerder in");
        this.setUitvoerder(scanner.nextLine());
        System.out.println("Voer een nieuw aantal nummers in");
        this.setAant(scanner.nextInt());
    }

    public void printAll() {
        System.out.println(this.getTitel());
        System.out.println(this.getUitvoerder());
        System.out.println(this.getAant());
    }
}
