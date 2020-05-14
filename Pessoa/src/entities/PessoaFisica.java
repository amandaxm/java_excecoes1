package entities;

public class PessoaFisica extends Pessoa {

	private Double gastoSaude;

	public PessoaFisica() {
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double valorImposto() {

		if (super.getRendaAnual() < 20000) {

			return (super.getRendaAnual() * 0.15) - (gastoSaude * 0.5);
		} else {

			return (super.getRendaAnual() * 0.25) - (gastoSaude * 0.5);
		}

	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

}
