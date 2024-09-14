package hilos.ejemplo6;

import java.util.concurrent.Semaphore;

public class Ejemplo6 {


	private static Sumador sumadores[];
	private static Semaphore semaphore = new Semaphore(1);

	public static void main (String[] args){
		int n_sum = Integer.parseInt (args[0]);
		sumadores = new Sumador[n_sum];
		for (int i= 0; i < n_sum; i++) {
			//Pasamos el mismo semáforo a todos los hilos que ejecutemos
			sumadores[i] = new Sumador(100000000,i, semaphore);
			sumadores[i].start();
		}

		for (int i= 0; i < n_sum; i++) {
			try {
				//Esperamos a que todos los sumadores hagan su trabajo
				sumadores[i].join();
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		}

		System.out.println ("Acumulador: " + Acumula.acumulador);
	}
}
