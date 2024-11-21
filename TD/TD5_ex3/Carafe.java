package TD05;

public class Carafe {
	/**Atributs privés de la class
	 */
	private int contenu_;
	private int capacité_;
	/**
	 * Constructeur
	 * @param Carafe initialment vide
	 */
	public Carafe(int capacité) {
		this.capacité_ = capacité;
		this.contenu_ = 0;
	}
	/**@return le contenu
	 */
	public int Contenu() {
		return this.contenu_;
	}
	/**@return la capacité
	 */
	public int Capacité() {
		return this.capacité_;
	}
	/**Méthode pour remplir
	 */
	 
	public void remplir() {
		contenu_ = capacité_;
	}
	/**Méthode pour vider
	*/
	public void vider() {
		contenu_ = 0;
	}
	/**@param autreCarafe la carafe qui recoit l'action de transverser
	 * Method pour transvaser 
	 */
	public void transvaser(Carafe autreCarafe) { 
		int atv = Math.min(this.contenu_, autreCarafe.capacité_ - autreCarafe.contenu_); 
		this.contenu_ -= atv; 
		autreCarafe.contenu_ += atv;
	}
}
		
		

