package TD06;

public class testChat {

    public static void main(String[] args) {
        // Create an instance of Chat
        chat chat = new chat("chat domestique", 4);

        // Test the presente method
        chat.presente();

        // Test the crie method
        chat.crie();

        // Test the domestiquer method
        chat.domestiquer("Bilbo");

        // Test the nom method
        System.out.println("Nom de l'animal : " + chat.nom());
    }
}
