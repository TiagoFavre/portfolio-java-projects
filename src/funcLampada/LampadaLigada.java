package funcLampada;

public class LampadaLigada extends LampadaEstado {
	
	 public void ligar(Lampada lampada) throws LampadaEstadoInvalidoException {
	        throw new LampadaEstadoInvalidoException("A lampada ja esta ligada.");
	    }

	    @Override
	    public void desligar(Lampada lampada) {
	        System.out.println("Desligando a lampada");
	        lampada.setEstadoLampada(new LampadaDesligada());
	    }

	    public void acaoLigada() {
	        System.out.println("Realizando acao quando a lampada está ligada...");
	    }
	}