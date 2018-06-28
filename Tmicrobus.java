package fitxersuf5;

public class Tmicrobus extends Vehiculostransporte {

	double incremento_microbus = 3.5;
	//Constructor
			public Tmicrobus(double Precio_alquiler,String Matricula,int plazas,double incremento_microbus){
				//Super es porque lo hereda del padre (Vehiculostransporte)
		        super(Precio_alquiler,Matricula,plazas);
		        
		    }
			
			public double calcularprecio(int dias){
				double suma = 0;
				
				suma = super.calcularprecio(dias) * Vehiculostransporte.getPlazas() * incremento_microbus;
				return suma;
			}

			public double getIncremento_microbus() {
				return incremento_microbus;
			}

			public void setIncremento_microbus(double incremento_microbus) {
				this.incremento_microbus = incremento_microbus;
			}
			
}
