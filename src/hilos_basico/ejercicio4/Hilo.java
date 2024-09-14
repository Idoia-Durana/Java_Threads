package ejerciciosTema2.ejercicio4;

public class Hilo extends Thread{
	String nombre;
	int vez;
	public Hilo(String nombre) {
		this.nombre=nombre;
	}
//	La clase Hilo tiene tres variables de instancia:
//		nombre: Una cadena que almacena el nombre del hilo.
//		vez: Un entero que almacena el número de veces que se ha ejecutado el hilo.
//		La clase tiene un constructor que toma un parámetro nombre para inicializar el nombre del hilo.
	
	
	public void run() {
		
//		El método run(), que es el método principal de ejecución del hilo, realiza lo siguiente:
//		Imprime un mensaje indicando que el hilo está arrancando, mostrando el nombre del hilo.
		
		System.out.println("El hilo " + this.nombre + " arranca.");
		
//		En cada iteración del bucle:
//			Genera un valor de tiempo aleatorio utilizando Math.random() y lo multiplica por 1000 para obtener un número entre 0 y 1000 milisegundos.
//			Utiliza Thread.sleep(tiempo) para hacer que el hilo espere durante el tiempo especificado. Esto simula una operación que toma un tiempo variable.
//			Imprime un mensaje que indica el nombre del hilo y el número de vez que se está ejecutando.
		
		for(int i=0;i<10;i++) {
			
			long tiempo=(long)(Math.random()*1000);
			try {
				Thread.sleep(tiempo);
				System.out.println("Hilo " + nombre + " vez " + i);
				
//			Después de completar el bucle, imprime un mensaje indicando que el hilo ha terminado, mostrando el nombre del hilo.
			} catch (InterruptedException e) {
			}
		}
		
	System.out.println("El hilo " + this.nombre + " termina.");
	}
}
