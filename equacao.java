package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class equacao {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc=new Scanner (System.in);
	
	int x = sc.nextInt();
	int y = sc.nextInt();
	int z = sc.nextInt();
	int w = sc.nextInt();
	
	int A = x*y;
	int B = z*w;
	int C = A-B;
	
	System.out.printf("valor final:"+C);

	sc.close();
	}

}
