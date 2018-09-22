package ar.edu.unlam.pb2;

public class CuentaSueldo extends Cuenta2{
	@Override
	public void extraer(Double cantidad){
		if(saldo>=cantidad){
			saldo-=cantidad;
		}
		
	}
}
