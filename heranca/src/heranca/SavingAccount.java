package heranca;

public class SavingAccount extends Account {
	private Double interestRate;
	public SavingAccount() {
		super();
	}
	public Double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);//construtor da superclasse é executado
		this.interestRate = interestRate;
	}
	
	public void updateBalance(){
	balance=balance	* interestRate;//taxa de juros
	}
	//withdraw, saque, se for da poupanca savingsAccount, nao devera cobrar taxa
	
	@Override public void  withdraw(double amount) {
	
		balance -= amount;	
	 }
	
}


