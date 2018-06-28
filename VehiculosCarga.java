package fitxersuf5;

public class VehiculosCarga extends Vehiculos {

	private static int pma;
	public VehiculosCarga(double Precio_alquiler,String Matricula,int pma){
		//Super es porque lo hereda del padre (Vehiculos)
        super(Precio_alquiler,Matricula);
        this.pma = pma;
        
    }
	public static int getPma() {
		return pma;
	}
	public void setPma(int pma) {
		this.pma = pma;
	}
	
}
