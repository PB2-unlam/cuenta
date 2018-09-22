package ar.edu.unlam.pb2;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class CuentaTest {

	@Test
		public void ingresarSaldoALaCuenta(){
		Cuenta nuevaCuenta = new Cuenta("Carlos", 100.0);
		nuevaCuenta.depositar(200.0);
		Double esperado = 300.0;
		assertEquals(esperado, nuevaCuenta.getSaldo());
	}
		
}
