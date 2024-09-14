package hilos.ejemplo2;


public class Corredor extends Thread {
	String nombre;
	public Corredor(String nombre) {
		this.nombre=nombre;
	}
	public void run() { //corredor tiene tiempo total y tiempo qeu tarda en cada vuelta
		long tiempoTotal=0, tiempoVuelta=0;
		int numVuelta=0;
		System.out.println("El corredor " + this.nombre + " empieza a correr.");
		for(int i=0;i<4;i++) { //el corredor va a dar 4 vueltas 
			tiempoVuelta=(long)(Math.random()*2000)+3000;
			tiempoTotal+=tiempoVuelta;
			try { // a cada vez el hilo se va a echar a dormir el tiempo aleatorio qeu ha salido arriba
				Thread.sleep(tiempoVuelta);
			} catch (InterruptedException e) {
			}
			System.out.println("El correcor " + this.nombre + " termina la vuelta " 
					+ (i+1) + " en " + tiempoVuelta + " ms.");
		}
		System.out.println("Tiempo total corredor " + this.nombre + ": " + tiempoTotal + " ms");
	}
}//hilo principal puede esperar al resto de hilos
