package aplicacao;

import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner (System.in);
	
	int x = sc.nextInt();
	int y = sc.nextInt();
	
	
	int z = x+y;
	
	System.out.println("valor final foi:"+z);
	
	sc.close();
	}

}
