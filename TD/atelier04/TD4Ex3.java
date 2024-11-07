package atelier02;

public class TD4Ex3 { 
	public static void main(String[] args) {
	String[] prenoms = {"Chistian", "Karen", "Victoria", "Agatha", "Philippe", "Djamé"};
	int imin=0;
	prenoms[imin].compareTo(prenoms[1]);
}
int imin;

// Selection Sort Algorithm
for (int i = 0; i < prenoms.length - 1; i++) {
    imin = i;
    for (int j = i + 1; j < prenoms.length; j++) {
        if (prenoms[j].compareTo(prenoms[imin]) < 0) {
            imin = j;
        }
    }s
    // Swap prenoms[i] and prenoms[imin]
    String temp = prenoms[i];
    prenoms[i] = prenoms[imin];
    prenoms[imin] = temp;
}

// Print sorted array
for (String prenom : prenoms) {
    System.out.println(prenom);
}
}
}