package funcLampada;

public abstract class LampadaEstado {
	public abstract void ligar(Lampada lampada) throws LampadaEstadoInvalidoException;
	public abstract void desligar(Lampada lampada) throws LampadaEstadoInvalidoException;

}