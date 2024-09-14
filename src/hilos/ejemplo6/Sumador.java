package hilos.ejemplo6;

import java.util.concurrent.Semaphore;

class Acumula {
	public static int acumulador = 0;
}

public class Sumador extends Thread {

	private int cuenta;
	private Semaphore sem;

	Sumador(int hasta, int id, Semaphore sem) {
		this.cuenta = hasta;
		this.sem = sem;
	}

	public void sumar (){
		Acumula.acumulador++;
	}

	public void run() {

		for (int i=0; i< cuenta; i++){
			try {
				sem.acquire();
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
			sumar(); 
			sem.release();
		}
	}
}
