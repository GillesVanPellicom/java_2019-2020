
public class Lid {
    private String naam;
    private String spec;

    public Lid(String naam, String spec) {
        this.naam = naam;
        this.spec = spec;
    }

    public void print() {
        System.out.println(this.getNaam() + ", specialist in " + this.getSpec());
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

}
