package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class estrutura_de_compra {
	public static void main(String[]args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		String codigo,codigo2;
		codigo = sc.next();
		codigo2 = sc.next();
		int quantidade = sc.nextInt();
		int quantidade2 = sc.nextInt();
		double valor = sc.nextDouble();
		double valor2 = sc.nextDouble();
		
		double dividendo = quantidade*valor;
		double dividendo2 = quantidade2*valor2;
		double total = dividendo+dividendo2;
		
		System.out.println("codigos dos produtos: ");
		System.out.println(codigo);
		System.out.println(codigo2);
		System.out.printf("%nvalor a pagar: %.2f",total);
		
	
	sc.close();
	
	}
}
