package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data:");
			System.out.print("Number:");
			int number = sc.nextInt();
			System.out.println("Nome: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.println("Initial balance ");
			Double balance = Double.parseDouble(sc.nextLine());
			System.out.println("Withdraw limit");
			Double limiteSaque = Double.parseDouble(sc.nextLine());
			
			Account acc = new Account(number, holder, balance, limiteSaque);
			
			System.out.print("Enter amount for withdraw: ");
			Double valorSaque = sc.nextDouble();
			acc.withdraw(valorSaque);
			System.out.print("New balance: "+ acc.getBalance());
			
			
	}catch (DomainException e) {

		System.out.println("Erro ao sacar: " + e.getMessage());
	
	}
		
		sc.close();

	}

}
