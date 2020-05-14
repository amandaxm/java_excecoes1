package application;

import heranca.Account;
import heranca.SavingAccount;

public class Program {
	public static void main(String[] args) {
		/*
		Account acc= new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		//todos atributos da classe account
		
		
		//USANDO UPCASTING
		//pegar obj businessaccount e atribuir para account
		
		Account acc1 = bacc;
		
		Account acc2= new BusinessAccount(1003,"bob", 0.0, 200.0);
		
		Account acc3= new SavingAccount(1004,"Ana", 0.0, 0.01);
	
		//DOWNCASTING
		//superclasse para subclasse
		
		BusinessAccount acc4 = (BusinessAccount)acc2;//nao e natural 
		acc4.loan(100.00);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		//acc3 saving account nao pode ser uma businessAccoount
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.00);
			System.out.println("Loan! ");
		}
	
		if (acc3 instanceof SavingAccount) {
			SavingAccount acc5 =(SavingAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}**/
	
		
		/*
		Account acc1 = new Account(1001, "Alex", 1000.0);
	acc1.withdraw(200.0);
	System.out.println(acc1.getBalance());
	//TESTAR SOBREPOSIÇÃO
	Account acc2 = new SavingAccount(1002, "Matia", 1000.00, 0.01);
	//upcasting
	acc2.withdraw(200.0);
	System.out.println(acc2.getBalance());
	
	Account acc3 = new BusinessAccount(1003, "M", 1000.00, 0.01);
	//upcasting
	acc3.withdraw(200.0);
	System.out.println(acc3.getBalance());
**/
	Account x = new Account(1002, "Allex",1000.00);
	Account y = new SavingAccount(1023,"Maria",1000.0,0.01);

		x.withdraw(50.0);
		y.withdraw(50.0);
		
	System.out.println(x.getBalance());
	System.out.println(y.getBalance());
	

	}
}
