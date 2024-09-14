package ejerciciosTema2.ejercicio3;

public class Lanzador {
	public static void main (String[] args){
		
//		Se establece la cantidad de sumadores que se van a utilizar (n_sum se establece en 10).
			
		int n_sum = 10;
		
//		Se crea un objeto Contenedor, que aparentemente se 
//		utiliza para almacenar el resultado acumulado de las sumas realizadas por los hilos.
		
		Contenedor cont= new Contenedor();
		
//		Se declara un array de objetos Sumador llamado sumadores, pero no se inicializa.
		
		Sumador sumadores[];
		
//		Se inicializa el array sumadores con una longitud igual a n_sum
		
		sumadores = new Sumador[n_sum];
		
//		Se muestra un mensaje indicando que el programa está en ejecución.
		
		System.out.println("Ejecutandose. El resultado tarda en salir.");
		
//		Se utiliza un bucle for para crear y ejecutar 10 hilos Sumador
		
		for (int i= 0; i < n_sum; i++) {
			sumadores[i] = new Sumador(100000000,cont);
			sumadores[i].start();
//			A cada hilo se le pasa como argumento la cantidad de números que se 
//			sumarán y el objeto Contenedor. Los hilos Sumador se inician con el método start().
		}

//		Otro bucle for se utiliza para esperar a que todos 
//		los hilos Sumador terminen su ejecución utilizando el método join().
		
		for (int i= 0; i < n_sum; i++) {
			try {
				sumadores[i].join();
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		}
		
//		Después de que todos los hilos hayan terminado, 
//		se imprime el valor acumulado en el objeto Contenedor.
		
		System.out.println ("Acumulador: " + cont.variable);
	}
}
