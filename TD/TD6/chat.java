package TD06;

public class chat extends felin implements domesticable {
    private String nom;

    public chat(String type, int pattes) {
        super(type, pattes);
    }

    @Override
    public void domestiquer(String nom) {
        this.nom = nom;
        System.out.println("Le chat a été domestiqué et s'appelle " + nom);
    }

    @Override
    public String nom() {
        return nom;
    }

    @Override
    public void crie() {
        System.out.println("Le chat miaule!");
    }
}
