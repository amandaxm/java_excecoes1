package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//instanciar string, integer etc
		PrintService<String> ps = new PrintService<>();
		System.out.println("Quantos valores");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);

		}
		
		ps.print();
		String x = ps.first();
		System.out.println(" First"+x);
		sc.close();
	}

}
