package hilos.ejemplo8;

public class DosMutex extends Thread{
	//Lamamos mutex a semáforos de un único recurso. 
	//La clase Object tiene como atributo un semáforo de 1 único recurso, así que
	//utilizamos dicha clase para realizar la sincronización del código
	private Object mutex1 = new Object();
	private Object mutex2 = new Object();
	public void inc1() {
		synchronized(mutex1) {
			GlobalVar.c1++;
		}
	}
	public void inc2() {
		synchronized(mutex2) {
			GlobalVar.c2++;
		}
	}
	public void run()
	{
		inc1();
		inc2();
	}
}