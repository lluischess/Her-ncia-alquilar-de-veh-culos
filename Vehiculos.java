package fitxersuf5;



// Clase vehicles es la clase Pare de totes.
public class Vehiculos {
	// Atributs
	private static double Precio_alquiler = 50;
	private String Matricula;
		
	// Constructor 
	public Vehiculos (double Precio_alquiler,String Matricula) {
		this.Precio_alquiler = Precio_alquiler;
		this.Matricula = Matricula;
	}
public double calcularprecio(int dias){
		double suma = 0;
		suma = dias * Precio_alquiler;
		return suma;
	}
	// Gets
	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	public double getPrecio_alquiler(){
		return Precio_alquiler;
	}
	// Sets
	 public void setPrecio_alquiler(double Precio_alquiler){
	        this.Precio_alquiler=Precio_alquiler;
	    }
	 
	
}
