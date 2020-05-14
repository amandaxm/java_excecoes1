package entities;


public class OutsourceEmployee extends Employee {

	private double additionalCharge;

	@Override
	public double valorReceber(){

		return super.valorReceber() + 1.1 * (additionalCharge);

	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	public OutsourceEmployee(String nome, int hours, double valuePerHour,
			double additionalCharge) {
		super(nome, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public OutsourceEmployee() {
	}

}
