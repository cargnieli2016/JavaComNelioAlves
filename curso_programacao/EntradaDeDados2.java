

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados Digitados: \n");
		
		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou " + y);
		System.out.println("Você digitou " + z);
		
		sc.close();
	}
}
