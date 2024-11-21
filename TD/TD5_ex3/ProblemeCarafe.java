package TD05;

public class ProblemeCarafe {
	/**exécutable, point d'entrer
	 */
	public static void main (String[] args) {
		Carafe carafe7 = new Carafe(7);
		Carafe carafe4 = new Carafe(4);
		/** Print du cas initiale
		 */
		System.out.println("contenu de la carafe7 : " + carafe7.Contenu());
		System.out.println("contenu de la carafe4 : " + carafe4.Contenu()+"\n");		
		carafe7.remplir();
		
		System.out.println("contenu de la carafe7 : " + carafe7.Contenu());
		System.out.println("contenu de la carafe4 : " + carafe4.Contenu()+"\n");
		carafe7.transvaser(carafe4);
		
		System.out.println("contenu de la carafe7 : " + carafe7.Contenu());
		System.out.println("contenu de la carafe4 : " + carafe4.Contenu()+"\n");
		carafe4.vider();
		
		System.out.println("contenu de la carafe7 : " + carafe7.Contenu());
		System.out.println("contenu de la carafe4 : " + carafe4.Contenu()+"\n");
		carafe7.transvaser(carafe4);
		
		System.out.println("contenu de la carafe7 : " + carafe7.Contenu());
		System.out.println("contenu de la carafe4 : " + carafe4.Contenu()+"\n");
		carafe7.remplir();
		
		System.out.println("contenu de la carafe7 : " + carafe7.Contenu());
		System.out.println("contenu de la carafe4 : " + carafe4.Contenu()+"\n");		
		carafe7.transvaser(carafe4);
		
		System.out.println("contenu de la carafe7 : " + carafe7.Contenu());
		System.out.println("contenu de la carafe4 : " + carafe4.Contenu()+"\n");
		carafe4.vider();
		
		System.out.println("contenu de la carafe7 : " + carafe7.Contenu());
		System.out.println("contenu de la carafe4 : " + carafe4.Contenu()+"\n");
		carafe7.transvaser(carafe4);
		
		System.out.println("contenu de la carafe7 : " + carafe7.Contenu());
		System.out.println("contenu de la carafe4 : " + carafe4.Contenu()+"\n");
		carafe7.remplir();
		
		System.out.println("contenu de la carafe7 : " + carafe7.Contenu());
		System.out.println("contenu de la carafe4 : " + carafe4.Contenu()+"\n");		
		carafe7.transvaser(carafe4);
		
		System.out.println("contenu de la carafe7 : " + carafe7.Contenu());
		System.out.println("contenu de la carafe4 : " + carafe4.Contenu()+"\n");		

		

	}
}