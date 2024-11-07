package atelier02;

public class TD4Ex1 { 
	public static void main(String[] args) {
		int p1 = 10, p2 = 9, p3 = -1;//p4 = 4, p5 = 8;
		//fonction retournant la valeur maximum parmi les varialbles p1-p3
		int max = p1;
		if(p2>p1) {
		max=p2;
		}
		if (p3>max) {
		max = p3;
		}	
		System.out.println("Le maximum est: " + max);
		
		//fonction retournant la valeur minimal parmi les varialbles p1-p3
		int min = p1;
		if(p2<p1) {
		min=p2;
		}
		if (p3<min) {
		min = p3;
		}
		System.out.println("Le minimum est: " + min);

		//fonction retournant la median parmi les variable p1-p3
		int med = p1;	
		if(p1>p2 && p1<p3) {
			med=p1;
		}
		if (p2>p3 && p2<p1) {
			med=p2;
		}
		else { 
			med = p3;
		}
		System.out.println("La mediane : " + med);
	}
}

		
		/*int min = p1;
		if(p2<p1) {
		min=p2;
		}
		if (p3>min) {
		min = p3;
		}
		if (p4>min) {
		min=p4;
		}
		if (p5>min) {
		min = p5;
		}
		System.out.println("Le minimum est: " + min);
		}
}

int p1 = -1, p2 = 9, p3 = 8, p4 = 4, p5 = 8;
		int max;
		
		if (p1 > p2) {
			if (p1 > p3) 
				max = p1;
			else 
				max = p3;
		}
		else {
			if (p2 > p3)
				max = p2;
			else
				max = p3;
		}
		
		System.out.println(max);
		
		int min;
		
		if (p1 < p2) {
			if(p2 < p3)
				min = p1;
			else
				min = p3;
		}
				
		}
		 
		 * 
		 * à tester avec les six cas possibles 
		 *  p1 = 10, p2 = 9, p3 = -1; p1 > p2 > p3 resultats attendus max = 10 min=-1 med = 9
		 *  p1 = 11, p2 = -9, p3 = -2; p1 > p3 > p2 resultats attendus max = 11 min=-9 med = -2
		 *  p1 = -10, p2 = 19, p3 = 1; p2 > p3 > p1 resultats attendus max = 10 min=-10 med = 1
		 *  p1 = 12, p2 = 91, p3 = -11; p2 > p1 > p3 resultats attendus max = 91 min=-11 med = 12	 
		 *  p1 = -100, p2 = -99, p3 = 12; p3 > p2 > p1 resultats attendus max = 12 min=-100 med = -99
		 *  p1 = 1, p2 = -9, p3 = 11; p3 > p1 > p2	 resultats attendus max = 11 min=-9 med = 1
		 */
		
		
		
