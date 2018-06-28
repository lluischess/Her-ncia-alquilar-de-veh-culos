package fitxersuf5;

public class Tcoches extends Vehiculostransporte {

	double incremento_coche = 1.5;
	//Constructor
		public Tcoches(double Precio_alquiler,String Matricula,int plazas, double incremento_coche){
			//Super es porque lo hereda del padre (Vehiculostransporte)
	        super(Precio_alquiler,Matricula,plazas);
	    }
		public double calcularprecio(int dias){
			double suma = 0;
			
			suma = super.calcularprecio(dias) * Vehiculostransporte.getPlazas() * incremento_coche;
			return suma;
		}
		
		public double getIncremento_coche() {
			return incremento_coche;
		}
		public void setIncremento_coche(double incremento_coche) {
			this.incremento_coche = incremento_coche;
		}
		
		
		
		
}
