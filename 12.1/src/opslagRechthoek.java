import java.util.Scanner;

public class opslagRechthoek {
    private double b;
    private double h;

    public opslagRechthoek() {
        this.b = 0;
        this.h = 0;
    }

    public static void main(String[] args) {
        opslagRechthoek opsl = new opslagRechthoek();
        System.out.println("Welkom bij het wonderbaarlijke rechthoekenprogrammaberekenaarsprogramma");
        System.out.println("Trade mark patent pending copyright me 2020-2020");
        opsl.setAll();
        opsl.printAll();

    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setAll() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer een basis in");
        this.setB(scanner.nextDouble());
        System.out.println("Voer een hoogte in");
        this.setH(scanner.nextDouble());
    }

    public void printAll() {
        System.out.println("Uw rechthoek is " + this.getB() + " op " + this.getH() + " en heeft een S van " + this.getB() * this.getH());
    }
}
