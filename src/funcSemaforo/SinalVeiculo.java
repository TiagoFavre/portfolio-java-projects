package funcSemaforo;

public class SinalVeiculo {
	
private String sinal;
	
	public SinalVeiculo() {
		this.sinal = "VERMELHO";
		
	}
	
	public String getSinal() {
		return sinal;
	}

	public void setSinal(String sinal) {
		this.sinal = sinal;
	}
	
	public void exibirSinal() {
		 System.out.println("Sinal para veiculos: " + sinal);
	
	}
	
	public void alterarSinal() {
		if(sinal.equals("VERMELHO")) {
			sinal = "VERDE";
		}else {
			sinal = "VERMELHO";
		}
	}
}

