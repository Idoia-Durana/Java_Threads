package ejerciciosTema2.ejercicio1;

//se van a lanzar 5 hilos, cada uno de ellos va a tardar entre 5 y 10 
//segundos en ejercutarse (Thread.sleep)
//Se lanzará uno detrás de otro, cuando acabe el 1 se lanza el 2 etc etc.

public class Hilo extends Thread{
//	cada instancia de Hilo puede ejecutarse como un hilo independiente.
	
	String nombre;
//	Se declara una variable de instancia llamada nombre, 
//	que almacenará el nombre del hilo.
	
	public Hilo(String nombre) {
		this.nombre=nombre;
//	Se define un constructor para la clase Hilo que 
//toma un parámetro nombre y lo asigna a la variable de instancia nombre.
	}
	
	public void run() {
//Se sobrescribe el método run() de la clase Thread. 
//Este método contiene el código que se ejecutará cuando se inicie el hilo.
		
		System.out.println("El hilo "+ this.nombre + "arranca.");
		long tiempo=(long)(Math.random()*5000)+5000;
		
//		Se genera un tiempo de espera aleatorio entre 5 y 10 segundos
//		(en milisegundos) utilizando la función Math.random().
//		Este tiempo se almacena en la variable tiempo.
		
		try {
			
			Thread.sleep(tiempo);
			
//		Se utiliza Thread.sleep(tiempo) para hacer que el hilo duerma durante 
//			el tiempo especificado. Esto simula algún tipo de tarea que el hilo
//			está realizando.
			
		}catch(InterruptedException e) {
			
//		Si el hilo es interrumpido mientras está dormido, se captura
//			la excepción InterruptedException, pero no se realiza ninguna acción específica.
		}
		System.out.println("El hilo " + this.nombre + "termina.");
	}
}

//Después de que el hilo despierta, se imprime otro mensaje 
//que indica que el hilo ha terminado, mostrando nuevamente el nombre del hilo.

