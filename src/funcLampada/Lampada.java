package funcLampada;

public class Lampada {
	
	private LampadaEstado estadoLampada;

    public Lampada() {
        this.estadoLampada = new LampadaDesligada();
    }

    public boolean isLigada() {
        return estadoLampada instanceof LampadaLigada;
    }

    public void ligar() {
        try {
            estadoLampada.ligar(this);
        } catch (LampadaEstadoInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    public void desligar() {
        try {
            estadoLampada.desligar(this);
        } catch (LampadaEstadoInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setEstadoLampada(LampadaEstado estadoLampada) {
        this.estadoLampada = estadoLampada;
    }
}

