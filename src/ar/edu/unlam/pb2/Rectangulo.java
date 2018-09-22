package ar.edu.unlam.pb2;

public class Rectangulo {

		private Double base;
		private Double altura;
		
		public Rectangulo (Double base, Double altura){
			this.base = base;
			this.altura = altura;
		}
		
		public Double calcularArea(){
		    Double area = base*altura;
		    return area;
		}
			
		public Double calcularPerimetro(){
		    Double perimetro = (base*2)+(altura*2);
		    return perimetro;
		}

}
