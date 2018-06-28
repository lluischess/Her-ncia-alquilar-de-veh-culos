package fitxersuf5;

public class Cfurgoneta extends VehiculosCarga {
	double incremento_alquiler4 = 20;
	//Constructor
		public Cfurgoneta(double Precio_alquiler,String Matricula,int pma, double incremento_alquiler4){
			//Super es porque lo hereda del padre (Vehiculostransporte)
	        super(Precio_alquiler,Matricula, pma);
	        
	    }
		public double calcularprecio(int dias){
			double suma = 0;
			
			suma = super.calcularprecio(dias) * VehiculosCarga.getPma() * incremento_alquiler4;
			return suma;
		}
		public double getIncremento_alquiler4() {
			return incremento_alquiler4;
		}
		public void setIncremento_alquiler4(double incremento_alquiler4) {
			this.incremento_alquiler4 = incremento_alquiler4;
		}
}
