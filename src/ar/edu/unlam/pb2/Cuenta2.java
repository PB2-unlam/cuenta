package ar.edu.unlam.pb2;

public abstract class Cuenta2 {
	
	protected Long nrocuenta;
	protected Double saldo=0.0;
	protected Double cantidad;
	
	public void depositar(Double cantidad){
		if(cantidad>0){
			saldo+=cantidad;
		}
	}
	
	public abstract void extraer(Double cantidad);
	
	public Double consultarSaldo(){
		return saldo;
	}

	public Long getNrocuenta() {
		return nrocuenta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	

}
