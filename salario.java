package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class salario {

public static void main(String[]args) { 
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	
	String id= sc.next();
	double cargahoraria =  sc.nextDouble();
	double valorhoras =  sc.nextDouble();
	
	double salario=valorhoras*cargahoraria;
	
	System.out.printf("numero= "+id);
	System.out.printf("%nsalario=R$ %.2f ",salario);
	
	
	
	sc.close();
	}
}
