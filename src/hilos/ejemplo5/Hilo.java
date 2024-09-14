package hilos.ejemplo5;


public class Hilo implements Runnable{
	
//	Se declara una variable de instancia llamada identificador de tipo entero.

	int identificador;
	
//	Se define un constructor que toma un parámetro identificador y asigna 
//	este valor a la variable de instancia identificador.
	
	public Hilo(int identificador) {
		this.identificador=identificador;
	}
	
//	Se implementa el método run() de la interfaz Runnable. 
//	Este método contiene el código que será ejecutado cuando el hilo sea iniciado.
	
	public void run() {
		
//		Se inicia un bucle for que se ejecutará 10 veces.
		
		for(int i=0; i<10;i++) {
			System.out.println("Hilo " + this.identificador + " ejecutándose por vez " + i);
			
//			Dentro del bucle, se imprime un mensaje en la consola que indica el número 
//			del hilo y el número de la iteración actual.
			
			try {
				Thread.sleep(1000);
				
//			Después de imprimir el mensaje, el hilo se duerme durante 1000 milisegundos (1 segundo) utilizando el método sleep() de la clase Thread. Si el hilo es interrumpido mientras está dormido, se captura la excepción 
//			InterruptedException y se imprime un mensaje indicando que el hilo ha sido interrumpido.
			
			} catch (InterruptedException e) {
				System.out.println("El hilo " + this.identificador + " ha sido interrumpido. ");
			}
		}		
	}
}