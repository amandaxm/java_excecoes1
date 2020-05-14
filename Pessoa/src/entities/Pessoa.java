package entities;

public abstract class Pessoa {

	private String nome;
	private Double rendaAnual;
	
	public Pessoa() {}
	public abstract double valorImposto();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getRendaAnual() {
		return rendaAnual;
	}
	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	public Pessoa(String nome, Double rendaAnual) {
		
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	
	
}