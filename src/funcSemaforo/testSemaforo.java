package funcSemaforo;

public class testSemaforo {
	
	public static void main(String[] args) {

		Semaforo semaforo = new Semaforo();
		
		//Exibir sinal inicial
		semaforo.exibirSinal();
		
		//Alterar sinal
		semaforo.mudarSinal();
		
		//Exine novo sinal
		semaforo.exibirSinal();
		
		//Alterar sinal do veiculo
		semaforo.getVeiculo().setSinal("AMARELO");
		
		//Alterar sinal do pedestre
		semaforo.getPedestre().setSinal("VERMELHO");
		
		//Alterar sinal do retorno veiculo
		semaforo.getSinalRetornoVeiculo().setSinal("AMARELO");
		
		//Exibe novo sinal
		semaforo.exibirSinal();

	}

}

