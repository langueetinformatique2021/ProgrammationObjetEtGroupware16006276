package TD06;

/** Création et gestion d'animaux */
public abstract class animal {
	private String espece;
	protected int nb_pattes = 0;


	
	public abstract String nom();

	public animal(String type, int pattes) {
		espece = type;
		nb_pattes = pattes;
	}
	

	/** présentation des caractéristiques de l'animal */
	public void presente() {
		System.out.println("je suis un représentant de l'espèce des " + espece + " et j'ai " + nb_pattes + " pattes");
	}

	/** cri de l'animal */
	public abstract void crie();
}