package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintService ps = new PrintService();
		System.out.println("Quantos valores");
		int n = sc.nextInt();
		for(int i = 0;i<n;i++) {
			int value = sc.nextInt();
			ps.addValue(value);
			
			
		}
		ps.print();
		
	}

}
