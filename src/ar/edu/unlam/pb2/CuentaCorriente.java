package ar.edu.unlam.pb2;

public class CuentaCorriente extends Cuenta2{

	@Override
	public void extraer(Double cantidad){
		
		Double limite=1000.0;
		
		if((saldo+limite)>cantidad){
			saldo-=cantidad;	
			if(saldo<0){
				saldo-=(-saldo*5/100);
			}
		}
			
		
		
		
	}

	
}
