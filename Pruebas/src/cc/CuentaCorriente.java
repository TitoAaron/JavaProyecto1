package cc;

public class CuentaCorriente {
	private String titular;
	private int numero;
	private double saldo;
	private double limiteCredito; //Maximo saldo permitido
	
	
	
	
	public CuentaCorriente(String titular, int numero, double saldo, double limiteCredito) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
		this.limiteCredito = limiteCredito;
	}

	public void ingresar(double ingreso) {
		if(ingreso > 0) 
			this.saldo += ingreso;
		}
	
	public boolean retirar(double retiro) {
		boolean retirado = false;
		if(retiro > 0 && (saldo - retiro) > -limiteCredito) {
			saldo -= retiro;
			retirado = true;
		}
		return retirado;
	}
	
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [titular=" + titular + ", numero=" + numero + ", saldo=" + saldo + ", limiteCredito="
				+ limiteCredito + "]";
	}


	
	
	
	
}
