package heranca;

public class BusinessAccount extends Account {//herda account todos dados
//acrescentar a mais
		private Double loanLimit;
	
		public BusinessAccount() {
		super();
	}
	//criar construtor com argumentos, passar todos dados como paramentro

		public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {

		super(number, holder, balance);//chamar o construtor da superclasse
			this.loanLimit = loanLimit;
		}

		public Double getLoanLimit() {
			return loanLimit;
		}

		public void setLoanLimit(Double loanLimit) {
			this.loanLimit = loanLimit;
		}
		
		//operação de emprestio
		public void loan(Double amount) {
			if(amount <= loanLimit) {
				balance +=amount -10.00;//taxa de emprestimo	
			}
			}
		
		@Override public void  withdraw(double amount) {	
		super.withdraw(amount);
		balance -= 2;
		
		 }
	
}
