package fitxersuf5;

public class Ccamion extends VehiculosCarga {

	double incremento_alquiler3 = 20;
	double fijo = 40;
	//Constructor
	public Ccamion(double Precio_alquiler,String Matricula, int pma, double incremento_alquiler3, double fijo){
		//Super es porque lo hereda del padre (Vehiculostransporte)
        super(Precio_alquiler,Matricula,pma);
        
    }
	
	public double calcularprecio(int dias){
		double suma = 0;
		
		suma = super.calcularprecio(dias) * VehiculosCarga.getPma() * incremento_alquiler3 + fijo;
		return suma;
	}
	public double getFijo() {
		return fijo;
	}
	public void setFijo(double fijo) {
		this.fijo = fijo;
	}
	public double getIncremento_alquiler3() {
		return incremento_alquiler3;
	}
	public void setIncremento_alquiler3(double incremento_alquiler3) {
		this.incremento_alquiler3 = incremento_alquiler3;
	}
	
}
