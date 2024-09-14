package hilos.ejemplo1;

public class LanzadorHilo {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) { // va a hacer 10 veces eso
			Hilo h1 = new Hilo(i); // va a crear 10 instancias de la clase hilo y va a ahcerlo empezar
			//Para llamar al metodo "run" del hilo utilizamos el metodo "start()"
			h1.start(); // sin este star no va a hacer nada, no llamamos al metido run en este caso, lo pusiesemos 
			//llamaria al metodo sin que fuese un hilo
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}// siempre que se haga un thread.slep tiene qeu haber un try-catch (InterruptedException)
		}	//Que un hilo sea interrumpido no quiere decir que el hilo vaya a terminar, solo va a ser interrumpido
		System.out.println("Se acaban de lanzar los hilos");

	}

}