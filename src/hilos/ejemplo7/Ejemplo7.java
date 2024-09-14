package hilos.ejemplo7;


import java.util.concurrent.Semaphore;

public class Ejemplo7 {

	public static void main(String[] args) {
		//Creo un semaforo para 3 recursos
		Semaphore sem = new Semaphore(3);
		for(int i=1;i<=10;i++) {
			Coche c= new Coche(sem,i);
			Thread th= new Thread(c);
			th.start();
			th.setPriority(i);
		}

	}

}
