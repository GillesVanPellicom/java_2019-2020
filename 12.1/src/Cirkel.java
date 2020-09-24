import java.util.Scanner;

public class Cirkel {
    private final double r2 = r2m();
    private Double r;

    public Cirkel() {
        this.setR(12.0);
    }

    public Cirkel(double r2) {
        this.setR(r2);
    }

    public static void main(String[] args) {
        Cirkel cirkel = new Cirkel();
        System.out.println(cirkel.getO());
        System.out.println(cirkel.getS());
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }

    public double r2m() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public double getS() {
        return Math.PI * Math.pow(this.getR(), 2);
    }

    public double getO() {
        return 2 * Math.PI * this.getR();
    }
}
