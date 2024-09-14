package hilos.ejemplo7;


import java.util.concurrent.Semaphore;

public class Coche implements Runnable{
	Semaphore sem;
	int num;
	public Coche(Semaphore sem, int num) {
		super();
		this.sem = sem;
		this.num = num;
	}
	@Override
	public void run() {
		while(true) {
			try {
				int aleatorio=(int)(Math.random()*5000);
				System.out.println("El coche " + num + " recorre la ciudad " + aleatorio + "ms.");
				Thread.sleep(aleatorio);
				System.out.println("El coche " + num + " intenta entrar al parking.");
				//queuelength nos dice los hilos esperando a un semaforo
				System.out.println("Hay " + sem.getQueueLength() + " coches en la cola.");
				if(sem.getQueueLength()<=5) {
					//Cogemos el semaforo
					sem.acquire();
					aleatorio=(int)(Math.random()*5000);
					System.out.println("El coche " + num + " entra al parking " + aleatorio + "ms.");
					Thread.sleep(aleatorio);
					//Liberamos el semaforo
					sem.release();
					System.out.println("El coche " + num + " sale al parking ");
				}else {
					System.out.println("El coche " +num+ " no entra por lo que sea.");
				}
				
			} catch (InterruptedException e) {
				
			}
		}
		
	}

}


