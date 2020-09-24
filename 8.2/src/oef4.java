import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class oef4 {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("oef4cijfers.txt");
		Scanner scanner = new Scanner(file);

		int[] freq = new int[10];
		for (int i = 0; i < 40; i++) {
			freq[scanner.nextInt()]++;
		}


		for (int j = 0; j < freq.length; j++) {
			System.out.println("het Getal " + j + " komt " + freq[j] + " voor.");
		}
	}
}
