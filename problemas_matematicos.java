package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class problemas_matematicos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
 		double metroQuadrado = sc.nextDouble();
	
		double area = largura*comprimento;
		double preco = area*metroQuadrado;
		
		System.out.printf("�REA =%.2f ",area);
		System.out.printf("%nPRE�O =%.2f ",preco);
		
		
sc.close();
	}

}
