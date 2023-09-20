package funcSemaforo;

public class SinalRetorno {
	
private String sinal;
	
	public SinalRetorno() {
		this.sinal = "VERDE";
	}
	
	public String getSinal() {
        return sinal;
    }

    public void setSinal(String sinal) {
        this.sinal = sinal;
        
    }
	
	public void exibirSinal() {
        System.out.println("Sinal de retorno para veiculos: " + sinal);

	}
	
	public void alterarSinal() {
		if(sinal.equals("VERDE")) {
			sinal = "VERMELHO";
		}else {
			sinal = "VERDE";
		}
	}
}
