package entities;

public class PessoaJuridica extends Pessoa {

	private Integer numeroFuncionarios;
	
	public PessoaJuridica() {}
	
	@Override
	public double valorImposto() {
		if (numeroFuncionarios >10) {

			return (super.getRendaAnual() * 0.14);
		} else {

			return (super.getRendaAnual() * 0.16);
		}

	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

}
