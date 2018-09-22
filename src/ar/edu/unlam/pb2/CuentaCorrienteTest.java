package ar.edu.unlam.pb2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CuentaCorrienteTest {
	
	@Test
	public void DepositarEnCuenta(){
		CuentaCorriente nuevaCuenta = new CuentaCorriente();
		nuevaCuenta.depositar(500.0);
		Double valorEsperado = 500.0;
		assertEquals(valorEsperado, nuevaCuenta.consultarSaldo());
		System.out.println(nuevaCuenta.consultarSaldo());
		
	}
	
	@Test
	public void ExtraerEnCuenta(){
		CuentaCorriente nuevaCuenta = new CuentaCorriente();
		nuevaCuenta.extraer(100.0);
		Double valorEsperado = -105.0;
		assertEquals(valorEsperado, nuevaCuenta.consultarSaldo());
		System.out.println(nuevaCuenta.consultarSaldo());
		
	}
	
	@Test
	public void DepositarEnCajaAhorro(){
		CajaAhorro nuevaCuenta = new CajaAhorro();
		nuevaCuenta.depositar(100.0);
		Double valorEsperado = 100.0;
		assertEquals(valorEsperado, nuevaCuenta.consultarSaldo());
		System.out.println(nuevaCuenta.consultarSaldo());
		
	}
	
	@Test
	public void ExtraerEnCajaAhorro(){
		CajaAhorro nuevaCuenta = new CajaAhorro();
		nuevaCuenta.depositar(100.0);
		nuevaCuenta.extraer(100.0);
		Double valorEsperado = 0.0;
		assertEquals(valorEsperado, nuevaCuenta.consultarSaldo());
		System.out.println(nuevaCuenta.consultarSaldo());
		
	}
	
	@Test
	public void Extraer5EnCajaAhorro(){
		CajaAhorro nuevaCuenta = new CajaAhorro();
		nuevaCuenta.depositar(1000.0);
		nuevaCuenta.extraer(100.0);
		nuevaCuenta.extraer(100.0);
		nuevaCuenta.extraer(100.0);
		nuevaCuenta.extraer(100.0);
		nuevaCuenta.extraer(100.0);
		Double valorEsperado = 494.0;
		assertEquals(valorEsperado, nuevaCuenta.consultarSaldo());
		
	}
}

