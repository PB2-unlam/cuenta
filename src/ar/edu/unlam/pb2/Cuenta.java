package ar.edu.unlam.pb2;

public class Cuenta {

	private String titular;
	private Double saldo;
	
	public Cuenta(String titular, Double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public Cuenta(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void depositar(Double cantidad){
		if(cantidad>0){
			saldo+=cantidad;
		}
	}
	
	public void retirar(Double cantidad){
		if(saldo>cantidad){
			saldo-=cantidad;
		}
	}
	
}
