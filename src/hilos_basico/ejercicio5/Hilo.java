package ejerciciosTema2.ejercicio5;


public class Hilo implements Runnable {
	
//	Define una clase llamada Hilo que implementa la interfaz Runnable, 
//	lo que significa que esta clase puede ser ejecutada como un hilo.
	
	String nombre;
	int vez, interrupciones=0;
	public Hilo(String nombre) {
		this.nombre=nombre;
	}
	
//	El constructor de la clase toma un parámetro
//	nombre y lo asigna al atributo nombre de la clase.
	
	public void run() {
		
//		Este método es parte de la interfaz Runnable 
//		y contiene el código que será ejecutado cuando el hilo inicie.
		
		System.out.println("El hilo " + this.nombre + " arranca.");
		
//		Imprime un mensaje indicando que el hilo ha comenzado.
		
		while(interrupciones<10) {
			vez++;
			long tiempo=(long)(1000);
			try {
				Thread.sleep(tiempo);
				System.out.println("Hilo " + nombre + " vez " + vez);
			} catch (InterruptedException e) {
				interrupciones++;
				System.out.println("Hilo interrumpido por vez " + interrupciones);
			}
		}
//		Este bucle se ejecuta mientras el número de interrupciones sea menor que 10.
//		Incrementa la variable vez en cada iteración.
//		Llama al método Thread.sleep(tiempo) para hacer que el hilo duerma durante 
//		1000 milisegundos (1 segundo).
//		Si el hilo es interrumpido mientras está dormido, incrementa la variable 
//		interrupciones y muestra un mensaje indicando que el hilo fue interrumpido.
//		
	System.out.println("El hilo " + this.nombre + " termina.");
	}
}

// 		Imprime un mensaje indicando que el hilo ha terminado.