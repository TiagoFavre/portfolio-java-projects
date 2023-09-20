package funcLampada;

public class LampadaDesligada extends LampadaEstado {

    @Override
    public void ligar(Lampada lampada) {
        System.out.println("Ligando a lampada");
        lampada.setEstadoLampada(new LampadaLigada());
    }

    @Override
    public void desligar(Lampada lampada) throws LampadaEstadoInvalidoException {
        throw new LampadaEstadoInvalidoException("A lampada ja esta desligada.");
    }
}