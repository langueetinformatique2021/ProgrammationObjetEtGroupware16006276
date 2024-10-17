package atelier02;


/**B contient la méthode 'divise' retournant la moitier d'un entier si A.treize return true
 * reuturn l'entier +2 dans le cas contraire)
 */
public class B
{
	public static int divise(int n) {
	
	if (A.treize(n) == true)
		return n/2;
	else
		return(n+2);
	}
}
