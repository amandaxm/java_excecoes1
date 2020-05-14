package entities;


public class Employee {

	private String nome;
	private int hours;
	private double valuePerHour;

	public Employee() {
	}

	public Employee(String nome, int hours, double valuePerHour) {
		super();
		this.nome = nome;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public double valorReceber() {
		return valuePerHour * hours;
	}
}
