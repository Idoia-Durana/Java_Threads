package ejerciciosTema2.ejercicio3;

public class Sumador extends Thread {

//	La clase Sumador tiene dos variables de instancia privadas:
//		cuenta: Un entero que representa la cantidad de veces que se realizará la suma.
//		cont: Una referencia a un objeto de la clase Contenedor. Este objeto se utilizará para almacenar el resultado acumulado de las sumas.
	
	private int cuenta;
	private Contenedor cont;

	Sumador(int hasta, Contenedor cont) {
		this.cuenta = hasta;
		this.cont=cont;
		
//	El constructor de la clase Sumador toma dos parámetros:
//		hasta: Un entero que indica la cantidad de veces que se realizará la suma.
//		cont: Un objeto de la clase Contenedor.
	}


	public void run() {

		for (int i=0; i< cuenta; i++){
			cont.sumar();
//		El método run(), que es el método principal de ejecución del hilo, realiza lo siguiente:
//			Utiliza un bucle for para iterar cuenta veces.
//			En cada iteración del bucle, invoca el método sumar() del objeto cont. 
//			Este método probablemente aumenta el valor almacenado en el Contenedor en una unidad.
		}
	}
}
