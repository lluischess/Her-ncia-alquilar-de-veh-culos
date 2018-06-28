package fitxersuf5;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {

	static Scanner sc;
	// Declaramos la Array list de la clase vehiculos
	ArrayList<Vehiculos> vehiculos = new ArrayList<Vehiculos>();


	public static void main (String[] args) {
		Run programa = new Run();
		programa.inici();

	}

	public void inici(){
		int accio;

		do{
			// Menu principal
			System.out.println("Escoje entre las siguientes opciones:");
			System.out.println("1.- Carga de datos de inicio");
			System.out.println("2.- Añadir vehiculo");
			System.out.println("3.- Obtener precio de alquiler de un vehiculo concreto");
			System.out.println("0.- Salir");
			sc = new Scanner(System.in);
			try{
				accio = sc.nextInt();
			} catch(Exception e) { 
				System.out.println("Error tenis que introduir un numero");
				accio=-1;
			}	
			switch (accio)
			{
			case 1: Cargardatos(); break;

			case 2: Añadir(); break;

			case 3: Precioalquiler(); break;

			}
		}while (accio!=0);
	}



	private void Cargardatos() {
		
		Vehiculos coches =new Vehiculos(5,"rrr");
		Vehiculos coches2 =new Vehiculos(3,"ddd");
		Vehiculos coches3 =new Vehiculos(4,"ttt");
		vehiculos.add(coches);
		vehiculos.add(coches2);
		vehiculos.add(coches3);
		
		System.out.println("Dades creadas :D");
		
	}

	private void Añadir() {
		//variables usadas
		int vehiculo;
		String Matricula;
		int plazas;
		int pma;

		System.out.println("Que tipo de vehiculo vas ha añadir?");
		System.out.println("1.- Coche");
		System.out.println("2.- Microbus");
		System.out.println("3.- Furgoneta");
		System.out.println("4.- Camión");
		vehiculo = sc.nextInt();


		System.out.println("Matricula del vehiculo");
		Matricula = sc.next();


		if (vehiculo == 1 || vehiculo == 2){
			System.out.println("Numero de plazas?");
			plazas = sc.nextInt();
			//instanciar el objeto para el constructor
			Vehiculostransporte Transporte =new Vehiculostransporte(0,Matricula,plazas);
			vehiculos.add(Transporte);

		}

		if (vehiculo == 3 || vehiculo == 4){
			System.out.println("Cual es el peso maximo autorizado en toneladas?");
			pma = sc.nextInt();
			VehiculosCarga Carga = new VehiculosCarga(0,Matricula,pma);
			vehiculos.add(Carga);
		}
	}

	private void Precioalquiler() {
		String matricula;
		int i;
		int dias;
		
		System.out.println("Matricula del vehiculo?");
		matricula=sc.next();
		
		for( i=0; i< vehiculos.size();i++)
		{
			if (matricula.equalsIgnoreCase(vehiculos.get(i).getMatricula()) ){
			System.out.println(vehiculos.get(i).getMatricula().toString());
			System.out.println("Matricula Correcta");
			
			System.out.println("Quants dias de alquiler vols?");
			dias=sc.nextInt();
			
			for( i=0; i< vehiculos.size();i++)
			{
				System.out.println(vehiculos.get(i).getMatricula());
				System.out.println("Precio alquiler :");
				//Vehiculos.calcularprecio(dias); NO entenc aixo Carlas <== amb demana que el metode sigi static.
			}
			
			
			}
			
		}

	}


}
