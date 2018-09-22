package ar.edu.unlam.pb2;

public class CajaAhorro extends Cuenta2{
	int cont=1;
	
	@Override
	public void extraer(Double cantidad){
		
		if(saldo>=cantidad){
			if(cont>4){
				saldo-=(cantidad+6);
			}else {
				cont++;
				saldo-=cantidad;
			}
			
		}
		
	}
}
