package ejerciciosTema2.ejercicio1;

import java.util.Iterator;
import java.util.Scanner;

//		Se define una clase llamada Lanzador 
//			con un método main que es el punto de entrada del programa
public class Lanzador {
	public static void main(String[] args) {
		
//		Se crea un array de Hilo con una longitud de 5. 
//		 Estos objetos Hilo serán los hilos que se ejecutarán
		Hilo[] hilos = new Hilo[5];
		for (int i = 0; i < hilos.length; i++) {
//			Dentro de un bucle for, se crea un nuevo objeto Scanner para la entrada estándar 
//			en cada iteración del bucle. Esto es ineficiente y poco habitual. 
//			Normalmente, se crea un solo objeto Scanner para toda la aplicación 
//			y se reutiliza.
			Scanner sc= new Scanner(System.in);
//			También dentro del bucle for, se crea un nuevo objeto Hilo y se le asigna un 
//				identificador único, que es simplemente el valor del iterador convertido a una cadena.

			Hilo h1 = new Hilo(String.valueOf(i));
//			Se almacena cada hilo creado en el array hilos.
			hilos[i]=h1;
//			Se itera sobre el array hilos nuevamente.
			
		}
		for (int i = 0; i < hilos.length; i++) {
//			Dentro de este segundo bucle for, se inicia cada hilo llamando al método start().
			 hilos[i].start();
			 try {
//				 Luego, se llama al método join() en cada hilo. Esto detiene la ejecución del hilo actual 
//				 (es decir, el hilo principal) hasta que el hilo al que se llama join() termine de ejecutarse.
				 hilos[i].join();
				 
//				El método join() puede lanzar una excepción InterruptedException, por lo que este 
//				 código está preparado para manejar esa excepción imprimiendo su rastreo en la pila.
			 
			 }catch(InterruptedException e) {
				 e.printStackTrace();
			 }
			
		}
	}
	
}
//En resumen, este programa crea 5 hilos, los inicia secuencialmente y espera a que cada uno de 
//ellos termine antes de pasar al siguiente. Esto asegura que los hilos se ejecuten en orden y 
//que el programa principal espere a que todos los hilos hayan terminado antes de continuar.