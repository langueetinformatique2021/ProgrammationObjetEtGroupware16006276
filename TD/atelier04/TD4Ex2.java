package atelier02;

public class TD4Ex2 { 
	public static void main(String[] args) {
	String s1 = "qwerty"; 
	String s2 = "ytrewq";
	boolean miroite = miroite(s1, s2);
	System.out.println(miroite);
	}
public static boolean miroite(String s1, String s2) {
	if (s1.length() != s2.length()) {
			return false;
			}
	int i1 = 0;
	int i2 = s2.length()-1;
	boolean flag = true;	
	do {
		if (s1.charAt(i1) != s2.charAt(i2)) {
			flag=false;
			break;
		}
		i1++;
		i2--;
	} while (i1<s1.length());
		return flag;
		}
	}