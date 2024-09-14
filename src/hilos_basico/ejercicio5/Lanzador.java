package ejerciciosTema2.ejercicio5;

import java.util.Scanner;

public class Lanzador {

	public static void main(String[] args) {
		
//		Se crea un array de objetos Thread llamado hilos con una longitud de 10.
		
		Thread[] hilos = new Thread[10];
		
//		Se utiliza un bucle for para iterar sobre cada elemento del array hilos.
//			Se crea un nuevo objeto Hilo con un identificador único (convertido a cadena).
//			Se crea un nuevo objeto Thread pasando el objeto Hilo como argumento al constructor de Thread. Esto se hace para que cada Hilo se ejecute en su propio hilo de ejecución.
//			El objeto Thread se coloca en la posición correspondiente del array hilos.
		
		
		for(int i=0;i<hilos.length;i++) {
			Hilo h1= new Hilo(String.valueOf(i));
			Thread th= new Thread(h1);
			hilos[i]=th;
		}
//		Otro bucle for se utiliza para iniciar cada hilo en el array hilos utilizando el método start(). 
//		Esto comienza la ejecución de cada hilo.
		
		for(int i=0;i<hilos.length;i++) {
			hilos[i].start();
		}
		
//		Luego, hay un bucle anidado que se ejecuta 10 veces.
//			Dentro de este bucle anidado, se itera sobre cada hilo en el array hilos y se llama al método interrupt() en cada uno de ellos. Esto interrumpirá los hilos.
//			Después de interrumpir los hilos, el programa espera 1000 milisegundos (1 segundo) utilizando Thread.sleep(1000).
		
		for(int j=0;j<10;j++) {
			
			for(int i=0;i<hilos.length;i++) {
				
				hilos[i].interrupt();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}
