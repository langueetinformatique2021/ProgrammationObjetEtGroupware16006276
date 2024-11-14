public class Carafe {
	private int cont;
	private int cap;
/**
 * 
 * @param
 */
public Carafe(int cap) {
		this.cap = cap;
		this.cont = 0;
	
	}
public void rempl() {
    this.cont = this.cap; 
}
public void vide() {
    this.cont = 0; // 
}

/**
 * @return
 */
public int getContenu() { 
	return this.cont;
}
/**
 * @return
 * 
 */
public int getCapacite() { 
	return this.cap;
}
/**
 * @param
 */

public void transvaserDans(Carafe autreCarafe) {
		int quantiteTransvasable = Math.min(this.cont, autreCarafe.cap - autreCarafe.cont); 
		this.cont -= quantiteTransvasable; 
		autreCarafe.cont += quantiteTransvasable; } }