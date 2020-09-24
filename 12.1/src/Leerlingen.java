import java.util.Scanner;

public class Leerlingen {
    private String naam;
    private String voornaam;
    private String klas;

    public Leerlingen() {
        this.klas = "5BI";
        this.naam = "Bin Superman";
        this.voornaam = "Ahmet";
    }

    public static void main(String[] args) {
        Leerlingen lln = new Leerlingen();
        lln.printAll();
        lln.setAll();
        lln.printAll();
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getKlas() {
        return klas;
    }

    public void setKlas(String klas) {
        this.klas = klas;
    }

    public void setAll() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer een nieuwe klas in");
        this.setKlas(scanner.next());
        System.out.println("Voer een nieuwe achternaam in");
        this.setNaam(scanner.next());
        System.out.println("Voer een nieuwe voornaam in");
        this.setVoornaam(scanner.next());
    }

    public void printAll() {
        System.out.println("Leerling " + this.getVoornaam() + " " + this.getNaam() + " zit in klas " + this.klas);
    }


}
