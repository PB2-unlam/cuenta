package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectanguloTest {
	
	 @Test
	 public void sePuedenCrearRectangulos(){
		 
		 Rectangulo unRectangulo = new Rectangulo(1.0,2.0);
		 assertNotNull(unRectangulo); 
		 
		 Rectangulo otroRectangulo = new Rectangulo(1.0,2.0);
		 assertNotNull(otroRectangulo); 
      }
    
	    
@Test
	public void elPerimetroDeUnRectanguloDebeSerLaSumaDeSusLados(){
	Rectangulo unRectangulo = new Rectangulo(4.0, 2.0);
    Double esperado = 12.0;
    
    Double actual = unRectangulo.calcularPerimetro();
    
    /*
      El tercer parametro es un delta. Quiere decir que solamente
      nos van a importar los primeros dos decimales para la comparacion
    */
    assertEquals(esperado, actual, 0.01); 
    
    }

@Test
	public void elAreaDeUnRectanguloDebeSerLaBasePorLaAltura(){
	
	Rectangulo unRectangulo = new Rectangulo(4.0, 2.0);
    Double esperado = 8.0;
    
    Double actual = unRectangulo.calcularArea();
  
    assertEquals(esperado, actual); 
    
    }

}