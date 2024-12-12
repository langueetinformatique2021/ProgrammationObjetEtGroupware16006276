package TD09;

import java.io.FileWriter;
import java.io.IOException;


public class MonPremierFichierTexte {
	public static void main(String[] args) {
		int num[] = { 21402871, 21104591, 21401764, 21408349, 21314076, 21109469, 21202064, 21415136, 21410005,
				21415557, 21200439, 21407911, 21101218, 28607925, 21400908, 21314636 };
		try (FileWriter writer = new FileWriter("LISTE.txt")) {
			for (int etudiant : num) {
				writer.write(num + System.lineSeparator());
			}
			System.out.println("Les noms ont ete ecrits dans le fichier LISTE.txt");
		}catch (IOException e) {
			System.out.println("Une erreur");
			e.printStackTrace();
		}
	}
}