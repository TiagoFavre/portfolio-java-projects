package funcSemaforo;

public class Semaforo {
	
	private SinalVeiculo veiculo;
	private SinalPedestre pedestre;
	private SinalRetorno sinalRetornoVeiculo;
	
	public Semaforo() {
		this.veiculo = new SinalVeiculo();
		this.pedestre = new SinalPedestre();
		this.sinalRetornoVeiculo = new SinalRetorno();
	}
	
	public void exibirSinal() {
		veiculo.exibirSinal();
		pedestre.exibirSinal();
		sinalRetornoVeiculo.exibirSinal();
	}

	public void mudarSinal() {
		veiculo.alterarSinal();
		pedestre.alterarSinal();
		sinalRetornoVeiculo.alterarSinal();
	}

	public SinalVeiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(SinalVeiculo veiculo) {
		this.veiculo = veiculo;
	}

	public SinalPedestre getPedestre() {
		return pedestre;
	}

	public void setPedestre(SinalPedestre pedestre) {
		this.pedestre = pedestre;
	}

	public SinalRetorno getSinalRetornoVeiculo() {
		return sinalRetornoVeiculo;
	}

	public void setSinalRetornoVeiculo(SinalRetorno sinalRetornoVeiculo) {
		this.sinalRetornoVeiculo = sinalRetornoVeiculo;
	}
	}	
