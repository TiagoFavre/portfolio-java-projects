package funcSemaforo;

public class SinalPedestre {
	
private String sinal;
	
	public SinalPedestre() {
		this.sinal = "VERDE";

	}
	
	public String getSinal() {
		return sinal;
	}

	public void setSinal(String sinal) {
		this.sinal = sinal;
	}
	
	 public void exibirSinal() {
	        System.out.println("Sinal para pedestres: " + sinal);
	        
	 }
	 
	 public void alterarSinal() {
		 if(sinal.equals("VERDE")) {
			 sinal = "VERMELHO";
		 }else {
			 sinal = "VERDE";
		 }
	 }
}