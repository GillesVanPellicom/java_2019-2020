
public class Dier {
    private String naam;
    private int gewicht;
    private int aantPoten;
    private Boolean vleugels;

    public Dier() {
        this.naam = "Fien";
        this.gewicht = 12;
        this.aantPoten = 4;
        this.vleugels = false;
    }

    public String getNaam() {
        return this.naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getGewicht() {
        return this.gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public int getPoten() {
        return this.aantPoten;
    }

    public void setPoten(int aantPoten) {
        this.aantPoten = aantPoten;
    }

    public Boolean getVleugels() {
        return this.vleugels;
    }

    public void setVleugels(Boolean vleugels) {
        this.vleugels = vleugels;
    }
}
