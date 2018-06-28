package fitxersuf5;

public class Vehiculostransporte extends Vehiculos {

	private static int plazas;
	
	//Constructor
	
	public Vehiculostransporte(double Precio_alquiler,String Matricula, int plazas){
		//Super es porque lo hereda del padre (Vehiculos)
        super(Precio_alquiler,Matricula);
        this.plazas = plazas;
        
    }

	public static int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	
	
	
	
}
