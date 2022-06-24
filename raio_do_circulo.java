package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class raio_do_circulo {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc=new Scanner (System.in);
	
	double pi = 3.14159;
	
	double x = sc.nextDouble();
	
	double z = x*x*pi;
	
	System.out.printf("o valor do raio foi:%.4f",z);
	
	sc.close();
	}

}
