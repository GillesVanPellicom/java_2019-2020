import java.util.Scanner;

public class DierMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Dier dier = new Dier();
		Dier dier2 = new Dier();
		dier2.setNaam("Unnamed");
		dier2.setGewicht(23);
		dier2.setPoten(5);
		dier2.setVleugels(true);
		System.out.println("Naam:   Gewicht:   #Poten:   Gevleugeld:");
		System.out.println(dier.getNaam() + "   " + dier.getGewicht() + "   " + dier.getPoten() + "   " + dier.getVleugels());
		System.out.println(dier2.getNaam() + "   " + dier2.getGewicht() + "   " + dier2.getPoten() + "   " + dier2.getVleugels());
		System.out.println("Het gewicht van " + dier.getNaam() + " zal ondertussen al veranderd zijn. Voer het nieuwe gewicht in:");
		dier.setGewicht(scanner.nextInt());
		System.out.println("Naam:   Gewicht:   #Poten:   Gevleugeld:");
		System.out.println(dier.getNaam() + "   " + dier.getGewicht() + "   " + dier.getPoten() + "   " + dier.getVleugels());
		System.out.println(dier2.getNaam() + "   " + dier2.getGewicht() + "   " + dier2.getPoten() + "   " + dier2.getVleugels());

	}
}
