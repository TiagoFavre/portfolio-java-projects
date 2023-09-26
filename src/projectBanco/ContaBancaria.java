package projectBanco;

public class ContaBancaria {
	
	private int numero;
	private String agencia;
	private String nomeCliente;
	private double saldo;
	
	public ContaBancaria(int numero, String agencia, String nomeCliente, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
		   saldo += valor;
		   System.out.println("Deposito de " + valor + " realizado com sucesso.");
		}else {
			System.out.println("Valor do deposito invalido.");
		}
	}
	
	public void sacar(double valor) throws SaldoInsuficienteException{
		if(valor > 0 && valor <= saldo) {
			saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
		}else {
			throw new SaldoInsuficienteException("Valor de saque invalido");
		
		}
	}

	public int getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}
}