package TD06;

public class felin extends animal {

protected boolean domestique = false;


public felin(String type, int pates) {
	super(type, 4);
}

public void presente() {
	super.presente();
	String etat = (domestique) ? "domesique" : "sauvage";
	System.out.println("je suis vraiment un animal " + etat);
}

public void crie() {
	System.out.println("rhrhininrhrh felin"); 
	
}

@Override
public String nom() {
	return null;
}}
