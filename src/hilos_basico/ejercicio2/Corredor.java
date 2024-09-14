package ejerciciosTema2.ejercicio2;

public class Corredor extends Thread {
//	Se declara una variable de instancia nombre, que almacenará el nombre del corredor, 
//	y una variable de instancia tiempo, que almacenará una referencia a un objeto de la 
//	clase Tiempo.
		String nombre;
		Tiempo tiempo;
		
//		Se define un constructor para la clase Corredor que toma dos parámetros: 
//		nombre (el nombre del corredor) 
//		y tiempo (una referencia a un objeto de la clase Tiempo). 
//		Estos parámetros se utilizan para inicializar las variables de instancia correspondientes.
		
		public Corredor(String nombre, Tiempo tiempo) {
			this.nombre=nombre;
			this.tiempo=tiempo;
		}
//		Se sobrescribe el método run() de la clase Thread. 
//		Este método contiene el código que se ejecutará cuando se inicie el hilo.
		
		public void run() {
			
//			Dentro del método run(), se inicializa una variable local tiempoVuelta a 0,
//			que almacenará el tiempo que tarda el corredor en completar una vuelta.
			
			long tiempoVuelta=0;
			System.out.println("El corredor " + this.nombre + " empieza a correr.");
//			Se imprime un mensaje que indica que el 
//			corredor ha comenzado a correr, mostrando el nombre del corredor.
			
			tiempoVuelta=(long)(Math.random()*5000)+5000;
			
//			Se genera un tiempo de vuelta aleatorio entre 5 y 10 segundos 
//			(en milisegundos) utilizando la función Math.random(). 
//			Este tiempo se almacena en la variable tiempoVuelta.
			
			this.tiempo.variable+=tiempoVuelta;
			try {
				Thread.sleep(tiempoVuelta);
			} catch (InterruptedException e) {
			
			}

			System.out.println("Tiempo total corredor " + this.nombre + ": " + tiempoVuelta + " ms");
		}
}
